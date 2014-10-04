package com.sindura.utils;


/**
 * 
 * @author Sindura Ravichandran
 * 
 * Utility class that has some basic and extended String operations
 *
 */

public class StringUtil {
	

/**
 * Returns the number of occurrences a given character in a String object using recursion
 * I wrote this to practice recursion algorithms	
 * @param input String
 * @param x the character to be counted for frequency
 * @return the number of occurrences of x in the given string
 */
	public int countChar(String input, char x) {
		if(input == null || input.length() == 0) {
			return 0;
		}
		else {
			int count = 0;
			if(input.charAt(0) == x) {
				count = 1;
			}
			count += countChar(input.substring(1),x);
			return count;
		}
	}

}
