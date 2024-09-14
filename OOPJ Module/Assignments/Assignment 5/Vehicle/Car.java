package CarModelExample;

public class Car extends Vehicle {

	private String model;
	
	public Car(String make, int year, String model) {
		super(make, year);
		this.model = model;
	}
	
	public void carDetails(){
		System.out.println("Make: " + getMake());
		System.out.println("Year: " + getYear());
		System.out.println("Model: " + this.model);
	}
}
