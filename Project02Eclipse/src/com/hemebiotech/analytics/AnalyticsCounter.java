package com.hemebiotech.analytics;


import java.util.ArrayList;
import java.util.List;

public class AnalyticsCounter {

	private static final String filepath = "../symptoms.txt";

	public static void main(String args[]) throws Exception {

		List<String> result = new ReadSymptomDataFromFile(filepath).GetSymptoms();

		}
		


	}

