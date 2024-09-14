// 4. Write a program to remove duplicate elements from a single-dimensional array of integers.

package com.questions;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
        int[] array = {5, 3, 5, 2, 2, 1, 4, 3};

        Arrays.sort(array);

        // Remove duplicates
        int count = 0;
        for (int i = 0; i < array.length; i++) {
           
        	if (i == 0 || array[i] != array[i - 1]) {
        		
                array[count++] = array[i];
            }
        }

        System.out.print("Array after removing duplicates: [");
        for (int i = 0; i < count; i++) {
            System.out.print(array[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
	}

}


