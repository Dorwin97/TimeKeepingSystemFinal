import java.util.ArrayList;
import java.util.List;

// This code snippet defines a Java class called `TimeClock`, which implements the `ClockInSystem` interface.

public class TimeClock implements ClockInSystem {
    private boolean clockedIn; // Private member variable to track whether the time clock is currently clocked in or not.
    private double totalHoursWorked; // Private member variable to store the total hours worked.
    private List<Employee> employees; // Private member variable to store the list of employees.

    public TimeClock() {
        clockedIn = false; // Initialize the time clock as not clocked in.
        totalHoursWorked = 0.0; // Initialize the total hours worked as 0.
        employees = new ArrayList<>(); // Initialize the list of employees as an empty ArrayList.
    }

    public void addEmployee(Employee employee) {
        employees.add(employee); // Method to add an employee to the list of employees.
    }

    @Override
    public void clockIn() {
        if (clockedIn) {
            System.out.println("You are already clocked in."); // Print a message if already clocked in.
        } else {
            clockedIn = true; // Set the clockedIn flag to true.
            System.out.println("Clocked in successfully."); // Print a success message.
        }
    }

    @Override
    public void clockOut() {
        if (!clockedIn) {
            System.out.println("You are not clocked in."); // Print a message if not clocked in.
        } else {
            clockedIn = false; // Set the clockedIn flag to false.
            System.out.println("Clocked out successfully."); // Print a success message.
        }
    }

    public void recordHoursWorked(double hours) {
        if (clockedIn) {
            totalHoursWorked += hours; // Add the recorded hours to the total hours worked.
            System.out.println("Recorded " + hours + " hours worked."); // Print a success message with the recorded hours.
        } else {
            System.out.println("You need to clock in before recording hours worked."); // Print an error message if not clocked in.
        }
    }

    public void printPayroll() {
        System.out.println("Payroll:");
        for (Employee employee : employees) {
            double salary = employee.calculateSalary(); // Calculate the salary for each employee.
            System.out.println("Employee: " + employee.getName() +
                    ", Employee ID: " + employee.getEmployeeId() +
                    ", Salary: $" + salary); // Print the employee details and salary.
        }
    }
}
