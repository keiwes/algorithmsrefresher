package com.wesleyreisz.samples.prep;

public class Node {
	private String value = "";
	private Node pointer = null;
	public Node(String val){
		this.value = val;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Node getPointer() {
		return pointer;
	}
	public void setPointer(Node pointer) {
		this.pointer = pointer;
	}
}
