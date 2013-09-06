package com.wesleyreisz.samples.exercises.chapt2;

public class Node {
	private String data = "";
	private Node nextNode = null;
	
	public Node(String val){
		this.data = val;
	}
	
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}
	
	public Node getNextNode(){
		return this.nextNode;
	}
	public void setNextNode(Node node){
		this.nextNode = node;
	}
}
