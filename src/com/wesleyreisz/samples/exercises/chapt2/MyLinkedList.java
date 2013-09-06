package com.wesleyreisz.samples.exercises.chapt2;

public class MyLinkedList {
	Node pointer = null;
	Node first = null;
	public void add(String val) {
		Node tmp = new Node(val);
		if(pointer!=null){
			pointer.setNextNode(tmp);
		}else{
			first = tmp;
		}
		pointer = tmp;
	}

	public void remove(String val){
		Node tmp = first;
		if(tmp.getData().equals(val)){
			first = tmp.getNextNode();
			return;
		}
		while(tmp!=null){
			if (tmp.getNextNode().getData().equals(val)){
				tmp.setNextNode(tmp.getNextNode().getNextNode());
			}
			tmp = tmp.getNextNode();
		}
		pointer = tmp;
	}
	
	public String print() {
		StringBuffer sb = new StringBuffer();
		Node tmp = first;
		while(tmp!=null){
			sb.append(tmp.getData() + " ");
			tmp = tmp.getNextNode();
		}
		return sb.toString();
	}
}
