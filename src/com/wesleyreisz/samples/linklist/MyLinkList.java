package com.wesleyreisz.samples.linklist;

public class MyLinkList {
	private Node pointerNode = null;
	public void add(String val){
		Node tmpNode = new Node(val, pointerNode);
		pointerNode = tmpNode;	
	}
	public String print(){
		StringBuffer sb = new StringBuffer();
		while(pointerNode!=null){
			sb.append(pointerNode.toString());
			pointerNode = pointerNode.node;
		}
		return sb.toString();
	}
}
