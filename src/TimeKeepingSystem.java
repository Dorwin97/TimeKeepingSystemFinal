import java.util.Scanner;

public class TimeKeepingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TimeClock timeClock = new TimeClock();

        HourlyEmployee hourlyEmployee = new HourlyEmployee("John Doe", 101, 15.0);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Jane Smith", 102, 4000.0);
        timeClock.addEmployee(hourlyEmployee);
        timeClock.addEmployee(salariedEmployee);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Clock In");
            System.out.println("2. Clock Out");
            System.out.println("3. Record Hours Worked");
            System.out.println("4. Print Payroll");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    timeClock.clockIn();
                    break;
                case 2:
                    timeClock.clockOut();
                    break;
                case 3:
                    System.out.print("Enter hours worked: ");
                    double hours = scanner.nextDouble();
                    timeClock.recordHoursWorked(hours);
                    break;
                case 4:
                    timeClock.printPayroll();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 5);
    }
}
