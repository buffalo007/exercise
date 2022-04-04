package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Peter", 2500, "IT", Arrays.asList(new Role("Admin"))),
                new Employee("Peter", 2500, "IT", Arrays.asList(new Role("Admin"), new Role("User"))),
                new Employee("Erik", 4000, "IT", Arrays.asList(new Role("Admin"), new Role("User"))),
                new Employee("Joshep", 1500, "HR",Arrays.asList(new Role("Admin"))),
                new Employee("John", 3500, "IT" , Arrays.asList(new Role("Admin"), new Role("User")))

        );

        Map<String, List<Employee>> groupEmployeeByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(groupEmployeeByDepartment);

        OptionalDouble averageSalary = employees.stream()
                .mapToInt(employee -> employee.getSalary())
                .average();

        System.out.println(averageSalary.isPresent() ? averageSalary : 0);

        List<Employee> userRole = employees.stream()
                .filter(employee -> employee.getRoles()
                        .stream()
                        .anyMatch(role -> role.getRole().equalsIgnoreCase ("User")))
                .collect(Collectors.toList());

        System.out.println(userRole);

        List<Employee> employeeWithPriceIncrease = employees.stream()
                .map(employee -> new Employee(employee.getName(), employee.getSalary() * 2, employee.getDepartment(), employee.getRoles()))
                .collect(Collectors.toList());

        System.out.println(employeeWithPriceIncrease);
    }
}
