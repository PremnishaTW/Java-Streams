package org.streamOperations;

import java.util.List;
import java.util.stream.Collectors;

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
        return null;
    }

    /**
     * Demo for short circuit terminal operation - anyMatch
     * @param role
     * @return boolean if employeeList has employee with role
     */
    public boolean isEmployeeWithRolePresent(EmployeeRole role) {
        return false;
    }

    public List<Employee> getEmployeeListByLimit(Integer limit) {
        return null;
    }
}
