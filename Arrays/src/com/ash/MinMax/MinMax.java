package com.ash.MinMax;

public class MinMax {

	public static void main(String[] args) {
		
		int a[] = {15,8,9,12,18,3,5};
		int max = a[0];
		int min = a[0];
		for(int i=0 ; i<a.length; i++)
		{
			if (a[i] > max)
			{max = a[i];}
			  if(a[i] < min)
			{min=a[i];}
		}
		System.out.println("Max Value " +max);
		System.out.println("Min Value " +min);
	}
}
