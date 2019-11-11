public class Employee {
    private Integer id;
    private String name;
    private EmployeeRole role;
    private String address;

    public Employee(Integer id, String name, EmployeeRole role, String address) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.address = address;
    }

    public EmployeeRole getRole() {
        return role;
    }
}
