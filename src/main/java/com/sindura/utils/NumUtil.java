package com.sindura.utils;

/**
 * 
 * @author Sindura Ravichandran
 * 
 * Utility class to do basic number operations
 *
 */

public class NumUtil {
	
	/**
	 * Converts a number to binary
	 * @param x Integer number
	 * @return Binary representation of the interger number
	 */
	
	public String toBinary(int x) {
		StringBuilder returnString = new StringBuilder();	
		if (x <= 1) {
			returnString.append(1);
			returnString = returnString.reverse();
			return returnString.toString();			
		}
		else if (x%2 == 1) {
			returnString.append(1);
			x = x-1;
			returnString = new StringBuilder(toBinary(x/2)).append(1);
			return returnString.toString();
		}
		else {
			returnString.append(0);
			returnString = new StringBuilder(toBinary(x/2)).append(0);
			return returnString.toString();
		}
	}

	/**
	 * Converts a binary string to decimal
	 * @param binary
	 * @return Decimal number
	 */
	
	public int toDecimal(long binary) {
        
        int decimal = 0;
        int power = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                long tmp = binary%10;
                decimal += tmp*Math.pow(2, power);
                binary = binary/10;
                power++;
            }
        }
        return decimal;
    }

}
