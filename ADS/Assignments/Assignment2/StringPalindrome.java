//	9. String Palindrome
//	Problem: Write a Java program to check if a given string is a palindrome.
//	
//	Test Cases:
//	
//	Input: "madam"
//	Output: true
//	Input: "hello"
//	Output: false
//	Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:

package org.example;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		String palindrome = "";
		for(int i=str.length()-1; i>=0; i--) {
			palindrome = palindrome + str.charAt(i);
		}
		if(palindrome.equals(str)) {
			return;
		}

	}

}
