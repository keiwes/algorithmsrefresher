package com.wesleyreisz.samples.linklist;

public class Node {
	private String val;
	Node node;
	public Node(String val, Node node){
		this.val = val;
		this.node = node;
	}
	public String getValue(){
		return this.val;
	}
	@Override
	public String toString(){
		return val + " ";
	}
}
