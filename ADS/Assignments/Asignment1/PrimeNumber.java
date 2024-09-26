package org.example;

import java.util.Scanner;
public class PrimeNumber {
	
	static int num;
	
	static int prime(int n1, int i) {
		if(i==n1) { 				// 7<7
		return 1;  //prime true
		}
		if(n1%i==0) {
			return 0;
		}
		return prime(n1, i+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		num=sc.nextInt();
		System.out.println(prime(num, 2));
	}

}

//num<=0
//i=2
//num%i==1