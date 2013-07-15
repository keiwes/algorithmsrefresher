package com.wesleyreisz.samples.linkedlistreversed;

public class MyLinkedList {
	private Node pointer = null;
	public void add(String val){
		Node tmpNode = new Node(val,pointer);
		pointer = tmpNode;
	}
	public void print(){
		Node tmpNode = pointer;
		while(tmpNode!=null){
			System.out.println(tmpNode.toString());
			tmpNode = tmpNode.next;
		}
	}
	public void print(Order order){}
}
