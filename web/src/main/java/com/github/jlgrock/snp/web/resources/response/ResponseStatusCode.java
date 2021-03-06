package com.github.jlgrock.snp.web.resources.response;

/**
 * Status codes to be returned as part of a response. Valid values are:
 * <li>{@link #OK}</li>
 * <li>{@link #ZERO_RESULTS}</li>
 * <li>{@link #INVALID_REQUEST}</li>
 */
public enum ResponseStatusCode {
	/**
	 * Indicates that no errors occurred and that at least one result was returned
	 */
	OK,
	
	/**
	 * Indicates that the search was successful but returned no results
	 */
	ZERO_RESULTS,
	
	/**
	 * Generally indicates that a required query parameter is missing
	 */
	INVALID_REQUEST;
}
