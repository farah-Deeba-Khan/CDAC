package org.assignment;
import java.util.Scanner;

class Calculation{
	private double orignalPrice;
	private double discountAmount;
	private double discountRate;
	private double finalPrice;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter originalPrice: ");
		orignalPrice = sc.nextDouble();
		
		System.out.println("Enter discountRate: ");
		discountRate = sc.nextDouble();
		
	}
	
	public void calculateDiscount() {
		discountAmount = orignalPrice * (discountRate/100);
		finalPrice = orignalPrice - discountAmount;
	}
	public void printRecord() {
		System.out.println("DiscountAmount: " + discountAmount);
		System.out.println("Final: " + finalPrice);
	}
}

public class DiscountCalculator {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.acceptRecord();
		cal.calculateDiscount();
		cal.printRecord();
		
	}
}
