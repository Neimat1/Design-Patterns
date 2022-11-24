package structural.patterns.composite;

public class Developer  implements Employee{
    private String name;
    private String department;
    private String role;

    public Developer(String name, String department,String role) {
        this.name = name;
        this.department = department;
        this.role=role;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println("Name : " + name  + ", Role : " + role+ ", Department : " + department);
    }
}
