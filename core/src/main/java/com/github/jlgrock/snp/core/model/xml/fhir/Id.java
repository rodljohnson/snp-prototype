package com.github.jlgrock.snp.core.model.xml.fhir;

import com.google.common.base.MoreObjects;

/**
 * The Id class represents the id element in the FHIR XML document.
 *
 */
public class Id {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(final String pValue) {
		value = pValue;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
		.add("value", value)
		.toString();
	}
	
}
