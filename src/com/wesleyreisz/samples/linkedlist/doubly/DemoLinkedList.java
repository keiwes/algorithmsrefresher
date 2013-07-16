package com.wesleyreisz.samples.linkedlist.doubly;

public class DemoLinkedList {
	private Node head = null;
	private Node pointer = null;
	
	public void add(String val){
		Node tmpNode = new Node(val);
		tmpNode.setPrevNode(pointer);
		if (pointer==null){
			head = tmpNode;
		}else{
			tmpNode.setNextNode(null);
			pointer.setNextNode(tmpNode);
		}
		pointer = tmpNode;
	}
	public String print(){
		return print(SortOrder.FORWARD);
	}
	public String print(SortOrder order){
		Node tmpNode = null;
		StringBuilder sb = new StringBuilder();
		if (order.equals(SortOrder.FORWARD)){
			tmpNode = head;
		}else{
			tmpNode = pointer;
		}
		while(tmpNode!=null){
			sb.append(tmpNode.getValue() + " ");
			if (order.equals(SortOrder.FORWARD)){
				tmpNode = tmpNode.getNextNode();
			}else{
				tmpNode = tmpNode.getPrevNode();
			}
		}
		return sb.toString();
	}
	
}