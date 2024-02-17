package com.tdd.TDDKATA;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

	int add(String numbers) {
		int result = 0;
		String[] arr;
		
		Pattern pattern = Pattern.compile("-\\d");
		Matcher match = pattern.matcher(numbers);
		if(match.find()) {
			throw new RuntimeException("ENter a string that contains negative integer");
		}
		if (numbers.isEmpty() || numbers.isBlank()) {
			return 0;
		}
		
		/*if (numbers.contains("\n")) {
			String numberWONewLIne= numbers.replace("\n", "");
			System.out.println(numbers);
			arr = numberWONewLIne.split(",");
		}
		else {*/
		 arr = numbers.split(",");
		//}

		
		if (arr.length == 1) {
			return Integer.parseInt(arr[0]);
		}

		else {

			for (int i = 0; i < arr.length; i++) {
				if(arr[i].contains("\n")) {
					arr[i] = arr[i].replace("\n", "");
					if(arr[i].isEmpty() || arr[i].isBlank()) {

						throw new RuntimeException("Invalid Input");

						

					}
					
				}
				else if(numbers.contains("\\;")) {
					arr[i] = arr[i].replace("\n", "");
				}
				result = result + Integer.parseInt(arr[i]);
			}
			return result;
		}

	}
}
