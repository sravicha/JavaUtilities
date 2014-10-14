package com.sindura.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	
/**
 * Test for StringUtil.countChar(...)
 */
	@Test
	public void testCountChar() {
		
		StringUtil s = new StringUtil();
		int count = s.countChar("Hello World", 'l');
		assertEquals(count,3); // positive test
		
		count = s.countChar("To be or not to be", 't');
		assertEquals(count,2); // positive test
		
	}
	
/**
 * Test for StringUtil.changeChar(...)
 */
	@Test
	public void testChangeChar() {
		StringUtil s = new StringUtil();
		String input = "AbcAxzHA";
		String output = s.changeChar(input, 'A', 'B');
		System.out.println(output);
		assertEquals(output,"BbcBxzHB");
	}

}
