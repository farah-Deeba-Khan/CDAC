package org.loan;

import java.util.Scanner;

class LoanAmortizationCalculator {
	private Long principal;
	private double annualInterestRate;
	private int loanTerm;
	private double monthlyPayment;
	private double totalAmountPaid;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal Amount: ");
		principal = sc.nextLong();
		
		System.out.println("Enter Annual Interest Rate: ");
		annualInterestRate = sc.nextDouble();
		
		System.out.println("Enter Loan Terms in years: ");
		loanTerm = sc.nextInt();
	}

	public void calculateMonthlyPayment() {
		double monthlyInterestRate = (annualInterestRate / 12) / 100;
		int numberOfMonths = loanTerm * 12;
		
		monthlyPayment = principal * (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate),(numberOfMonths)))) / (Math.pow((1 + monthlyInterestRate), (numberOfMonths)) - 1);
		totalAmountPaid = monthlyPayment * numberOfMonths;
	}
	
	public void printRecord() {
		System.out.printf("Monthly Payment: " + "%.2f%n", monthlyPayment);
		System.out.printf("Total Amount paid over life: " + "%.2f%n", totalAmountPaid );
	}
}

public class CalculateLoan {

	public static void main(String[] args) {
		LoanAmortizationCalculator LAC = new LoanAmortizationCalculator();
		LAC.acceptRecord();
		LAC.calculateMonthlyPayment();
		LAC.printRecord();
	}

}
