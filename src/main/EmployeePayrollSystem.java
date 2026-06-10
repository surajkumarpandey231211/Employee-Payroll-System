package main;

import dao.EmployeeDAO;
import model.Employee;

import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao =
                new EmployeeDAO();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE PAYROLL SYSTEM =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Delete Employee");
            System.out.println("4. Calculate Salary");
            System.out.println("5. Exit");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Employee ID : ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Name : ");
                    String name = sc.nextLine();

                    System.out.print("Department : ");
                    String dept = sc.nextLine();

                    System.out.print("Basic Salary : ");
                    double salary = sc.nextDouble();

                    Employee emp =
                            new Employee(
                                    id,
                                    name,
                                    dept,
                                    salary
                            );

                    dao.addEmployee(emp);

                    break;

                case 2:

                    dao.viewEmployees();

                    break;

                case 3:

                    System.out.print("Employee ID : ");

                    int deleteId =
                            sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 4:

                    System.out.print("Basic Salary : ");

                    double basic =
                            sc.nextDouble();

                    double hra =
                            basic * 0.20;

                    double da =
                            basic * 0.10;

                    double netSalary =
                            basic + hra + da;

                    System.out.println(
                            "Net Salary = "
                                    + netSalary);

                    break;

                case 5:

                    System.out.println(
                            "Thank You");

                    break;

                default:

                    System.out.println(
                            "Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}