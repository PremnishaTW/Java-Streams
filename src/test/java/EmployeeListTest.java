import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeListTest {

    private static EmployeeList employeeList;

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll init() method called");

        Faker faker = new Faker();

//        Initalize employees
        Employee employee_1 = new Employee(1, "Rebecca Parsons", EmployeeRole.DEV, faker.streetAddress(true));
        Employee employee_2 = new Employee(2, "Geetha Kannan", EmployeeRole.BA, faker.streetAddress(true));
        Employee employee_3 = new Employee(3, "Reshma Saujani", EmployeeRole.DEV, faker.streetAddress(true));
        Employee employee_4 = new Employee(4, "Sudha Murthy", EmployeeRole.PM, faker.streetAddress(true));
        Employee employee_5 = new Employee(5, "Ashwini Asokan", EmployeeRole.QA, faker.streetAddress(true));

        List<Employee> list = Arrays.asList(employee_1, employee_2, employee_3, employee_4, employee_5);
        employeeList = new EmployeeList(list);
    }

    @Test
    public void shouldReturnAllEmployeesForGivenRole() {
        List<Employee> allEmployeesWithRoleDev = employeeList.getAllEmployeesForRole(EmployeeRole.DEV);
        assertEquals(allEmployeesWithRoleDev.size(), 2);
    }

    @Test
    public void shouldReturnEmployeeForGivenRole() {
        Optional<Employee> firstEmployeeWithRoleDev = employeeList.getEmployeeForRole(EmployeeRole.DEV);

        assertTrue(firstEmployeeWithRoleDev.isPresent());
    }




}