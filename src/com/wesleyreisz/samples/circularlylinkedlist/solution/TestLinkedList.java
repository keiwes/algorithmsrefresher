package com.wesleyreisz.samples.circularlylinkedlist.solution;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {
	/* 
	 * Explanation: LinkedList implements the List interface. it, however, uses a doubly-linked
	 * list. This means that object insertions are O(1), but get's are O(N) at least in the worst
	 * case.
	*/

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		for (int i=0; i<1000; i++){
			String name = "Name" + Math.random() *1000;
			names.add(name);
		}
		
		for(String name : names){
			System.out.println("Value: " + name);
		}
	}
}
