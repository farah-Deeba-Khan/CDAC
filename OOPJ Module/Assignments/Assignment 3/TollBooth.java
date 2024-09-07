package org.tollbooth;

import java.util.Scanner;

class TollBoothRevenueManager {

    private double carRate;
    private double truckRate;
    private double motorcycleRate;
    
    private int numberOfCars;
    private int numberOfTrucks;
    private int numberOfMotorcycles;

    private double totalRevenue;

    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars passing through: ");
        numberOfCars = scanner.nextInt();

        System.out.print("Enter the number of trucks passing through: ");
        numberOfTrucks = scanner.nextInt();

        System.out.print("Enter the number of motorcycles passing through: ");
        numberOfMotorcycles = scanner.nextInt();
    }

        public void setTollRates() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the toll rate for cars (in INR): ");
        carRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for trucks (in INR): ");
        truckRate = scanner.nextDouble();

        System.out.print("Enter the toll rate for motorcycles (in INR): ");
        motorcycleRate = scanner.nextDouble();
    }

    public void calculateRevenue() {
        totalRevenue = (numberOfCars * carRate) +
                       (numberOfTrucks * truckRate) +
                       (numberOfMotorcycles * motorcycleRate);
    }

    public void printRecord() {
        int totalVehicles = numberOfCars + numberOfTrucks + numberOfMotorcycles;
        System.out.printf("Total Number of Vehicles: %d\n", totalVehicles);
        System.out.printf("Total Revenue Collected: ₹%.2f\n", totalRevenue);
    }
}
    
public class TollBooth {

    	public static void main(String[] args) {
    		 TollBoothRevenueManager manager = new TollBoothRevenueManager();
    	        
    	        manager.acceptRecord();
    	        manager.setTollRates();
    	        manager.calculateRevenue();
    	        manager.printRecord();
    	}
}
