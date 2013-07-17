package com.wesleyreisz.samples.linklist;

public class NodeList {
	private Node head=null;
	private Node pointer = null;
	public void add(String value){
		Node tmpNode = new Node(value);
		tmpNode.setPrevNode(pointer);
		if(pointer!=null){
			pointer.setNextNode(tmpNode);
		}else{
			head = tmpNode;
		}
		pointer = tmpNode;
	}
	public String print(){
		Node tmpNode = head;
		StringBuffer sb = new StringBuffer();
		while(tmpNode!=null){
			sb.append(tmpNode.toString());
			tmpNode = tmpNode.getNextNode();
		}
		return sb.toString();
	}
	public String print(SortOrder order){
		if (order.equals(SortOrder.FORWARD)){
			return print();
		}else{
			return printReverse();
		}
	}
	private String printReverse(){
		Node tmpNode = pointer;
		StringBuffer sb = new StringBuffer();
		while(tmpNode!=null){
			sb.append(tmpNode.toString());
			tmpNode = tmpNode.getPrevNode();
		}
		return sb.toString();
	}
}
