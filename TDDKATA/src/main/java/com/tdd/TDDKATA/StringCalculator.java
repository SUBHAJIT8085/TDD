package com.tdd.TDDKATA;

public class StringCalculator {
	
	
    int add(String numbers) {
    	int result = 0;
    	if(numbers.isEmpty() || numbers.isBlank()) {
    		return 0;
    	}
		
    	else {
    		String [] arr = numbers.split(",");
    		for( int i=0;i< arr.length; i++) {
    			result = result + Integer.parseInt(arr[i]);
    		}
    		return result;
    	}
		
    	
    }
}
