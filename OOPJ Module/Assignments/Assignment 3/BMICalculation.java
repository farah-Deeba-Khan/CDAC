package org.BMI;

import java.util.Scanner;

class BMITracker {
	float weight;
	float height;
	float BMI;
	String classification;
	
	public void acceptRecords() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight in kgs: ");
		weight = sc.nextFloat();
		
		System.out.println("Enter Height in meters: ");
		height = sc.nextFloat();
	}
	
	public void calculateBMI() {
		BMI = weight / (height * height);
	}
	
	public void classifyBMI() {
		if(BMI < 18.5) {
			classification = "Underweight";
		}
		else if(BMI < 24.9) {
			classification = "Normal weight";
		}
		else if(BMI <= 29.9) {
			classification = "Overweight";
		}
		else {
			classification = "Obese";
		}
	}
	
	public void printRecords() {
		System.out.println("BMI :" + BMI);
		System.out.println("Classification: " + classification);
	}
}

public class BMICalculation {

	public static void main(String[] args) {
		BMITracker mass = new BMITracker();
		mass.acceptRecords();
		mass.calculateBMI();
		mass.classifyBMI();
		mass.printRecords();
	}

}
