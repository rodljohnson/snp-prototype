package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.MedicationAdministration;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class MedicationAdministrationProcessor extends AbstractFhirProcessor {

    @Inject
    public MedicationAdministrationProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        MedicationAdministration medicationAdministration = (MedicationAdministration) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return MedicationAdministration.class;
    }
}
