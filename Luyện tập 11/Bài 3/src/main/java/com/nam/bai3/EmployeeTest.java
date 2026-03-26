
package com.nam.bai3;

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nam", 1200),
                new Employee(2, "An", 800),
                new Employee(3, "Binh", 1500),
                new Employee(4, "Cuong", 900)
        );

        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > 1000)     // lương > 1000
                .map(Employee::getName)                // lấy tên
                .sorted()                             // sắp xếp alphabet
                .collect(Collectors.toList());        // gom vào list

        System.out.println(result);
    }
}