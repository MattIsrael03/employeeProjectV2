package employee;

import java.util.Date;
import employee.*;
import employeeproject.v2.BasePlusCommissionEmployee;
import employee.HourlyEmployee;
import employee.employee;

public class TestMain {

    public static void main(String[] args) {
        employee employee1 = new HourlyEmployee(1, "Matt", new Date(), new Date(), 24, 40);
        employee employee2 = new HourlyEmployee(2, "JR", new Date(), new Date(), 24, 50);
        employee employee3 = new BasePlusCommissionEmployee(3, "Cecil", new Date(), new Date(), 3000, 4000);
        System.out.println("Employee 1:");
        employee1.displayInfo();

        System.out.println("\nEmployee 2:");
        employee2.displayInfo();

        System.out.println("\nEmployee 3:");
        employee3.displayInfo();

    }
}
