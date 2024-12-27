package pack2;

import java.util.LinkedList;
import java.util.List;
import pack1.Employee;

public class Main5 {

    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1, "Pratik", 60000));
        employeeList.add(new Employee(2, "Shreyas", 70000));
        employeeList.add(new Employee(3, "Aniket", 65000));
        employeeList.add(new Employee(4, "Utkarsh", 85000));
        employeeList.add(new Employee(5, "Apurav", 80000));

      
        for (Employee emp : employeeList) {
            System.out.println("Name: " + emp.getName() + ", Net Salary: " + emp.getNetSalary());
        }

        double totalNetSalary = 0;
        for (Employee emp : employeeList) {
            totalNetSalary += emp.getNetSalary();
        }

        System.out.println("Total Net Salary of all employees: " + totalNetSalary);
    }
}
