package com.wesleyreisz.samples.insertionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertionSortConsole {

	public static void main(String[] args) {
		List<String>names = new ArrayList<String>();
		names.add("Wes");
		names.add("Kim");
		names.add("Leanne");
		names.add("Justin");
		names.add("Tyler");
		
		System.out.print("Unsorted: ");
		for(String name : names){
			System.out.print(name + " ");
		}
		//Collections.sort(names);// merge sort... n log(n)
		InsertionSort.sort(names);
		
		System.out.print("\nSorted: ");
		for(String name : names){
			System.out.print(name + " ");
		}
	}

}
