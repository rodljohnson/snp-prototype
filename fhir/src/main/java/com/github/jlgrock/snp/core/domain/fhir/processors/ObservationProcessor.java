package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.logicgraph.FhirCodeableConceptGraphBuilder;
import com.github.jlgrock.snp.core.domain.fhir.model.CodeableConcept;
import com.github.jlgrock.snp.core.domain.fhir.model.Observation;
import com.github.jlgrock.snp.domain.data.ClassifiedPceRepository;
import com.github.jlgrock.snp.domain.data.EncounterRepository;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class ObservationProcessor extends AbstractFhirProcessor {
    final FhirCodeableConceptGraphBuilder fhirCodeableConceptGraphBuilder;
    final ClassifiedPceRepository classifiedPceRepository;
    final EncounterRepository encounterRepository;

    @Inject
    public ObservationProcessor(final LogicGraphClassifier logicGraphClassifierIn,
                                final FhirCodeableConceptGraphBuilder fhirCodeableConceptGraphBuilderIn,
                                final ClassifiedPceRepository classifiedPceRepositoryIn,
                                final EncounterRepository encounterRepositoryIn) {
        super(logicGraphClassifierIn);
        fhirCodeableConceptGraphBuilder = fhirCodeableConceptGraphBuilderIn;
        classifiedPceRepository = classifiedPceRepositoryIn;
        encounterRepository = encounterRepositoryIn;
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        Observation observation = (Observation) unmarshalledObject;
        String encounterReference = observation.getSubject().getReference().getValue();

		CodeableConcept observableConcept = observation.getName();
        CodeableConcept provenanceConcept = observation.getBodySite();
        CodeableConcept valueConcept = observation.getValueCodeableConcept();

        saveConceptToEncounter(
                fhirCodeableConceptGraphBuilder,
                classifiedPceRepository,
                encounterRepository,
                encounterReference,
                identifier,
                observableConcept,
                provenanceConcept,
                valueConcept
        );
	}

    @Override
    public Class processesType() {
        return Observation.class;
    }
}
