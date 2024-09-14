//	Create a base class Animal with attributes like name, and methods like eat() and sleep(). 
// Create a subclass Dog that inherits from Animal and has an additional method bark().
// Write a program to demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.
package com.animal;

public class Animal {

	private String name;
	
//	public Animal(String name) {
//		super();
//		this.name = name;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(name+ " eats");
	}
	
	public void sleep() {
		System.out.println(name+ " sleeps");
	}
}
