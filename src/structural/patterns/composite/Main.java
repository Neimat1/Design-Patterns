package structural.patterns.composite;

public class Main {
    public static void main(String [] args){
        Employee developer1 = new Developer("Neimat","Engineering", "Developer");

        Employee manager1 = new Manager("Mark","Engineering", "Manager");

        CompanyDirectory companyDirectoryDevelopers = new CompanyDirectory();
        companyDirectoryDevelopers.addEmployee(developer1);

        CompanyDirectory companyDirectoryManagers = new CompanyDirectory();
        companyDirectoryManagers.addEmployee(manager1);


        CompanyDirectory companyDirectoryAccessAll = new CompanyDirectory();
        companyDirectoryAccessAll.addEmployee(companyDirectoryDevelopers);
        companyDirectoryAccessAll.addEmployee(companyDirectoryManagers);

        companyDirectoryAccessAll.showEmployeeDetails();
    }
}
