package com.wesleyreisz.samples.sort.mergesort;

public class MergeSortConsole {

	private static final int COUNT = 500;
	public static void main(String[] args) {
		int[] values = new int[COUNT];
		
		for(int i = 0; i<COUNT;i++){
			values[i] = (int) ((Math.random()*COUNT) + 1);
		}
		
		System.out.println("\nPresort: ");
		for(int value: values){
			System.out.print(value + " ");
		}
		
		System.out.println("\nSorted: ");
		for(int value: MergeSort.sort(values)){
			System.out.print(value + " ");
		}	
	}
}
