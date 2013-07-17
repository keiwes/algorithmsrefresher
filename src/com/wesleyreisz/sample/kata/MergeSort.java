package com.wesleyreisz.sample.kata;

public class MergeSort {
	public static int[] sort(int[] values){
		//step 1: return if list is 1
		if(values.length<=1){
			return values;
		}
		//step 1: divide in half
		int halfway = values.length/2;
		int[]left = new int[halfway];
		int[]right = new int[values.length-halfway];
		for(int i=0;i<values.length;i++){
			if (i<left.length){
				left[i]=values[i];
			}else{
				right[i-halfway]=values[i];
			}
		}
		
		//step 2: recursively call sort
		left=sort(left);
		right=sort(right);
		
		//step 3: combine list
		return merge(left,right);
	}
	private static int[] merge(int[] left, int[] right){
		int[] result = new int[left.length + right.length];
		
		int leftIndex = 0;
		int rightIndex = 0;
		
		for(int loopIndex = 0; loopIndex<result.length; loopIndex++){
			if(leftIndex<left.length && rightIndex<right.length){
				//core data check
				if(left[leftIndex]<right[rightIndex]){
					result[loopIndex]=left[leftIndex];
					leftIndex++;
				}else{
					result[loopIndex]=right[rightIndex];
					rightIndex++;
				}
			}else{
				if(leftIndex<left.length){
					result[loopIndex]=left[leftIndex];
					leftIndex++;
				}else{
					result[loopIndex]=right[rightIndex];
					rightIndex++;
				}
			}
		}
		// step 3: return list
		return result;
	}
}
