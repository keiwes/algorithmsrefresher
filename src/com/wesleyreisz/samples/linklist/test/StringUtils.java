package com.wesleyreisz.samples.linklist.test;

import java.util.Iterator;
import java.util.List;

public class StringUtils {

	public static String printList(List<String> list) {
		StringBuffer sb = new StringBuffer();
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			sb.append(it.next() + " ");
		}
		return sb.toString();
	}

}
