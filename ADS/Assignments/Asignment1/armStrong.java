/*
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
*/

//153= 1 + 125 + 27 => 153

package org.example;
import java.util.Scanner;

public class armStrong {
	static int rem;
	static int result;
	static int num;
	
	static int cal(int n) {
		if(n==0) {
			return n;
		}
		else {
		rem = n % 10; //3
		result = (int) (result + Math.pow(rem, 3)); //3*3*3 // 0+27
		cal(n/10); //15
		}
		return result;  //153
	}
	
//	rem = num % 10; //3
//	result = (int) (result + Math.pow(rem, 3));
//	num = num/10; //15
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		System.out.println(cal(num)==num);
	}
}