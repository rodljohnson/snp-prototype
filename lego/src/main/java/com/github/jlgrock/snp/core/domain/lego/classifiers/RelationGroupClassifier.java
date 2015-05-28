package com.github.jlgrock.snp.core.domain.lego.classifiers;

import com.github.jlgrock.snp.domain.data.ClassifiedPceStore;
import com.github.jlgrock.snp.core.domain.lego.model.RelationGroup;

import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;

/**
 *
 */
public class RelationGroupClassifier extends AbstractLegoClassifier {

    private final RelationGroup relationGroup;

    RelationGroupClassifier(final TerminologyStoreDI terminologyStoreDI, final ClassifiedPceStore classPceStore,
    		final RelationGroup relationGroupIn) {
        super(terminologyStoreDI, classPceStore);
        relationGroup = relationGroupIn;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void classify() {
        throw new UnsupportedOperationException();
    }
}
