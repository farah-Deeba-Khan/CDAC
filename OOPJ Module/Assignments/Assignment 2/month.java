// 4)Write a program that takes a month (1-12) and prints the corresponding season (Winter, Spring, Summer, Autumn) using a switch case


import java.util.Scanner;

class month {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter month in number");
        int Month = sc.nextInt();
        String season;

        switch (Month) {
            case 12:
            case 1:
            case 2:
            season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "Autumn";
                break;
            default:
            season = "Invalid number";
                break;
        }
        System.out.println("It is "+season);

        
}    
}