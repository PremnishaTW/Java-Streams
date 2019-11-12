package org.streamOperations;
import java.time.LocalDate;

public class Employee {
    private Integer id;
    private String name;
    private EmployeeRole role;
    private String address;
    private LocalDate date;

    public Employee(Integer id, String name, EmployeeRole role, String address, LocalDate date) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
        this.date = date;
    }

    public EmployeeRole getRole() {
        return role;
    }
}
