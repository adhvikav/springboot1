package com.example.employee;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employees")
public class Employee {

    @Id
    private String id;
    private String name;
    private String role;
    private double salary;

    public Employee() {}

    public Employee(String id, String name, String role, double salary) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee{id='%s', name='%s', role='%s', salary=%.2f}", id, name, role, salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
