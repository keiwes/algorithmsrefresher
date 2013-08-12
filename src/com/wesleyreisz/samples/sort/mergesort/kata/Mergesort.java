package com.wesleyreisz.samples.sort.mergesort.kata;

public class Mergesort {
	private Mergesort(){}
	public static int[] sort(int[] inputArray){
		//Task: Implement a mergesort
		//base case
		if (inputArray.length<=1){
			return inputArray;
		}
		
		//step 1: find the midpoint
		int mid = inputArray.length / 2 + (inputArray.length % 2);
		System.out.println("length: " + inputArray.length + " mid: " + mid);
		//step 2: divide the list into two lists
		int[] left = new int[mid];
		int[] right = new int[inputArray.length-mid];
		for(int i=0;i<inputArray.length;i++){
			if(i<mid){
				left[i]=inputArray[i];
			}else{
				right[i-mid]=inputArray[i];
			}
		}
		System.out.println(" left: " + print(left));
		System.out.println(" right: " + print(right));
		//step 3: repeat recursively until one number is left (base case)
		if (left.length>1){
			left = sort(left);
		}
		if (right.length>1){
			right = sort(right);
		}
		//step 4: merge each list until done
		return merge(left,right);
	}
	private static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		
		int i = 0;
		int j = 0;
		
		for(int k = 0; k<result.length; k++){
			if(i<left.length && j<right.length){
				//core data check
				if(left[i]<right[j]){
					result[k]=left[i];
					i++;
				}else{
					result[k]=right[j];
					j++;
				}
			}else{
				if(i<left.length){
					result[k]=left[i];
					i++;
				}else{
					result[k]=right[j];
					j++;
				}
			}
		}
		// step 3: return list
		return result;
	}
	public static String print(int[] inputArray){
		String result = "";
		for(int value:inputArray){
			result = result + value + " "; 
		}
		return result;
	}
}
