package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Use of a treeMap to store and count every symptoms (=> key) and their occurences (=> value)
 */
public class CountSymptomFromList implements ISymptomCounter {
	
	private List<String> rawDataList;
	
	/**
	 * @param A List<String> that contain all symptoms with possible multiple occurences
	 */
	public CountSymptomFromList (List<String> rawData) {
	this.rawDataList = rawData;
	}
	
	@Override
	public Map<String, Integer> countData() {
		Map<String, Integer> countedData = new TreeMap<String, Integer>();

		
		for(String currentSymptom : rawDataList){
			
			if(countedData.get(currentSymptom)!= null) {
				countedData.put(currentSymptom, countedData.get(currentSymptom)+1);
			} else {
				countedData.put(currentSymptom, 1);
			}	
		}
		//Debug ---------------------------------
		System.out.println("countedData -> " + countedData);
		//---------------------------------------
		
		return countedData;
	}
}
