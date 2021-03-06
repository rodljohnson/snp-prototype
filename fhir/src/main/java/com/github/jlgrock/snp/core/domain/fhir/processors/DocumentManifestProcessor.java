package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.DocumentManifest;
import org.jvnet.hk2.annotations.Service;

import javax.inject.Inject;

@Service
public class DocumentManifestProcessor extends AbstractFhirProcessor {

    @Inject
    public DocumentManifestProcessor(final LogicGraphClassifier logicGraphClassifierIn) {
        super(logicGraphClassifierIn);
    }

	@Override
	public void process(final String identifier, final Object unmarshalledObject) {
        DocumentManifest documentManifest = (DocumentManifest) unmarshalledObject;
		throw new UnsupportedOperationException();
	}

    @Override
    public Class processesType() {
        return DocumentManifest.class;
    }

}
