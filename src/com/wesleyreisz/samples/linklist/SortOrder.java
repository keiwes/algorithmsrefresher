package com.wesleyreisz.samples.linklist;

public enum SortOrder {
	FORWARD(0), REVERSE(1);
	private int num;
	
	private SortOrder(int num){
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}
