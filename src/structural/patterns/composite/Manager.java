package structural.patterns.composite;

public class Manager  implements Employee{
    private String name;
    private String department;
    private String role;

    public Manager(String name, String department,String role) {
        this.name = name;
        this.department = department;
        this.role=role;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name : " + name  + ", Role : " + role+ ", Department : " + department);
    }
}
