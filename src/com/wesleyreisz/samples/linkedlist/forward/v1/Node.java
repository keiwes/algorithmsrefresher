package com.wesleyreisz.samples.linkedlist.forward.v1;
//make this print forward, not backward
//make this a doubly linked list
//make this a circularly linked list


public class Node {
	private Node node;
	private String value;
	public Node(String value){
		this.value = value;
	}
	@Override
	public String toString(){
		return value + " ";
	}
	public void setNode(Node node){
		this.node = node;
	}
	public Node getNode(){
		return this.node;
	}
}
