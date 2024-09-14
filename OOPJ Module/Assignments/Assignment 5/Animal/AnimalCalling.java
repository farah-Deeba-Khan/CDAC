package com.animal;

public class AnimalCalling {

	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal.setName("Bella");
		animal.getName();
		animal.eat();
		animal.sleep();

		Dog dog = new Dog();
		dog.setName("Spark");
		dog.getName();
		dog.eat();
		dog.sleep();
		dog.bark();
	}

}
