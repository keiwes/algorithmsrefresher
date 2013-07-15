package com.wesleyreisz.samples.insertionsort;

import java.util.*;

public class InsertionSort {
	public static List<String> sort(List<String> list2sort){
		List<String> sortedList = new ArrayList<String>();
		for(String item: list2sort){
			if (sortedList.size()==0){
				sortedList.add(item);
			}else{
				boolean wasInserted = false;
				for(int i=0;i<sortedList.size();i++){
					String tmp = sortedList.get(i);
					if (item.compareTo(tmp)>0){
						sortedList.add(i+1, item);
						wasInserted = true;
						break;
					}
				}
				if(!wasInserted){
					sortedList.add(0,item);
				}
			}
		}
		return sortedList;
	}
}
