package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
    	return word.substring(0,1).toUpperCase().concat(word.substring(1));
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.substring(0,1).concat(".").concat(lastName.substring(0,1));
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        return 0.0;
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
