package Inheritance;

//In Java, it is possible to inherit attributes and methods from
//one class to another. We group the "inheritance concept" into
//two categories:
//subclass (child) - the class that inherits from another class
//superclass (parent) - the class being inherited from
//To inherit from a class, use the extends keyword.

public class Car {
	
	private String model;
	private String make;
	private int year;
	
	//Constructor
	public Car(String model, String make, int year) {
		this.model = model;
		this.make = make;
		this.year = year;
	}
	
	public void start() {
		System.out.println("The car is starting");
	}
	
	public void stop() {
		System.out.println("The car is stopping");
	}
	
	public void turn() {
		System.out.println("The car is turning");
	}
	
	public void displayInfo() {
		System.out.println("Car Info: " + make + " " + model + " " + year );
	}

}

