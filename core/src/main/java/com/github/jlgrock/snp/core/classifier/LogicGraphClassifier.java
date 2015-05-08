package com.github.jlgrock.snp.core.classifier;

import org.jvnet.hk2.annotations.Contract;

import java.util.UUID;

/**
 * Classify Post Coordinated Expressions
 *
 * @param <T> the type of PCE to classify.  This will be specific to each type of input
 */
@Contract
public interface LogicGraphClassifier<T> {

	/**
	 * replace Post Coordinated Expressions with a classifier ID
	 * 
	 * @param pce Post Coordinated Expression
	 * @return UUID UUID
	 */
	UUID classify(T pce);
}
