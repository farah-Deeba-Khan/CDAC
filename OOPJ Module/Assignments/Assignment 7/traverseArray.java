package com.questions;

import java.util.Scanner;

public class traverseArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements: ");
		for(int i=0; i<5; i++)
		{
			arr[i]= sc.nextInt();
		} 
		System.out.println("Updated Array: ");
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		} 
	}

}
