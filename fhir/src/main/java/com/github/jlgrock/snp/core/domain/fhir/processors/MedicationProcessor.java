package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.Medication;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class MedicationProcessor extends AbstractFhirProcessor {

    @Inject
    public MedicationProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        Medication medication = (Medication) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return Medication.class;
    }
}
