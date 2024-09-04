// 1)Write a program that checks if a given year is a leap year or not using both if-else and switch-case.

class leap {

    public static void main (String[] args) {
    
        int year = 2024;
      
        if((year%4==0) && (year%100!=0 || year%400==0)) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
    
    
    }