package com.wesleyreisz.samples.linklist;

public class Node {
	private String value;
	private Node prevNode;
	private Node nextNode;
	public Node(String value){
		this.value = value;
	}
	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}
	public Node getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(Node prev) {
		this.prevNode = prev;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString(){
		return value + " ";
	}
}
