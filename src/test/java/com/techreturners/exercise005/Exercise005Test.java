package com.techreturners.exercise005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @BeforeEach
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }


    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }


    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }


    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }


    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }


    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }


    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }


    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }

 
    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }
    
    
    @Test
    public void checkSentenceWithNullIsNotAPangram() {
        assertFalse(ex005.isPangram(null));
    }
    
    
    @Test
    public void checkMixedCaseReverseIsAPangram() {
        assertTrue(ex005.isPangram("ZyXwVuTsRqPoNmLkJiHgFeDcBa"));
    }


    @Test
    public void checkMissingLetterZIsNotAPanagram() {
        assertFalse(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXY"));
    }
    

    @Test
    public void checkLetterZReplacedIsNotAPanagram() {
        assertFalse(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYA"));
    }

    

    @Test
    public void checkOneLetterIsNotAPanagram() {
        assertFalse(ex005.isPangram("A"));
    }

    
    @Test
    public void checkPanagramWithPreceedingNoiseIsAPanagram() {
        assertTrue(ex005.isPangram("0123456789!\"£$%^&**()?><.,:;{}[]=+#~@'ABC DEF GHI JKL MNO PQR STU VWX YZ"));
    }
    
    
    @Test
    public void checkSentenceWithJLoIsAPanagram() {
        assertTrue(ex005.isPangram("Foxy diva Jennifer Lopez wasn’t baking my quiche"));
    }
    
    
    @Test
    public void checkSentenceWith51LettersIsAPanagram() {
        assertTrue(ex005.isPangram("Jim quickly realized that the beautiful gowns are expensive"));
    }
    
    
    @Test
    public void checkMultipleLettersIsAPanagram() {
        assertTrue(ex005.isPangram("AAAAAAAAAAAAAaaaaaaaaaaaaaaAAAAAAAaaaaABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
    
 
}
