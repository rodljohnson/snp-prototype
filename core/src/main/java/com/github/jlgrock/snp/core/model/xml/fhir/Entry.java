package com.github.jlgrock.snp.core.model.xml.fhir;

import com.google.common.base.MoreObjects;

/**
 * The Entry class represents the entry element in the FHIR XML document.
 *
 */
public class Entry {
	private Resource resource;

	public Resource getResource() {
		return resource;
	}

	public void setResource(final Resource pResource) {
		resource = pResource;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
		.add("resource", resource)
		.toString();
	}
	
}
