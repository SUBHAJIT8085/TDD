package com.tdd.TDDKATA;

public class StringCalculator {

	int add(String numbers) {
		int result = 0;
		String[] arr;
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
				result = result + Integer.parseInt(arr[i]);
			}
			return result;
		}

	}
}
