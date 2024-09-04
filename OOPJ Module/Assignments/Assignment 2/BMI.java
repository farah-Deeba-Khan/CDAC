//2)Implement a program that calculates the Body Mass Index (BMI) based on height and weight input using if-else to classify the BMI int categories (underweight, normal weight, overweight,etc).
import java.util.*;

class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter weight in Kgs:");
        float weight = sc.nextFloat();

        System.out.println("Enter height in meters:");
        float height = sc.nextFloat();

        
        float bmi = weight / (height * height);

        

        if(bmi<18.5) {
            System.out.println("Your BMI is: "+bmi+" you are underweight");
        }
        else if (bmi>18.5 && bmi<24.5) {
            System.out.println("Your BMI is: "+bmi+" you are normalweight");
        }
        else  {
            System.out.println("Your BMI is: "+bmi+" you are overweight");
        }
    }
}