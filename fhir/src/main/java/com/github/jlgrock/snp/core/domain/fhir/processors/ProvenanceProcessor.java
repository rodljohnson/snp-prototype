package com.github.jlgrock.snp.core.domain.fhir.processors;

import com.github.jlgrock.snp.apis.classifier.LogicGraphClassifier;
import com.github.jlgrock.snp.core.domain.fhir.model.Provenance;
import gov.vha.isaac.logic.LogicGraph;

/**
 *
 */
public class ProvenanceProcessor extends AbstractFhirProcessor {

    private final Provenance provenance;

    public ProvenanceProcessor(final LogicGraphClassifier logicGraphClassifierIn, final Provenance provenanceIn) {
        super(logicGraphClassifierIn);
        provenance = provenanceIn;
    }

    @Override
    protected LogicGraph getLogicGraph() {
        throw new UnsupportedOperationException();
    }

	@Override
	public void process() {
		throw new UnsupportedOperationException();
		
	}
}
