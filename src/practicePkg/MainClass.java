package practicePkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(2, 4, 5, 6, 7, 8, 10);

        // Practice1.sumOfEven(l1);

        List<Employee> empList = new ArrayList<Employee>();

        empList.add(new Employee("HR", 200.0));
        empList.add(new Employee("HR", 300.0));
        empList.add(new Employee("HR", 400.0));
        empList.add(new Employee("HR", 500.0));
        empList.add(new Employee("HM", 1000.0));
        empList.add(new Employee("HM", 800.0));
        empList.add(new Employee("HM", 5600.0));
        empList.add(new Employee("HM", 290.0));
        empList.add(new Employee("Test", 800.0));
        empList.add(new Employee("Test", 5600.0));
        empList.add(new Employee("Test", 290.0));

        // print Department name and salary of employee
        Map<String, Double> departmentAverageSalaryMap = empList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        departmentAverageSalaryMap.forEach((department, averageSalary) -> {
            System.out.println("Department: " + department + ", Average Salary: " + averageSalary);
        });

        List<Employee> empList2 = new ArrayList<Employee>();
        empList2.add(new Employee("HR", 300.0, "Sanjay"));
        empList2.add(new Employee("HR", 300.0, "ajay"));
        empList2.add(new Employee("HR", 500.0, "Uday"));

        // Print name of employee
        empList2.stream().map(Employee::getName).collect(Collectors.toList()).forEach(System.out::println);

        // Average salary
        double averageSalary = empList2.stream().collect(Collectors.averagingDouble(emp -> emp.getSalary()));
        System.out.println(averageSalary);


        //Increment in salary by 10%
        empList2.stream().map(employee -> {
            double incSalary = employee.getSalary() * 1.10;
            employee.setSalary(incSalary);
            return employee;
        }).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("Incremant those whose salary more the 500");
        //Increment Salary of those employee which salary is more the 500.
        empList.stream().map(emp -> {
            if (emp.getSalary() >= 500) {
                double incSalary1 = emp.getSalary() * 1.10;
                emp.setSalary(incSalary1);
            }
            return emp;
        }).collect(Collectors.toList()).forEach(System.out::println);


    }
}
