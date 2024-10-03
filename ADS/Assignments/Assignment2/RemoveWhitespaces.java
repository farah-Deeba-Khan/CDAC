//	3. Remove White Spaces from String
//	Problem: Write a Java program to remove all white spaces from a given string.
//	
//	Test Cases:
//	
//	Input: "Hello World"
//	Output: "HelloWorld"
//	Input: "  Java   Programming  "
//	Output: "JavaProgramming"

package org.example;

import java.util.Scanner;

public class RemoveWhitespaces
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String input = sc.nextLine();
        
        String result = "";
        
        for (int i=0; i<input.length(); i++) {
            
            if (input.charAt(i) != ' ') {
                result += input.charAt(i);
            }
        }
        
        System.out.println("String without whitespaces: " + result);
	}
}
