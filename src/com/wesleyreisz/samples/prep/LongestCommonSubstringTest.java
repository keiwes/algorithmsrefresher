package com.wesleyreisz.samples.prep;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonSubstringTest {
	@Test
	public void testLongestCommonSubstring(){
		//create a test for longest common substring
		Assert.assertEquals(
			"dog", 
			StringUtils.lcs("dog", "ace dog")
		);
	}
	@Test
	public void testLongestCommonSubstring1(){
		//create a test for longest common substring
		Assert.assertEquals(
			"dog", 
			StringUtils.lcs("dog", "red dog")
		);
	}
	
	
	@Test
	public void testLongestCommonSubstring2(){
		//create a test for longest common substring
		Assert.assertEquals(
			"white", 
			StringUtils.lcs("red black white and pride", "white blue black and true")
		);
	}
}
