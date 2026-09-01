package EmployeeFolder;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee obj = new Employee();
        while (true) {
            System.out.println("Enter level: ");
            int level = sc.nextInt();
            obj.setLevel(level);
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            obj.setSalary(salary);
            System.out.println("The level is: " + obj.getLevel());
            System.out.println("The Salary is: " + obj.getSalary());
            System.out.println("Do you want to exit: ");
            char ch = sc.next().charAt(0);
            if (ch == 'y' || ch == 'Y') {
                System.exit(1);
            }
        }
    }
}