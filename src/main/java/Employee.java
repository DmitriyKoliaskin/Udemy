public class Employee {

    private int id, age;
    private double salary;

    public double getSalary() {
        return salary;
    }

    private String surName, department;

    public Employee(int id, String surName, int age, String department, double salary) {
        this.id = id;
        this.surName = surName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public double salaryX2() {
        return this.salary * 2;
    }
}
