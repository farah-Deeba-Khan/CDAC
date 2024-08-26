//6. Write a program to find and print the first 5 prime numbers.

public class FirstFivePrimes {
    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        while (count < 5) {
            boolean isPrime = true;

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}
