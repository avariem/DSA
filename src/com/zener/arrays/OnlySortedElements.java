/*
 * Given an array of integers, the task is to remove elements from
 *  the array to make array sorted. That is, remove the elements
 *   which do not follow an increasing order.
 *   
 *   Examples:
 *   
 *   Input: arr[] = {1, 2, 4, 3, 5, 7, 8, 6, 9, 10}
	 Output: 1 2 4 5 7 8 9 10
 * 
 * 
 */

package com.zener.arrays;

public class OnlySortedElements {
	
	static int[] sarr = new int[10];
	static int j =0;
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,4,8,5,10,2};
		
		int temp =0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(i==0) {
				temp =arr[i] ;
				addtoNewArray(temp);
				 
			}
			if(temp<= arr[i+1] ){
				temp = arr[i+1];
				addtoNewArray(temp);
			}
		}
		for(int k=0;k<sarr.length;k++)
		System.out.println(sarr[k]);

	}
	
	public static void addtoNewArray(int element) {
		
		sarr[j] = element;
		j++;
	}

}
