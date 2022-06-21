package lab_07_salary;

import java.util.Arrays;
import java.util.List;

public class TotalSalary {
    public static void main(String[] args) {
        TotalSalary totalSalary = new TotalSalary();
        Employee full1 = new FulltimeEmployee(50000);
        Employee full2 = new FulltimeEmployee(50000);
        Employee full3 = new FulltimeEmployee(50000);
        Employee cont1 = new ContractEmployee(40000);
        Employee cont2 = new ContractEmployee(40000);
        int total = totalSalary.salary((Arrays.asList(full1, full2, full3, cont1, cont2)));
        System.out.println("Total salary is: " + total);

    }

    public int salary(List<Employee> employeeList) {
        int salary = 0;
        for (Employee employee : employeeList) {
            salary = salary + employee.getSalary();

        }
        return salary;
    }
}
