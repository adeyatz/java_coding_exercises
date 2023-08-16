package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
    	return word.substring(0,1).toUpperCase().concat(word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1).concat(".").concat(lastName.substring(0,1));
    }

    public double addVat(double originalPrice, double vatRate) {
    	BigDecimal total = new BigDecimal(originalPrice * ((100 + vatRate) / 100));
    	return total.setScale(2, RoundingMode.DOWN).doubleValue();
    }

    public String reverse(String sentence) {
        // Add your code here
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
