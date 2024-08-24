/*
17. Write a program to print the following pattern:
*****
 ****
 ***
 **
 * 

*/


public class DescendingPyramid {
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern

        // Loop through each row
        for (int i = n; i >= 1; i--) {
            // Print leading spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print asterisks with spaces in between
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
