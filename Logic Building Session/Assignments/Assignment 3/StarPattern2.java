/*
14. Write a program to print the following pattern:
 *
 **
 ***
 *****
 *******
 *********
 
 */
 
 public class StarPattern2 {
    public static void main(String[] args) {
        // First part: rows with 1, 2, 3 asterisks
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second part: rows with 5, 7, 9 asterisks
        for (int i = 5; i <= 9; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
