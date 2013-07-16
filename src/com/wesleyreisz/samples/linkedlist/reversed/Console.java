package com.wesleyreisz.samples.linkedlist.reversed;

public class Console {

	/**
	 * @param objective: develop a simple singly linked list and then print the 
	 * linked list in reverse order.
	 */
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.add("wes");
		list.add("kim");
		list.add("justin");
		list.add("leanne");
		list.add("tyler");
		
		System.out.println("Forward list");
		list.print();
		
		System.out.println("Reversed list");
		list.print(Order.REVERSE);
	}

}
