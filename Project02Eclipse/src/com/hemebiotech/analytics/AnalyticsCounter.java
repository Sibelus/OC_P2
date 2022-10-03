package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AnalyticsCounter {
	//Initiate symptoms counter
	private static int headacheCount = 0;
	private static int rashCount = 0;
	private static int pupilCount = 0;
	
	public static void main(String args[]){
		try {
			//Read data from source file .txt
			BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
			String line = reader.readLine();
	
			//Identify and increment symptoms counter
			while (line != null) {				
				switch(line) {
					case "headache":
						headacheCount++;
						System.out.println("number of headaches: " + headacheCount);
						break;
					case "rash":
						rashCount++;
						System.out.println("number of headaches: " + rashCount);
						break;
					case "dialated pupils":
						pupilCount++;
						System.out.println("number of headaches: " + pupilCount);
						break;
					default:
						System.out.println("symptom from file: " + line);
				}
				
				// get another symptom
				line = reader.readLine();
			}
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//Write symptoms count on result.out file
			FileWriter writer = new FileWriter ("result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
