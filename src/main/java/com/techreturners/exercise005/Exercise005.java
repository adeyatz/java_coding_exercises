package com.techreturners.exercise005;

public class Exercise005 {

	private final String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
    public boolean isPangram(String input) {

    	if (input == null)
    		return false;
    	
    	boolean result = true;
    	String stringToCompare = input.toUpperCase();
    	
    	for (char character : alphabet.toCharArray()) {
    		
    		if (stringToCompare.indexOf(character) == -1) {
    			result = false;
    			break;
    		}
    	}
    	
    	return result;
    }

}
