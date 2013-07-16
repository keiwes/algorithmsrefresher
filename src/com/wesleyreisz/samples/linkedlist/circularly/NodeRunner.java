package com.wesleyreisz.samples.linkedlist.circularly;

public class NodeRunner {
	/* Explanation: This is an example of a doubly linked list. I wrote this as
	 * an exercise in refreshing linkedlists.
	 */
	public static void main(String[] args){
		NodeList li = new NodeList();
		li.addNode(6);
		li.addNode(25);
		li.addNode(56);
		li.addNode(78);
		li.addNode(4);
		li.printList();
	}
}
