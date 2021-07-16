package com.hemebiotech.analytics;


import java.util.List;

public class AnalyticsCounter {

	private static final String filepath = "Project02Eclipse/symptoms.txt";

	public static void main(String args[]) throws Exception {

		List<String> result = new ReadSymptomDataFromFile(filepath).GetSymptoms();
		List<String> result2 = new FilterSymptomsData(result).FilterSymptoms();
		new WriteSymptomData(result2).WriteFile();


	}
	}

