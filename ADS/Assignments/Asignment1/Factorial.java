package org.example;

import java.util.Scanner;

public class Factorial {
	static int num;
	static int fact(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*fact(n-1);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		System.out.println(fact(num));
	}
}
