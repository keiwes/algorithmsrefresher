package com.wesleyreisz.careercup.special;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringUtils {

	public static List<Integer> specialSort(List<Integer> inputs) {
		List<Integer>negatives = new ArrayList<Integer>();
		List<Integer>positives = new ArrayList<Integer>();
		for(Integer i: inputs){
			if(i<=0){
				negatives.add(i);
			}else{
				positives.add(i);
			}
		}
		Collections.sort(negatives);
		Collections.reverse(negatives);
		Collections.sort(positives);
		negatives.addAll(positives);
		return negatives;
	}

	public static boolean isAnagram(String first, String second) {
		if(first.replace(" ", "").length()!=(second.replace(" ","").length())){
			return false;
		}
		for(int i=0;i<first.length();i++){
			if(!second.contains(String.valueOf(first.charAt(i)))){
				return false;
			}
		}
		return true;
	}
}
