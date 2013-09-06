package com.wesleyreisz.samples.exercises.chapt1;

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

	public static boolean isAnAnagram(String word1, String word2) {
		if(word1.length()!=word2.length()){
			return false;
		}
		String newWord = word2;
		for(int i=0;i<word1.length();i++){
			String target = String.valueOf(word1.charAt(i));
			if (!newWord.contains(target)){
				return false;
			}else{
				newWord = newWord.replaceFirst(target, "");
			}
		}
		return true;
	}

	public static String replaceSpaces(String input) {
		return input.replace(" ", "%20");
	}
	
	public static String replaceSpaces1(String input) {
		String charToReplace = " ";
		String charToReplaceWith = "%20";
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<input.length();i++){
			String target = String.valueOf(input.charAt(i));
			if(target.equals(charToReplace)){
				sb.append(charToReplaceWith);
			}else{
				sb.append(target);
				
			}
		}
		return sb.toString();
	}

	public static Object isAnAnagram1(String string, String word2) {
		return null;
	}

	public static boolean isRotation(String first, String second) {
		if(first.length()!=second.length()){
			return false;
		}
		return isSubString(first+first, second);
	}
	private static boolean isSubString(String String2Check, String substring){
		return String2Check.contains(substring);
	}
}
