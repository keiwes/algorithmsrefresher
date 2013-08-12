package com.wesleyreisz.sample.LongestCommonSubString;

import junit.framework.Assert;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testLCS() {
		Assert.assertEquals("ley", 
				StringUtil.longestCommonSubstring("Leyward WentWorth", "Wesley Reisz")
			);
		Assert.assertEquals(" went", 
				StringUtil.longestCommonSubstring("Leyward WentWorth", "Wesley Went")
			);
		Assert.assertEquals("war", 
				StringUtil.longestCommonSubstring("Leyward WentWorth", "waRr Reisz")
			);
	}

}
