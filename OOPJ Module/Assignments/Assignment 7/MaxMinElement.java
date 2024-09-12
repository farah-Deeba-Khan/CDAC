package com.questions;

public class MaxMinElement {

	public static void main(String[] args) {
		int arr[] = {4, 5, 9, 2, 3};
		int max = arr[0];
		int min = arr[0];
			
			for(int j=1; j<arr.length; j++) {
				if(max < arr[j]) {
					max = arr[j];
				}
				else if(min > arr[j]) {
					min = arr[j];
					}
			}
			System.out.println("max: "+ max);
			System.out.println("min: "+ min);

	}

}
