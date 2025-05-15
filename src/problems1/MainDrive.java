package problems1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainDrive {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 60000));
        employees.add(new Employee("Alice", 75000));
        employees.add(new Employee("Bob", 70000));
        employees.add(new Employee("Jane", 80000));

        // Sort the list of employees in descending order of salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.println(employees);

        // Check if there are at least two employees
        if (employees.size() >= 2) {
            // Get the second highest salary (the second element in the sorted list)
            Employee secondHighestSalaryEmployee = employees.get(1);
            System.out.println("The second highest salary is: " + secondHighestSalaryEmployee.getSalary());
            System.out.println(
                    "The employee with the second highest salary is: " + secondHighestSalaryEmployee.getName());
        } else {
            System.out.println("Not enough employees to determine the second highest salary.");
        }

    }
}
