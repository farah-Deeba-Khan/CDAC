package org.example;

//1. Design and implement a class named InstanceCounter to track 
// and count the number of instances created from this class.

public class InstanceCounter {

	static int count = 0;
	{
		count++;
	}
	public static void main(String[] args) {
		InstanceCounter obj = new InstanceCounter();
		InstanceCounter obj2 = new InstanceCounter();
		InstanceCounter obj3 = new InstanceCounter();
		System.out.println("Instance Count: " + InstanceCounter.count);
		}

}
