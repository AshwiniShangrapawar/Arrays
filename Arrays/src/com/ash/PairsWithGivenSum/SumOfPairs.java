package com.ash.PairsWithGivenSum;

public class SumOfPairs {
	public static void main(String[] args) {
		
		int a[] = {1,5,8,15,13,7,0,3};
		int sum=8; 
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j] == sum - a[i])
				{
					System.out.println("Pair[" +a[i]+ "," +a[j]+ "]");
				}
			}
		}
	}

}
