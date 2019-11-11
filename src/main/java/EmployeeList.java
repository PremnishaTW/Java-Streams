import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<Employee> getAllEmployeesForRole(EmployeeRole role) {
        return employeeList.stream().filter(employee -> employee.getRole() == role).collect(Collectors.toList());
    }

    public Optional<Employee> getEmployeeForRole(EmployeeRole role) {
        return employeeList.stream().filter(employee -> employee.getRole() == role).findFirst();
    }
}
