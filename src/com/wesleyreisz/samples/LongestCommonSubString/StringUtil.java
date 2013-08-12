package com.wesleyreisz.samples.LongestCommonSubString;

public class StringUtil {
	//task: implement a utility to find the longest common substring
	//      between two strings.
	public static String longestCommonSubstring(String first, String second){
		int forwardMarker = 0;
		String lcs = "";
		String tmp = "";
		for(int i=0;i<first.length();/*should be indexed below*/){
			tmp = first.substring(i, i+forwardMarker+1);
			if(second.toLowerCase().contains(tmp.toLowerCase())){
				if(tmp.length()>lcs.length()){
					lcs = tmp;
				}
				forwardMarker++;
			}else{
				i++;
				forwardMarker=0;
				tmp="";
			}
		}
		return lcs.toLowerCase();
	}
}
