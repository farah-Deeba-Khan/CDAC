// 5) Write a Java program to create a base class Vehicle with methods startEngine()
// and stopEngine().
// Create two subclasses Car and Motorcycle.
// Override the startEngine() and stopEngine() methods in each subclass to start
// and stop the engines differently.

package com.carEngine;

public class Vehicle {

	public void startEngine() {
		System.out.println("Vehicle Engine starts");
	}
	
	public void stopEngine() {
		System.out.println("Vehicle Engine stops");
	}
}
