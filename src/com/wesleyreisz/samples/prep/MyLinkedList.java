package com.wesleyreisz.samples.prep;

import java.util.Stack;

public class MyLinkedList {
	private static StringBuffer sb = new StringBuffer();
	private static Stack stack = new Stack<>();
	private Node firstNode;
	private Node pointer;
	public void add(String val){
		Node tmpNode = new Node(val);
		if (pointer!=null){
			pointer.setPointer(tmpNode);
		}else{
			firstNode = tmpNode;
		}
		pointer=tmpNode;
	}

	public String print() {
		StringBuffer sb = new StringBuffer();
		Node tmpNode = firstNode;
		while(tmpNode!=null){
			sb.append(tmpNode.getValue() + " ");
			tmpNode= tmpNode.getPointer();
		}
		return sb.toString();
	}
	
	public String printRecursive(){
		printRecursive(firstNode);
		return sb.toString();
	}
	
	private void printRecursive(Node node) {
		sb.append(node.getValue() + " ");
		if(node.getPointer()==null){return;}
		printRecursive(node.getPointer());
	}
}
