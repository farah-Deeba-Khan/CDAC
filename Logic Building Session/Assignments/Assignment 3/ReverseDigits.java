//Write a program to reverse the digits of the number 1234. The output should be 4321.

class ReverseDigits {
    public static void main(String[] args) {
        int num = 1234;
        int reverse = 0;
		int remainder;

        while(num!=0) {
			remainder = num%10;
			reverse = reverse * 10 + remainder;
			num = num/10;
        }

        System.out.println("Reverse Digit is: " + reverse);
    }
}