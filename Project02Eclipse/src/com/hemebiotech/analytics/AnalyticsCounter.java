package com.hemebiotech.analytics;


import java.io.IOException;
import java.util.List;
import java.util.Map;



public class AnalyticsCounter {

	
	public static void main(String args[]) throws IOException {
		
		//Read symptoms from symptoms.txt -------
		ISymptomReader myReader = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> rawData = myReader.GetSymptoms();
		//---------------------------------------
		
		
		//Count symptoms from rawData -----------
		ISymptomCounter myCounter = new CountSymptomFromList(rawData);
		Map<String, Integer> countedDataMap = myCounter.countData();
		//---------------------------------------
		
		
		//Write data into result.out file -------
		ISymptomWriter myWriter = new WriteDataFromMap(countedDataMap);
		myWriter.writeData();
		//---------------------------------------

	}
}
