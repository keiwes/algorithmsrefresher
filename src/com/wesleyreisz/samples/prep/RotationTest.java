package com.wesleyreisz.samples.prep;

import org.junit.Test;

import junit.framework.Assert;

public class RotationTest {
	@Test
	public void checkRotationTest(){
		Assert.assertEquals(true, StringUtils.checkRotation("abcde","cdeab"));
	}
	@Test
	public void checkRotationTest1(){
		Assert.assertEquals(true, StringUtils.checkRotation("abcde","deabc"));
	}
	@Test
	public void checkRotationTest2(){
		Assert.assertEquals(false, StringUtils.checkRotation("abcde","dceab"));
	}
	@Test
	public void checkRotationTest3(){
		Assert.assertEquals(true, StringUtils.checkRotation("abcde","deabc"));
	}
}
