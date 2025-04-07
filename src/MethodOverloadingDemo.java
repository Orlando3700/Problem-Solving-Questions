public class MethodOverloadingDemo {

    // Method overloading by varying the number of arguments
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded version)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles (overloaded version)
    public double add(double a, double b) {
        return a + b;
    }

    // Method overloading by changing types of parameters
    // Method to display a string
    public void display(String message) {
        System.out.println("String Message: " + message);
    }

    // Method to display an integer (overloaded version)
    public void display(int number) {
        System.out.println("Integer Message: " + number);
    }

    // Method to display both string and integer
    public void display(String message, int number) {
        System.out.println("Message: " + message + " | Number: " + number);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        
        // Calling add methods
        System.out.println("Sum of 10 and 20: " + demo.add(10, 20));
        System.out.println("Sum of 10, 20, and 30: " + demo.add(10, 20, 30));
        System.out.println("Sum of 10.5 and 20.5: " + demo.add(10.5, 20.5));

        // Calling display methods
        demo.display("Hello, World!");  // Display string
        demo.display(100);              // Display integer
        demo.display("Total", 100);     // Display both string and integer
    }
}
//Explanation:
//Method Overloading by Number of Arguments:
//We have two versions of the add() method:
//One that takes two integer arguments.
//One that takes three integer arguments.
//One that takes two double arguments.
//This demonstrates how you can overload a method by changing the number of parameters passed to it.
//Method Overloading by Changing Parameter Types:
//The display() method is overloaded with different parameter types:
//One method accepts a String.
//One method accepts an int.
//One method accepts both a String and an int.


