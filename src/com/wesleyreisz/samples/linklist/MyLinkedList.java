package com.wesleyreisz.samples.linklist;

import java.util.*;

public class MyLinkedList {
	public static void main(String[] args) {
		List<String> names = new LinkedList<>();
		names.add("honey");
		names.add("ruby");
		names.add("echo");
		names.add("cosmo");
		
		Collections.sort(names);
		Collections.reverse(names);
		
		for(String name:names){
			System.out.println(name);
		}
	}

}
