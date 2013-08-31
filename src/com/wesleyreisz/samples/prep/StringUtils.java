package com.wesleyreisz.samples.prep;

public class StringUtils {

	public static String lcs(String string1, String string2) {
		String result = "";
        String tmp="";
        for(int outterLoop=0;outterLoop<string1.length();outterLoop++){
           for(int innerLoop=0;innerLoop<string2.length();innerLoop++){
              if (string1.charAt(outterLoop)==string2.charAt(innerLoop)){
                  tmp+=string2.charAt(innerLoop);//optimize later
                  outterLoop++;
                  if(tmp.length()>result.length()){
                      result = tmp;
                  }
                  break;
              }else{
             	 tmp="";
              }
           }
        }
      return result;
	}

	public static boolean checkRotation(String string1, String string2) {
		if(string1.length()!=string2.length()){
			return false;
		}
		if(string1.concat(string1).contains(string2)){
			return true;
		}else{
			return false;
		}
	}
}
