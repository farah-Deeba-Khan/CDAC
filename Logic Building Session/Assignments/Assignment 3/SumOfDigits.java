// 7. Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6).

public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;
        String result = "";

        // Loop to process each digit
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            sum += digit;
            result = digit + result;
            number /= 10; // Remove the last digit
        }

        // Add plus signs between digits
        String expression = "";
        for (int i = 0; i < result.length(); i++) {
            expression += result.charAt(i);
            if (i < result.length() - 1) {
                expression += " + ";
            }
        }

        System.out.println(sum + " (" + expression + ")");
    }
}
