package com.wesleyreisz.samples.kata;

public class Working {
	public static void main(String[] args){
		String name = "wesley thomas reisz";
		char[] cName = name.toCharArray();
		
		boolean capitalizeNext = true;
		for(int i=0;i<cName.length;i++){
			
			if(cName[i]==' '){
				System.out.println("\n");
				capitalizeNext = true;
			}else{
				if (capitalizeNext){
					System.out.print(String.valueOf(cName[i]).toUpperCase());
				}else{
					System.out.print(cName[i]);
				}
				capitalizeNext = false;
			}
		}
	}
}
