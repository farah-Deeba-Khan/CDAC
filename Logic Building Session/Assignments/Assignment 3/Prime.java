/*
12. Write a program to draw the following pattern:
*****
*****
*****
*****
*****

*/

public class StarPattern1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
