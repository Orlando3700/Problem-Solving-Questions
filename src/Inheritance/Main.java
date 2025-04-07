package Inheritance;

public class Main {

	public static void main(String[] args) {
		
		Car myCar = new Car("Toyota", "Camry", 2022);
			
			myCar.displayInfo();
			myCar.start();
			myCar.turn();
			myCar.stop();
			
		// Creating an instance of SportsCar
		SportsCar mySportsCar = new SportsCar("Ferrari", "488 GTB", 2024);
		mySportsCar.displayInfo();  // Displays SportsCar info
		mySportsCar.start();       // Uses SportsCar start method (if overridden)
		mySportsCar.turn();
		mySportsCar.stop();
		}
	}
	