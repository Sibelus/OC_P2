package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;



public class AnalyticsCounter {

	
	public static void main(String args[]) throws IOException {
		
		ISymptomReader myReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> rawData = myReader.GetSymptoms();
		
		
		ISymptomCounter myCounter = new CountSymptomFromList(rawData);
		Map<String, Integer> countedDataMap = myCounter.countData();
		
		
		ISymptomWriter myWriter = new WriteDataFromMap(countedDataMap);
		myWriter.writeData();

	}
}
