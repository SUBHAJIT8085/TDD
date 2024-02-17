package com.tdd.TDDKATA;

public class StringCalculator {
	
	
    int add(String numbers) {
    	int result = 0;
    	if(numbers.isEmpty() || numbers.isBlank()) {
    		return 0;
    	}
    	String [] arr = numbers.split(",");
    	
    	if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
		
    	else {
    		
    		for( int i=0;i< arr.length; i++) {
    			result = result + Integer.parseInt(arr[i]);
    		}
    		return result;
    	}
		
    	
    }
}
