/*
22. Write a program to print the following pattern:

*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********

*/

public class HourGlassPattern {
    public static void main(String[] args) {
        int maxStars = 9;
        int middle = maxStars / 2;

        // Print the upper part of the pattern
        for (int i = middle; i >= 0; i--) {
            // Print spaces
            for (int s = 0; s < middle - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = 1; i <= middle; i++) {
            // Print spaces
            for (int s = 0; s < middle - i; s++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
