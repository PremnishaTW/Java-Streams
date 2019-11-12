package org.streamOperations;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeRegistry {

    public static void main(String[] args) {
        Faker faker = new Faker();

        // Initialize Employees
        Employee employee_1 = new Employee(1, "Rebecca Parsons", EmployeeRole.QA, faker.streetAddress(true), LocalDate.of(2019, 10,15));
        Employee employee_2 = new Employee(2, "Geetha Kannan", EmployeeRole.BA, faker.streetAddress(true), LocalDate.of(2019, 11,10));
        Employee employee_3 = new Employee(3, "Reshma Saujani", EmployeeRole.DEV, faker.streetAddress(true), LocalDate.of(2019, 01,19));
        Employee employee_4 = new Employee(4, "Sudha Murthy", EmployeeRole.PM, faker.streetAddress(true), LocalDate.of(2019, 06,22));
        Employee employee_5 = new Employee(5, "Ashwini Asokan", EmployeeRole.QA, faker.streetAddress(true), LocalDate.of(2019, 01,13));

        List<Employee> list = Arrays.asList(employee_1, employee_2, employee_3, employee_4, employee_5);
        EmployeeList employeeList = new EmployeeList(list);

        // Create Employee Stream (Stream.of)
        Stream<Employee> employeeStream = Stream.of(employee_1, employee_2, employee_3, employee_4, employee_5);
    }
}
