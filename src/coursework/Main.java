package coursework;

import java.util.Random;

import static java.lang.Math.*;

public class Main {

    private static final Employee[] EMPLOYEES = new Employee[10];

    public static void main(String[] args) {
        EMPLOYEES[0] = new Employee("Сотрудник 1", 1, 10000);
        EMPLOYEES[1] = new Employee("Сотрудник 2", 2, 20000);
        EMPLOYEES[2] = new Employee("Сотрудник 3", 3, 30000);
        EMPLOYEES[3] = new Employee("Сотрудник 4", 4, 40000);
        EMPLOYEES[4] = new Employee("Сотрудник 5", 5, 50000);
        EMPLOYEES[5] = new Employee("Сотрудник 6", 6, 60000);
        EMPLOYEES[6] = new Employee("Сотрудник 7", 7, 70000);
        EMPLOYEES[7] = new Employee("Сотрудник 8", 8, 80000);
        EMPLOYEES[8] = new Employee("Сотрудник 9", 9, 90000);
        EMPLOYEES[9] = new Employee("Сотрудник 10", 10, 110000);
        printFullInfo();
        System.out.println("Сумма ЗП: " + totalSalaries());
        System.out.println("Сотрудник с минимальной ЗП: " + findEmployeeWithMinSalary());
        System.out.println("Сотрудник с максимальной ЗП: " + findEmployeeWithMaxSalary());
        System.out.println("Средняя ЗП: " + findAverageSalary());
        printFullInfo();
    }


    private static void printFullInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee);
        }
    }

    private static int totalSalaries() {
        int sum = 0;
        for (Employee employee : EMPLOYEES) {
            sum += employee.getSalary();
        }
        return sum;
    }

    private static Employee findEmployeeWithMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() < min) {
                min = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static Employee findEmployeeWithMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee emp : EMPLOYEES) {
            if (emp.getSalary() > max) {
                max = emp.getSalary();
                employee = emp;
            }
        }
        return employee;
    }

    private static double findAverageSalary() {
        return totalSalaries() / (double) EMPLOYEES.length;
    }

    private static void printFullNameInfo() {
        for (Employee employee : EMPLOYEES) {
            System.out.println(employee.getFullName());
        }
    }
}


