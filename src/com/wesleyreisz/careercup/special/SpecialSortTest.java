package com.wesleyreisz.careercup.special;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SpecialSortTest {
	@Test
	public void specialSort(){
		List<Integer> inputs = Arrays.asList(-1, 1, 3, -2, 2);
		List<Integer> sortedOutput = Arrays.asList(-1, -2, 1, 2, 3);
		Assert.assertEquals(sortedOutput, StringUtils.specialSort(inputs));
	}
	@Test
	public void isAnagram(){
		Assert.assertEquals(true,  StringUtils.isAnagram("secure", "rescue"));
		Assert.assertEquals(false,  StringUtils.isAnagram("coniferse", "fir cones"));
	}
}
