//Write a program to print all multiples of 7 between 1 and 100.

class Multiples {
    public static void main(String[] args) {
        int n = 100;

        for (int i = 1; i <= n; i++) {
            if(i%7==0){
			System.out.println(i);
			}
        }
    }
}
