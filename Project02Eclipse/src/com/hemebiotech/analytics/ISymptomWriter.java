package com.hemebiotech.analytics;

import java.io.FileWriter;

/**
 * Anything that will write all content of a Map (keys and values) into a file
 */
public interface ISymptomWriter {
	/**
	 * @Write symptoms count into result.out file
	 */
	FileWriter writeData();
}
