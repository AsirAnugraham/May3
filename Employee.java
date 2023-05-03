package strings;
import java.util.Scanner;
import java.util.ArrayList;

public class Employee {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Emp> empList = new ArrayList<>();
        while (true) {
            System.out.println("Please Select the below Menu Options:");
            System.out.println("1. Enter the employee details");
            System.out.println("2. Display the top three earners in the department");
            System.out.println("3. Exit from the application");

            int user = scanner.nextInt();
            switch(user) {

                case 1:
                    System.out.println("Enter the name of Employee:");
                    String employeeName = scanner.next();

                    System.out.println("Enter the Designation of Employee:");
                    String employeeDesignation = scanner.next();

                    System.out.println("Enter the Salary of Employee:");
                    int employeeSalary = scanner.nextInt();

                    Emp employee = new Emp(employeeName, employeeDesignation, employeeSalary);

                    empList.add(employee);
                    System.out.println("Employee details added Successfully");
                    break;
                case 2:
                    System.out.println("The Top three Earners are:");
                    if(empList.size() >= 3){
                        for(int i=0; i<3; i++){
                            System.out.println(empList.get(i).getEmployeeName() + "-" + empList.get(i).getEmployeeSalary());
                        }
                    }
                    else{
                        System.out.println("Not enough employees to display top earners.5 is minimum");
                    }
                    break;

                case 3:
                    System.out.println("Your application is closing..");
                    scanner.close();
                    System.exit(0);
            }
        }
    }
}

class Emp {
    private String employeeName;
    private String employeeDesignation;

    private int employeeSalary;

    public Emp(String employeeName, String employeeDesignation, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeDesignation = employeeDesignation;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}