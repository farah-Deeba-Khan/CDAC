/* 21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/

public class OddNumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                // Calculate the odd number
                int oddNumber = 2 * j - 1;
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(oddNumber);
            }
            System.out.println();
        }
    }
}
