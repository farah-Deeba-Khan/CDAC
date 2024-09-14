package com.carEngine;

public class engine {

	public static void main(String[] args) {
		Vehicle engine = new Vehicle();
		engine.startEngine();
		engine.stopEngine();
		
		Car carEngine = new Car();
		carEngine.startEngine();
		carEngine.stopEngine();
		
		Motorcycle motorcycleEngine = new Motorcycle();
		motorcycleEngine.startEngine();
		motorcycleEngine.stopEngine();
	}

}
