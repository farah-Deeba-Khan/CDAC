/* 13. Write a program to print the following pattern:

1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/

public class NumberPattern4 {
    public static void main(String[] args) {
        int max = 5; // The maximum number for the pattern

        // Print the upper part of the pattern
        for (int i = 1; i <= max; i++) {
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(i);
            }
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = max; i > 1; i--) {
            for (int j = 1; j < i; j++) {
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(i - 1);
            }
            System.out.println();
        }
    }
}
