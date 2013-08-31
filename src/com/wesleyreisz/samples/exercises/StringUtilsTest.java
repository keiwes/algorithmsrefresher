package com.wesleyreisz.samples.exercises;

import junit.framework.Assert;

import org.junit.Test;

public class StringUtilsTest {
	//1.1 Implement an algorithm to determine 
	//if a string has all unique characters 
	//What if you can not use additional data structures?
	@Test
	public void testForUniqueCharacters(){
		String notUnique= "This is not a unique character String";
		String unique = "abc";
		Assert.assertEquals(false, StringUtils.hasUniqueCharacters(notUnique));
		Assert.assertEquals(true, StringUtils.hasUniqueCharacters(unique));
	}
	//1.1.1 Implement an algorithm to determine 
	//if a string has all unique characters 
	//What if you can not use additional data structures?
	@Test
	public void testForUniqueCharactersWithoutSet(){
		String notUnique= "This is not a unique character String";
		String unique = "abcdefghijklmnop";
		//Assert.assertEquals(false, StringUtils.hasUniqueCharacters1(notUnique));
		Assert.assertEquals(true, StringUtils.hasUniqueCharacters1(unique));
	}
	
	//1.2Write code to reverse a String 
	@Test
	public void testForReversedString(){
		Assert.assertEquals("EDCBA", StringUtils.reverse("ABCDE"));
	}
	
	/*Design an algorithm and write code to remove the duplicate characters in a 
	string without using any additional buffer NOTE: One or two additional 
	variables are fine An extra copy of the array is not*/
	@Test
	public void testDedup(){
		Assert.assertEquals("ABC", StringUtils.dedup("ABBABCA"));
	}
}
