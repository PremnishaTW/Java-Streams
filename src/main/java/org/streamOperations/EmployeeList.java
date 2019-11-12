package org.streamOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeList {
    private List<Employee> employeeList;

    public EmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    /**
     * Demo for filter and collect operations
     * @param role
     * @return list of employees for a given role
     */
    public List<Employee> getAllEmployeesForRole(EmployeeRole role) {
        return employeeList.stream().filter(employee -> employee.getRole() == role).collect(Collectors.toList());
    }

    /**
     * Demo for short circuit terminal operation - anyMatch
     * @param role
     * @return boolean if employeeList has employee with role
     */
    public boolean isEmployeeWithRolePresent(EmployeeRole role) {
        return employeeList.stream().anyMatch(employee -> employee.getRole() == role);
    }

    public List<Employee> getEmployeeListByLimit(Integer limit) {
        return employeeList.stream().limit(limit).collect(Collectors.toList());
    }
}
