// This code snippet defines a Java class called `HourlyEmployee`, which extends the `Employee` abstract class.

public class HourlyEmployee extends Employee {
    private double hourlyRate; // Private member variable to store the hourly rate of the employee.
    private double hoursWorked; // Private member variable to store the number of hours worked by the employee.

    public HourlyEmployee(String name, int employeeId, double hourlyRate) {
        super(name, employeeId); // Call the constructor of the superclass (`Employee`) to initialize the name and employee ID.
        this.hourlyRate = hourlyRate; // Initialize the hourly rate of the employee.
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked; // Calculate the salary by multiplying the hourly rate with the hours worked.
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked; // Setter method to set the number of hours worked by the employee.
    }
}

// The `HourlyEmployee` class extends the `Employee` abstract class and represents a specific type of employee who is paid based on an hourly rate.

// It includes:
// - Private member variables `hourlyRate` and `hoursWorked` to store the hourly rate and number of hours worked, respectively.
// - A constructor that accepts the employee's name, ID, and hourly rate, and initializes the corresponding member variables.
// - The `calculateSalary()` method, which overrides the abstract method from the superclass (`Employee`), to calculate the salary based on the hourly rate and hours worked.
// - A setter method `setHoursWorked()` to set the number of hours worked by the employee.

