package com.company.employees;

import java.util.*;

public class EmployeeDemo {

    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {
        int employeeCount = 0;
        while (true) {
            if (employeeCount >= 3) {
                break;
            }
            System.out.println("Enter employee name: ");
            String name = new Scanner(System.in).nextLine();

            System.out.println("Enter salary: ");
            Integer salary = new Scanner(System.in).nextInt();

            System.out.println("Enter age: ");
            Integer age = new Scanner(System.in).nextInt();

            System.out.println("Enter position: ");
            String position = new Scanner(System.in).nextLine();

            Employee employee = new Employee(salary, name, age, position);
            employees.add(employee);

            employeeCount++;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void employeeSortingDemo() {
        Employee e1 = new Employee(15000, "David", 46, "Developer");
        Employee e2 = new Employee(150000, "Yosi", 33, "CEO");
        Employee e3 = new Employee(1000, "Peter", 14, "Waiter");
        Employee e4 = new Employee(12000, "Peter", 30, "Junior Developer");
        Employee e5 = new Employee(15000, "David", 30, "Junior Developer");
        Employee e6 = new Employee(150000, "Yosi", 30, "Super Tech Leader");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);

//            System.out.println(employee);
//            System.out.println(employees.get(i));
        }

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        Collections.sort(employees);

        System.out.println("***********");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        //[ e1, e2, e3, e4, e5, e6 ]
        //Comparable
        //compareTo(e2)

        //Comparator
        //compare(e6, e3)

        String [] strings = new String[] {"a", "b", "c"};
        System.out.println(Arrays.toString(strings));
        List<String> list = Arrays.asList(strings);
        System.out.println(list);

        System.out.println("Enter your name:");
        String nameFromConsole = new Scanner(System.in).nextLine();

        System.out.println("The name is " + nameFromConsole);
    }
}
