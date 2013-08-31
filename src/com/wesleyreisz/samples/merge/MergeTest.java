package com.wesleyreisz.samples.merge;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;


public class MergeTest {
	@Test
	public void mergeTest(){
		String[] first = {"W","e","s"};
		String[] second = {"R","e","i","s","z"};
		 Assert.assertEquals("[W, e, s, R, e, i, s, z]", StringUtils.merge(first, second));
	}
}
