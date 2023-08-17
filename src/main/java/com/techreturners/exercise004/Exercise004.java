package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
	
	private LocalDateTime dateTime;
	private final long oneGigaSecond = 1000000000;


    public Exercise004(LocalDate date) {
        this.dateTime = date.atStartOfDay();
        addTimeInSeconds(oneGigaSecond);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.dateTime = dateTime;
        addTimeInSeconds(oneGigaSecond);
    }
    
    
    public void addTimeInSeconds (long secondsToAdd) {
    	dateTime = dateTime.plusSeconds(secondsToAdd);
    }

    
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
