package com.company.employees;

public class Employee implements Comparable<Employee> {

    private Integer salary;
    private String name;
    private Integer age;
    private String position;

    public Employee(Integer salary, String name, Integer age, String position) {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 1 (any positive number) - this bigger
     * 0 - this and the incoming object (otherEmployee) are equal
     * -1 (any negative number) - otherEmployee is bigger
     *
     */

    /**
     * For ascending order (0..100): compare this with otherEmployee
     * For descending order (100..0): compare otherEmployee with this
     */
    @Override
    public int compareTo(Employee otherEmployee) {
        int comparisonResult = this.getName().compareTo(otherEmployee.getName());

        if (comparisonResult == 0) {
            comparisonResult = otherEmployee.getSalary().compareTo(this.getSalary());
        }

        if (comparisonResult == 0) {
            comparisonResult = this.getAge().compareTo(otherEmployee.getAge());
        }


        return comparisonResult;
    }
}
