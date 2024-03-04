package com.ash.MissingNum;

public class MissingNum {
public static void main(String[] args) {
	
	 int n =6;
	 int a[] = {1,3,4,5,6};
	 int sumN = (n*(n+1))/2; //this will give the sum of N Numbers
	 int sum=0;
	 // find the sum of the elements inside the array so for loop
	 
	 for(int i = 0; i<a.length; i++)
	 {
		 sum= sum+a[i]; // add the value present in i'th index into the sum
		 //now we have this variable sum ..which will be having the sum of all elements in the array(Total of an array)
	 }
	 //subtract sum of all elemts in array (Total) from sum of N elements
	 int missVal = sumN- sum;
	 System.out.println("Missing Number is - " +missVal);
}
}
