package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
    	return word.substring(0,1).toUpperCase()
    			.concat(word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1)
        		.concat(".")
        		.concat(lastName.substring(0,1));
    }

    public double addVat(double originalPrice, double vatRate) {
    	BigDecimal total = new BigDecimal(originalPrice * ((100 + vatRate) / 100));
    	return total.setScale(2, RoundingMode.DOWN).doubleValue();
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
    	int linuxUsers = 0;
    	
    	for (User u : users)
    	{
    		if (u.getType().compareTo("Linux") == 0)
    			linuxUsers++;
    	}
    	return linuxUsers;	
    	
    }
}
