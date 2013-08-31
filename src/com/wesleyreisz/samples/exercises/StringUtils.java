package com.wesleyreisz.samples.exercises;

import java.util.HashSet;
import java.util.Set;

public class StringUtils {

	public static boolean hasUniqueCharacters(String input) {
		Set<String> set = new HashSet<String>();
		for(int i=0;i<input.length();i++){
			if(!set.add(String.valueOf(input.charAt(i)))){
				return false;
			}
		}
		return true;
	}

	public static boolean hasUniqueCharacters1(String input) {
		for(int i=0;i<input.length();i++){
			for(int y=0;y<input.length();y++){
				if (i!=y){
					if(input.charAt(i)==input.charAt(y)){
						return false;
					}
				}
			}
		}
		
		return true;
	}

	public static String reverse(String input) {
		StringBuffer result=new StringBuffer();
		for(int i=input.length()-1;i>=0;i--){
			result.append(String.valueOf(input.charAt(i)));
		}
		return result.toString();
	}

	public static String dedup(String input) {
		String result="";
		for(int i=0;i<input.length();i++){
			char tmp = input.charAt(i);
			if(i==0){
				result+=tmp;
			}else{
				if(!result.contains(String.valueOf(tmp))){
					result+=tmp;
				}
			}
		}
		return result;
	}
}
