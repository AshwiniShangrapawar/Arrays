
package com.ash.ReverseArrayUsingScanner;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Elements");
		
		for(int i=0; i<a.length; i++)
		{
			
			a[i] = sc.nextInt();
			}		
		
		System.out.println( "Reversed Array is - " ); 
	}

}
