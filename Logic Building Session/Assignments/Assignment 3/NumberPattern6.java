/*
19. Write a program to print the following pattern:

5
5*4
5*4*3
5*4*3*2
5*4*3*2*1

*/

public class NumberPattern6 {
    public static void main(String[] args) {
        int rows = 1;

        for (int i = 5; i >= rows; i--) {
            for (int j = 5; j >= i; j--) {
                if (j < 5) {
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
