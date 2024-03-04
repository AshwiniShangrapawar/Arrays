package com.ash.MinMax;

public class MaxTwoNum {

public static void main(String[] args) {
		
		int a[] = {15,8,9,12,18,3,5};
		int maxOne = a[0];
		int maxTwo = a[0];
		
		for (int n : a) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			}
			else if(maxTwo < n) {
				maxTwo = n;
			}
			
		}
		
		System.out.println("First Max No - " +maxOne);
		System.out.println("Second Max No - " +maxTwo);
		
		
}
}
