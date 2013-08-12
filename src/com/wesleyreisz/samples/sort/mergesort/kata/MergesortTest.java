package com.wesleyreisz.samples.sort.mergesort.kata;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class MergesortTest {

	@Test
	public void test() {
		int[] values = {6,4,2,8,5,1,3,7,9,12,14};
		
		Assert.assertEquals(
				"1 2 3 4 5 6 7 8 9 12 14 ", 
				Mergesort.print(Mergesort.sort(values))
			);
	}
}
