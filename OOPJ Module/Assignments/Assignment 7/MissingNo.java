package com.questions;

public class MissingNo {
	
	public static int missingNumber(int n, int[] arr)
	{
	    int sum = 0;

	    // Sum of array elements
	    for (int i = 0; i < n - 1; i++) {
	        sum += arr[i];
	    }

	    // Expected sum
	    int expectedSum = (n * (n + 1)) / 2;

	    // Return missing number
	    return expectedSum - sum;
	}

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 5 };
	    int n = 5;
	    System.out.println("Missing No. is: " +missingNumber(n, arr));
	}

}