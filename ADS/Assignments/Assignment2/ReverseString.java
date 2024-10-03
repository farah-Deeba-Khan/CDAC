//	4. Reverse a String
//	Problem: Write a Java program to reverse a given string.
//	
//	Test Cases:
//	
//	Input: "hello"
//	Output: "olleh"
//	Input: "Java"
//	Output: "avaJ"

package org.example;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
		rev = rev + s.charAt(i);
		}
		System.out.println("Reverse String: " +rev);

	}

}
