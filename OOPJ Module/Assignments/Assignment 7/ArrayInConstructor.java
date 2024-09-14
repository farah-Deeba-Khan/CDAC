//7. Declare a single-dimensional array as a field inside a class
//	and instantiate it inside the class constructor.
//	Define methods named acceptRecord and printRecord within the class
//	and test their functionality.

package com.questions;

import java.util.Scanner;

public class ArrayInConstructor {
	
	private int[] arr;
	
	ArrayInConstructor(int size){
		arr = new int[size];
	}
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array: ");
		
		for(int i=0; i<5; i++) {
		arr[i] = sc.nextInt();
		}
	}
	
	public void printRecord() {
		System.out.println("Given Array: ");
		for(int i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayInConstructor AC = new ArrayInConstructor(5);
		
		AC.acceptRecord();
		
		AC.printRecord();
	}

}
