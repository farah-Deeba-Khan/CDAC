// 5. Write a program to print the Fibonacci sequence up to the number 21.

class Fibonacci{
public static void main(String args[]) {
	int num1 = 0, num2 = 1;
	int result;
	
	System.out.println(num1);
	 
	while (num2 <= 21) {
        System.out.println(num2);
			
		result = num1 + num2;
		num1 = num2;
		num2 = result;
		
	}
}
}