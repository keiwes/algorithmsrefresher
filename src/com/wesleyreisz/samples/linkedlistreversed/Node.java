package com.wesleyreisz.samples.linkedlistreversed;

public class Node {
	Node next;
	private String value;
	public Node(String value, Node next){
		this.value = value;
		this.next = next;
	}
	@Override
	public String toString(){
		return "Value: " + value;
	}
}
