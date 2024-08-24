//Write a program to calculate the sum of the first 50 natural numbers.

class NaturalNo {
    public static void main(String[] args) {
        int n = 50;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = i + sum;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
