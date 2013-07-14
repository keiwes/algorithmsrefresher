package com.wesleyreisz.samples.circularlylinkedlist.solution;

public class NodeList {
	private Node pointerNode = null;
	private Node firstNode = null;
	
	public void addNode(int value){
		Node newNode = new Node(value);
		newNode.next = firstNode;
		if (pointerNode==null){
			pointerNode = newNode;
			pointerNode.next = newNode;
			pointerNode.previous = newNode;
			firstNode = newNode;
		}else{
			pointerNode.next = newNode;
			newNode.previous = pointerNode;
			pointerNode = newNode;
		}
		System.out.println("Inserted:" + value);
	}
	public void printList() {
		Node tmpNode = pointerNode;
		do{
			System.out.println("Value: " + pointerNode.val);
			pointerNode = pointerNode.next;
		}while(tmpNode!=pointerNode);
	}
}
