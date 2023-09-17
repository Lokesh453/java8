package com.practice.java;

public class Employee {

    private String name;

    public Employee() {
    }

    public Employee(String name, String employer, Double salary) {
        this.name = name;
        this.employer = employer;
        this.salary = salary;
    }

    private String employer;

    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
