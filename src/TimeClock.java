import java.util.ArrayList;
import java.util.List;

public class TimeClock implements ClockInSystem {
    private boolean clockedIn;
    private double totalHoursWorked;
    private List<Employee> employees;

    public TimeClock() {
        clockedIn = false;
        totalHoursWorked = 0.0;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void clockIn() {
        if (clockedIn) {
            System.out.println("You are already clocked in.");
        } else {
            clockedIn = true;
            System.out.println("Clocked in successfully.");
        }
    }

    @Override
    public void clockOut() {
        if (!clockedIn) {
            System.out.println("You are not clocked in.");
        } else {
            clockedIn = false;
            System.out.println("Clocked out successfully.");
        }
    }

    public void recordHoursWorked(double hours) {
        if (clockedIn) {
            totalHoursWorked += hours;
            System.out.println("Recorded " + hours + " hours worked.");
        } else {
            System.out.println("You need to clock in before recording hours worked.");
        }
    }

    public void printPayroll() {
        System.out.println("Payroll:");
        for (Employee employee : employees) {
            double salary = employee.calculateSalary();
            System.out.println("Employee: " + employee.getName() +
                    ", Employee ID: " + employee.getEmployeeId() +
                    ", Salary: $" + salary);
        }
    }
}
