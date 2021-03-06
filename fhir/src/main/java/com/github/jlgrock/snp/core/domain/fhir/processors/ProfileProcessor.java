package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.Profile;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class ProfileProcessor extends AbstractFhirProcessor {

    @Inject
    public ProfileProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        Profile profile = (Profile) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return Profile.class;
    }
}
