//11.  Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression.

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        int result;
        result = ++x + x--; // 6 + 6
		
		System.out.println("x after pre-increment and post-decrement: " + x); // 5
        System.out.println("Result of the expression (++x + x--): " + result); // 6+6 =12
		
		int y = 10;
        int result1;
		result1 = ++x + y--; // 6 + 10
		
		System.out.println("x after pre-increment: " + x); //6
        System.out.println("y after post-decrement: " + y);  //9
        System.out.println("Result of the expression (++x + y--): " + result1); // 6+10=16
    }
}
