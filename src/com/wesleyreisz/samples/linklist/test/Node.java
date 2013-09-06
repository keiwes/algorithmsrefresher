package com.wesleyreisz.samples.linklist.test;

public class Node {
	Node pointerNode;
	String val;
	
	public Node(String value){
		this.val = value;
	}
	
	public Node getPointerNode() {
		return pointerNode;
	}
	public void setPointerNode(Node pointerNode) {
		this.pointerNode = pointerNode;
	}
	public String getVal() {
		return val;
	}
	public void setVal(String val) {
		this.val = val;
	}
	
	public String toString(){
		return val;
	}
	
	//lookup Joshua Bloch Effective Java on 
	//equals and hashCode()
}
