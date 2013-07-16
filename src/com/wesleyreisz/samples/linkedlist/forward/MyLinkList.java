package com.wesleyreisz.samples.linkedlist.forward;

public class MyLinkList {
	Node firstNode = null;
	Node pointer = null;
	public void add(String val){
		Node tmpNode = new Node(val);
		if (pointer!=null){
			pointer.setNode(tmpNode);
		}else{
			firstNode = tmpNode;
		}
		
		pointer = tmpNode;
	}
	public String print(){
		StringBuilder sb = new StringBuilder();
		Node tmpNode=firstNode;
		while(tmpNode!=null){
			sb.append(tmpNode.toString());
			tmpNode = tmpNode.getNode();
		}
		return sb.toString();
	}
}
