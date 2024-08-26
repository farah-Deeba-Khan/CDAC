/*
18. Write a program to print the following pattern:

   *
  ***
 *****
*******
 *****
  ***
   *
 
 */
 
public class DiamondPattern {
    public static void main(String[] args) {
        int maxStars = 7; // The maximum number of stars in the middle row

        // Print the upper part of the pattern
        for (int i = 1; i <= maxStars; i += 2) {
            int spaces = (maxStars - i) / 2;
            
            // Print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = maxStars - 2; i >= 1; i -= 2) {
            int spaces = (maxStars - i) / 2;

            // Print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
