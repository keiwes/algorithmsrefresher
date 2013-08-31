package com.wesleyreisz.samples.merge;

import java.util.ArrayList;

public class StringUtils {
	public static String[] merge(String[] s1, String[] s2){
		ArrayList<String>list = new ArrayList<String>();
		addStringtoList(list,s1);
		addStringtoList(list, s2);
		return list.toArray(new String[list.size()]);
	}
	
	private static ArrayList<String> addStringtoList(ArrayList<String> list, String[] input){
		for(String s: input){
			list.add(s);
		}
		return list;
	}
}
