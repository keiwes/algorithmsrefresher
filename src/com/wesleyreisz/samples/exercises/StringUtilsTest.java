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
	
	//14 Write a method to decide if two strings are anagrams or not
	@Test
	public void testAnagram(){
		String word1 = "iceman";
		String word2 = "cinema";
		Assert.assertEquals(true,StringUtils.isAnAnagram(word1,word2));
		Assert.assertEquals(false,StringUtils.isAnAnagram("icemen",word2));
		
	}
	
	// 15 Write a method to replace all spaces in a string with '%20'
	@Test
	public void testStringReplace(){
		String value1="this is a test";
		String value2="this%20is%20a%20test";
		Assert.assertEquals(value2, StringUtils.replaceSpaces(value1));
	}
	
	//Assume you have a method isSubstring which checks if one word 
	//is a substring of another Given two strings, s1 and s2, write 
	//code to check if s2 is a rotation of s1 using only one call to 
	//isSubstring (i e , “waterbottle” is a rotation of 
	//“erbottlewat”)
	@Test
	public void testIsRotation(){
		Assert.assertEquals(true, StringUtils.isRotation("waterbottle","erbottlewat"));
	}
}
