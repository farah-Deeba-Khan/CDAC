//9. Integer Palindrome
//Problem: Write a Java program to check if a given integer is a palindrome.
//
//Test Cases:
//
//Input: 121
//Output: true
//Input: -121
//Output: false

package org.example;

import java.util.Scanner;
public class Palindrome {
	static int num;
	static int rev = 0;
	
	static int palindromeNum(int n1) {
		if(n1==0) {		// 121!=0
			return n1;
		}
		else {
			rev = rev*10 + n1%10;  // rev = 0*10 + 121%10 => 1
			n1 = n1/10; //121/10 = 12
			palindromeNum(n1);
			return rev;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num: ");
		num=sc.nextInt();
		System.out.println(palindromeNum(num)==num);
	}

}
