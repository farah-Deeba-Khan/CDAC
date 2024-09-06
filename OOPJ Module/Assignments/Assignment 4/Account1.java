package org.example;

import java.util.Scanner;

class AccountDetails1{
	String name;
	Long AccountNo;
	String IFSC_Code;
	String Branch;
	
	public void getDetails() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Holder Name: ");
		name  = sc.nextLine();
		//this.name = sc.nextLine();         // can access through this also
		
		System.out.println("Enter AccountNo: ");
		this.AccountNo = sc.nextLong();
		
		sc.nextLine(); 						// to jump in next line.
		
		System.out.println("Enter IFSC_Code: ");
		this.IFSC_Code = sc.nextLine();
		
		System.out.println("Enter Branch: ");
		this.Branch = sc.nextLine();
	}
	
	public void displayDetails1() {
		String name = "farah";             // local variable will get priority first
		System.out.println("Account Holder Name: " +name);
		System.out.println("AccountNo: " +AccountNo);
		System.out.println("IFSC_Code: " +IFSC_Code);
		System.out.println("Branch Name: " +Branch);
	}
}


public class Account1 {

	public static void main(String[] args) {
		AccountDetails1 acc = new AccountDetails1();
		acc.getDetails();
		acc.displayDetails1();

	}
}

