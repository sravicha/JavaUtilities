package com.sindura.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Sindura Ravichandran
 * 
 * JUnit tests for NumUtil class.
 *
 */

public class NumUtilTest {

	@Test
	public void testToBinary() {
		
		int number = 1947;
		NumUtil nu = new NumUtil();
		String binary = nu.toBinary(number);
		assertEquals(binary,"11110011011");
		
	}
	
	@Test
	public void testToDecimal() {
		NumUtil nu = new NumUtil();
		long binary = 11110011011L;
		int number = nu.toDecimal(binary);
		assertEquals(1947,number);
	}

}
