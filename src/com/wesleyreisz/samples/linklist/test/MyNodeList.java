package com.wesleyreisz.samples.linklist.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyNodeList{
	private Node pointerNode=null; 	
	private Node firstNode=null;
	
	public void add(String val) {
		Node tmpNode = new Node(val);
		if(pointerNode!=null){
			pointerNode.setPointerNode(tmpNode);
		}else{
			pointerNode=tmpNode;
			firstNode=tmpNode;
		}
		pointerNode=tmpNode;
	}

	public String print() {
		StringBuffer sb = new StringBuffer();
		Node tmpNode = firstNode;
		while(tmpNode!=null){
			sb.append(tmpNode.toString() + " ");
			tmpNode = tmpNode.getPointerNode();
		}
		return sb.toString();
	}
}
