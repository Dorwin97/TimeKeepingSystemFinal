import java.util.Scanner;

// This code snippet defines a Java class called `TimeKeepingSystem`.

public class TimeKeepingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for user input.
        TimeClock timeClock = new TimeClock(); // Create an instance of `TimeClock`.

        HourlyEmployee hourlyEmployee = new HourlyEmployee("John Doe", 101, 15.0); // Create an instance of `HourlyEmployee`.
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane Smith", 102, 4000.0); // Create an instance of `SalariedEmployee`.
        timeClock.addEmployee(hourlyEmployee); // Add the `HourlyEmployee` to the `TimeClock`.
        timeClock.addEmployee(salariedEmployee); // Add the `SalariedEmployee` to the `TimeClock`.

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Clock In");
            System.out.println("2. Clock Out");
            System.out.println("3. Record Hours Worked");
            System.out.println("4. Print Payroll");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt(); // Read the user's choice from the input.

            switch (choice) {
                case 1:
                    timeClock.clockIn(); // Clock in the employees using the `TimeClock`.
                    break;
                case 2:
                    timeClock.clockOut(); // Clock out the employees using the `TimeClock`.
                    break;
                case 3:
                    System.out.print("Enter hours worked: ");
                    double hours = scanner.nextDouble(); // Read the hours worked from the input.
                    timeClock.recordHoursWorked(hours); // Record the hours worked using the `TimeClock`.
                    break;
                case 4:
                    timeClock.printPayroll(); // Print the payroll using the `TimeClock`.
                    break;
                case 5:
                    System.out.println("Exiting the program."); // Exit the program.
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // Print an error message for invalid choices.
            }
            System.out.println();
        } while (choice != 5); // Repeat the loop until the user chooses to exit.
    }
}

// The `TimeKeepingSystem` class represents the main entry point of the timekeeping system program.

// It includes:
// - The `main()` method, where the program execution starts.
// - A `Scanner` object to read user input.
// - An instance of `TimeClock` to manage the clock-in system and employees.
// - Instances of `HourlyEmployee` and `SalariedEmployee` to represent specific employees.
// - A menu-driven loop that allows users to choose various operations.
// - Switch statements to handle user choices and call the corresponding methods of the `TimeClock`.
