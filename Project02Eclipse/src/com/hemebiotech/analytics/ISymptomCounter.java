package com.hemebiotech.analytics;

import java.util.Map;


/**
 * Anything that will identify all symptoms data and count their occurences from an unordered list
 * The important part is, the return value from the operation, which is a map that contain strings for key and integer for value 
 */
public interface ISymptomCounter {
	
	/**
	 * @return a sortedMap of all symptoms and their counted occurences
	 */
	Map<String, Integer> countData();
}
