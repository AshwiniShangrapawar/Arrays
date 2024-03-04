package com.ash.CountPairsWithGivenSum;

public class CountPairs {
	public static void main(String[] args) {
		
		int a[] = {1,5,8,15,13,7,0,3};
		int sum=8, count=0;
		for(int i=0; i<a.length; i++) {
			
			for(int  j=i+1; j<a.length; j++) {
				if(a[i] + a[j] == sum)
					count++;
				
			}
		}
		System.out.println(count);
	}

}
