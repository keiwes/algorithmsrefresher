package com.wesleyreisz.samples.linkedlist.doubly;

public class Node {
	private String value;
	private Node next;
	private Node prev;
	
	public Node(String value){
		this.value = value;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getNextNode() {
		return next;
	}
	public void setNextNode(Node next) {
		this.next = next;
	}
	public Node getPrevNode() {
		return prev;
	}
	public void setPrevNode(Node prev) {
		this.prev = prev;
	}
}
