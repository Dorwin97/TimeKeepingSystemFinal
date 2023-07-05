// This code snippet defines a Java abstract class called `Employee`.

public abstract class Employee {
    private String name; // Private member variable to store the employee's name.
    private int employeeId; // Private member variable to store the employee's ID.

    public Employee(String name, int employeeId) {
        this.name = name; // Initialize the employee's name.
        this.employeeId = employeeId; // Initialize the employee's ID.
    }

    public abstract double calculateSalary(); // Abstract method for calculating the employee's salary.

    public String getName() {
        return name; // Getter method to retrieve the employee's name.
    }

    public int getEmployeeId() {
        return employeeId; // Getter method to retrieve the employee's ID.
    }
}

// The `Employee` class is an abstract class that provides a blueprint for creating specific types of employees. It includes:
// - Private member variables `name` and `employeeId` to store the employee's name and ID, respectively.
// - A constructor that accepts the employee's name and ID and initializes the corresponding member variables.
// - An abstract method `calculateSalary()` that must be implemented by concrete subclasses to calculate the employee's salary.
// - Getter methods `getName()` and `getEmployeeId()` to retrieve the employee's name and ID, respectively.

