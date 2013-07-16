package com.wesleyreisz.samples.linkedlist.circularly;

public class Node {
	int val;
	Node previous;
	Node next;
	public Node(int val){
		this.val = val;
		previous = null;
		next = null;
	}
	public Node(int val, Node prev, Node next){
		this.val = val;
		this.previous = prev;
		this.next = next;
	}
	@Override
	public String toString() {
		return Integer.toString(val);
	}
}
