package com.questions;

import java.util.Scanner;

public class ArrayInConstructorWithGetterSetter {

	private int[] arr;
	
	ArrayInConstructorWithGetterSetter(int size){
		arr = new int[size];
	}
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public static void main(String[] args) {
		ArrayInConstructorWithGetterSetter ac = new ArrayInConstructorWithGetterSetter(5);
		int newArray[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array : ");
		for(int i=0; i<5; i++) {
			newArray[i] = sc.nextInt();
			}
		
		ac.setArr(newArray);
		ac.getArr();
	}

}
