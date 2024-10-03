//	6. Reverse Words in a String
//	Problem: Write a Java program to reverse the words in a given sentence.
//	
//	Test Cases:
//	
//	Input: "Hello World"
//	Output: "World Hello"
//	Input: "Java Programming"
//	Output: "Programming Java"


package org.example;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Words: ");
	String s = sc.nextLine();
	
	String[] words = s.split(" ");
	String revWords = " ";
	
	for(int i = words.length-1; i>=0; i--)
	{
		revWords = revWords + words[i] + " "; 
	}
	System.out.println("Reverse Words: " +revWords.trim());
	}

}
