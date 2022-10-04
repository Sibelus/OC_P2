package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteDataFromMap implements ISymptomWriter{

	private Map<String, Integer> countedDataMap;


	public WriteDataFromMap (Map<String, Integer> countedDataMap) {
		this.countedDataMap = countedDataMap;
	}
	
	@Override
	public FileWriter writeData() {
		try {
			//Write symptoms count on result.out file
			FileWriter writer = new FileWriter ("result.out");
			for(Map.Entry<String, Integer> entry : countedDataMap.entrySet()) {
				writer.write(entry.getKey() +" = "+entry.getValue() + "\n");
				
				//Debug ---------------------------------
				System.out.println(entry.getKey() +" = "+entry.getValue());
				//---------------------------------------
			}
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
