//2. Declare a single-dimensional array of 5 integers inside the main method.
// Define a method named acceptRecord to get input from the terminal into the array 
// and another method named printRecord to print the state of the array to the terminal.

package com.questions;

import java.util.Scanner;

public class ArrayInputFromTerminal {

	public static void main(String[] args) {
		int[] arr = new int [5];
		
		acceptRecord(arr);
		
		printRecord(arr);
	}
	
	public static void acceptRecord(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array of 5 size: ");
		for(int i = 0; i<5; i++) {
			arr[i] = sc.nextInt();
		}
	}
	
	public static void printRecord(int arr[]) {
		System.out.println("State of the Array : ");
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}

}
