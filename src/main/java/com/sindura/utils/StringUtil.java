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
	
/**
 * Replaces all occurrences of a character with another in a String (using recursion)
 * @param s Input String
 * @param x Character to be replaced
 * @param y Character to be replaced with
 * @return Changed String
 */
	public static String changeChar(String s, char x, char y) {
		if(s.length() >= 1) {
			if (s.charAt(0) == x ) {
				return y + changeChar(s.substring(1),x,y);	
			}
			else {
				return s.charAt(0) + changeChar(s.substring(1),x,y);
			}
		}
		return s;
	}
	
/**
 * Reverses a string using recursion
 * @param input String
 * @return input String reversed.
 */
	public String reverse(String s) {
		char c = s.charAt(s.length()-1);
        if(s.length() == 1) return new String() + c;   

        return c + reverse(s.substring(0,s.length()-1));
	}


}
