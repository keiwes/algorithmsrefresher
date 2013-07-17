package com.wesleyreisz.sample.kata;

import org.junit.Test;

public class MergeSortTest {
	private static int COUNT = 100;
	@Test
	public void test() {
		int[] values = new int[COUNT];
		for(int i = 0; i<COUNT;i++){
			values[i] = (int)(Math.random()*100)+1;
		}
		values = MergeSort.sort(values);
		
		for(int i = 0; i<values.length;i++){
			System.out.println(Integer.toString(i) + ":" + values[i]);
		}
	}

}
