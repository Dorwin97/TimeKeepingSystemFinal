//Dorwin Dorwing1@ubmc.edu

// This code snippet defines a Java interface called `ClockInSystem`.

public interface ClockInSystem {
    void clockIn(); // Method signature for clocking in an employee.
    void clockOut(); // Method signature for clocking out an employee.
}

// The `ClockInSystem` interface represents a contract for implementing a clock-in system. It declares two methods:
// 1. `clockIn()`: This method is responsible for recording an employee's clock-in time.
// 2. `clockOut()`: This method is responsible for recording an employee's clock-out time.

// Implementations of the `ClockInSystem` interface will need to provide the logic for these methods, such as capturing the current time, associating it with the employee, and storing the information in a suitable data structure or database.

