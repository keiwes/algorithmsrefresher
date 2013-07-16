package com.wesleyreisz.samples.linkedlist.forward.v1;

public class MyLinkList {
	Node pointer = null;
	public void add(String val){
		Node tmpNode = new Node(val);
		tmpNode.setNode(pointer);
		pointer = tmpNode;
	}
	public String print(){
		StringBuilder sb = new StringBuilder();
		Node tmpNode=pointer;
		while(tmpNode!=null){
			sb.append(tmpNode.toString());
			tmpNode = tmpNode.getNode();
		}
		return sb.toString();
	}
}
