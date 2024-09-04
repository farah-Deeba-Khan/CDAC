// 5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) and then calculates the area based on user-provided dimensions using a switch case.

import java.util.Scanner;

class area {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape, circle, square,rectangle,triangle");
        String shape = sc.nextLine();
        double areaCheck = 0;

        switch (shape) {
            case "circle":
             System.out.println("Enter radius");
             double radius = sc.nextDouble();
             areaCheck = 3.14 * radius * radius;
             System.out.println("area is "+areaCheck);
             break;
            case "square":
            System.out.println("Enter side");
            double side = sc.nextDouble();
             areaCheck =  side * side;
             System.out.println("area is "+areaCheck);  
               break;
            case "rectangle":
            System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                areaCheck = length * width;
                System.out.println("The area of the rectangle is: " + areaCheck);   
                break; 
                case "triangle":
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                areaCheck = (base * height)/2;
                System.out.println("The area of the triangle is: " + areaCheck);
               break;  

            default:
              
                break;
        }
    

    }
    }