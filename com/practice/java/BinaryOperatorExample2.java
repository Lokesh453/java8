package com.practice.java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample2 {


    public static void main(String[] args) {
        BinaryOperatorExample2 binaryOperatorExample2 = new BinaryOperatorExample2();

        Employee employee = new Employee("Lokesh", "Eather", 75000.0);
        Employee employee2 = new Employee("Kiran", "Gather", 13000.0);
        Employee employee3 = new Employee("Naresh", "Caremore", 23000.0);
        Employee employee4 = new Employee("Shubhash", "Gym", 23200.0);
        List<Employee> employees = Arrays.asList(employee, employee4, employee2, employee3);
        //find the highest paid employee
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getSalary);
        Employee emp = binaryOperatorExample2.findEmployee(employees, BinaryOperator.maxBy(employeeComparator));
        System.out.println("Employee info is " + emp.getName());

        //find lowest paid employee
        Employee lowestPaidemp = binaryOperatorExample2.findEmployee(employees, BinaryOperator.minBy(employeeComparator));
        System.out.println("Employee info is " + lowestPaidemp.getName());
        List<Integer> integers = Arrays.asList(1, 5, 2, 6, 3, 8, 19);
        Integer smallest = binaryOperatorExample2.findInteger(integers,BinaryOperator.minBy(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Lowest Integers  is " + smallest);

        Integer largest = binaryOperatorExample2.findInteger(integers,BinaryOperator.maxBy(Comparator.comparingInt(Integer::intValue)));
        System.out.println("Largest Integers  is " + largest);

        System.out.println("Employee info is " + lowestPaidemp.getName());
    }

    Employee findEmployee(List<Employee> employees, BinaryOperator<Employee> binaryOperator) {
        Employee result = null;
        for (Employee employee : employees) {
            if (result == null) {
                result = employee;
            } else {
                result = binaryOperator.apply(result, employee);
            }
        }

        return result;
    }

    public Integer findInteger(List<Integer> integers, BinaryOperator<Integer> binaryOperator) {
        Integer result = 1;
        for (Integer integer : integers) {
            if (integer == 1) {
                result = integer;
            } else {
                result = binaryOperator.apply(result, integer);
            }
        }
        return  result;
    }
}
