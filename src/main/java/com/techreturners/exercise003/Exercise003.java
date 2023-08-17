package com.techreturners.exercise003;


public class Exercise003 {


	private final String[] iceCreams = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"}; 
	

	int getIceCreamCode(String iceCreamFlavour) {
		
		int iceCreamCode = -1;		// -1 means we can't find a flavour match
		
		for (int i = 0; i < iceCreams.length; i++)
		{
			if (iceCreams[i].equals(iceCreamFlavour)) {
				iceCreamCode = i;
				break;
			}
		}
		return iceCreamCode;
    }


	String[] iceCreamFlavours() {
        return iceCreams;
    }

}
