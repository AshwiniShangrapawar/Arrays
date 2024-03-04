package com.ash.MergingTwoArrays;

import java.util.Arrays;

public class MergingArrays {

	public static void main(String[] args) {
		
		int a[]= {3,4,5,6,7},ci =0;
		int b[] = {1,2,8};
		int c[] = new int[a.length + b.length];
		
		for(int i=0; i<a.length;i++)
		{
			c[ci] = a[i];
			ci++;
		}
		
		for(int i =0; i<b.length; i++) {
			c[ci] = b[i];
			ci++;
		}
	System.out.println("Merged Array - "+Arrays.toString(c));
	
	}
}
