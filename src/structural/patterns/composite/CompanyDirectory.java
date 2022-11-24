package structural.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }


    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }



    @Override
    public void showEmployeeDetails() {
        for (Employee employee:employeeList){
            employee.showEmployeeDetails();
        }

    }
}
