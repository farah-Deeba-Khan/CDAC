import java.util.Scanner;

class age {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age");
        int Age = sc.nextInt();

        if(Age>=18) {
            System.out.println("You are eligible for vote");
        }
        else {
            System.out.println("You are not eligible for vote");
        }

}    
}
