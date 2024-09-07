package org.compound;

import java.util.Scanner;

class CompoundInterestCalculator {
	double futureValue;
	double totalInterest;
	double principal;
	float annualInterestRate;
	float numberOfCompounds;
	int years;
	
	public void acceptRecords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Annaul Interest Rate: ");
		annualInterestRate = sc.nextFloat();
		
		System.out.println("Enter Initial Investment Amount: ");
		principal = sc.nextDouble();
		
		System.out.println("Enter Compounded Interest per year: ");
		numberOfCompounds = sc.nextFloat();
		
		System.out.println("Enter Investment Duration: ");
		years = sc.nextInt();
		
	}
	
	public void calculateFutureValue() {
		futureValue = principal * Math.pow(1 + annualInterestRate / numberOfCompounds, numberOfCompounds * years);
		totalInterest = futureValue - principal;
	}
	
	public void printRecords() {
		System.out.println("Future Value: " + futureValue);
		System.out.println("Total Interest: " + totalInterest);
	}
}

public class InterestCalculator {

	public static void main(String[] args) {
		CompoundInterestCalculator CI = new CompoundInterestCalculator();
		CI.acceptRecords();
		CI.calculateFutureValue();
		CI.printRecords();
	}

}
