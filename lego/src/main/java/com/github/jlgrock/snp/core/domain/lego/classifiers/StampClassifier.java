package com.github.jlgrock.snp.core.domain.lego.classifiers;

import com.github.jlgrock.snp.core.domain.lego.Stamp;
import org.ihtsdo.otf.tcc.api.store.TerminologyStoreDI;

/**
 *
 */
public class StampClassifier extends AbstractLegoClassifier {

    private final Stamp stamp;

    StampClassifier(final TerminologyStoreDI terminologyStoreDI, final Stamp stampIn) {
        super(terminologyStoreDI);
        stamp = stampIn;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void classify() {
        throw new UnsupportedOperationException();
    }
}
