// This code snippet defines a Java class called `SalariedEmployee`, which extends the `Employee` abstract class.

public class SalariedEmployee extends Employee {
    private double monthlySalary; // Private member variable to store the monthly salary of the employee.

    public SalariedEmployee(String name, int employeeId, double monthlySalary) {
        super(name, employeeId); // Call the constructor of the superclass (`Employee`) to initialize the name and employee ID.
        this.monthlySalary = monthlySalary; // Initialize the monthly salary of the employee.
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; // Return the monthly salary of the employee.
    }
}

// The `SalariedEmployee` class extends the `Employee` abstract class and represents a specific type of employee who is paid a fixed monthly salary.

// It includes:
// - Private member variable `monthlySalary` to store the monthly salary of the employee.
// - A constructor that accepts the employee's name, ID, and monthly salary, and initializes the corresponding member variables.
// - The `calculateSalary()` method, which overrides the abstract method from the superclass (`Employee`), to return the monthly salary.

