package com.techreturners.exercise004;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004Test {
	
	final long oneGigaSecond = 1000000000;

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    
    
    @Test
    public void checkGetDateTimeNow() {

        LocalDateTime now = LocalDateTime.now();
        
    	Exercise004 ex004 = new Exercise004(now);
        LocalDateTime expected = now.plusSeconds(oneGigaSecond);
        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateNow() {

        LocalDate now = LocalDate.now();
        
    	Exercise004 ex004 = new Exercise004(now);
        LocalDateTime expected = now.atStartOfDay().plusSeconds(oneGigaSecond); 
        assertEquals(expected, ex004.getDateTime());
    }
    
    
    
    @Test
    public void checkConstructorsWithDateVsDateTime() {

        Exercise004 dateTime = new Exercise004(LocalDateTime.of(2023, Month.AUGUST, 17, 00, 00, 00, 0));
        Exercise004 date = new Exercise004(LocalDate.of(2023, Month.AUGUST, 17));

        assertEquals(date.getDateTime(), dateTime.getDateTime());
    }
    

    @Test
    public void checkStartOfJavaDate() {

        Exercise004 date = new Exercise004(LocalDate.MIN);
        assertEquals(LocalDate.MIN.atStartOfDay().plusSeconds(oneGigaSecond) , date.getDateTime());
    }
        

    @Test
    public void checkStartOfJavaTime() {

        Exercise004 date = new Exercise004(LocalDateTime.MIN);

        assertEquals(LocalDateTime.MIN.plusSeconds(oneGigaSecond) , date.getDateTime());
    }

    
}
