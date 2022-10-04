package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class CountSymptomFromList implements ISymptomCounter {
	
	private List<String> rawDataList;
	
	/**
	 * @param An ArrayList that contain all symptoms with possible multiple occurences
	 */
	public CountSymptomFromList (List<String> rawData) {
	this.rawDataList = rawData;
	}
	
	@Override
	public Map<String, Integer> countData() {
		Map<String, Integer> countedData = new TreeMap<String, Integer>();
		String currentSymptom;
		
		for(int i=0; i<rawDataList.size(); i++){
			currentSymptom = rawDataList.get(i);
			
			if(countedData.get(currentSymptom)!= null) {
				countedData.put(currentSymptom, countedData.get(currentSymptom)+1);
			}else {
			countedData.put(rawDataList.get(i), 1);
			}	
		}
		//Debug ---------------------------------
		System.out.println("countedData -> " + countedData);
		//---------------------------------------
		
		return countedData;
	}
}
