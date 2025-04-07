package Inheritance;

public class SportsCar extends Car{

		// Constructor that calls the parent class constructor
		public SportsCar(String model, String make, int year) {
			// Passing parameters to the parent class (Car) constructor
			super(model, make, year);
		}

		// Overriding the start method to add custom behavior
		@Override
		public void start() {
			System.out.println("The sports car is revving up!");
		}
		
		// Optionally, you can override other methods like stop() or turn()
		@Override
		public void turn() {
			System.out.println("The sports car is making a sharp turn!");
		}
	}