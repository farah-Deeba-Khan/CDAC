//Write a program to compute the factorial of the number 10.

class Factorial {
    public static void main(String[] args) {
        int number = 10;
        int factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("factorial is: " + factorial);
    }
}
