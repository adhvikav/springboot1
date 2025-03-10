package com.example.employee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }


    @Bean
    public CommandLineRunner demo(com.example.employee.EmployeeRepository repository) {
        return (args) -> {
            repository.save(new Employee("1", "John Doe", "Software Engineer", 70000));
            repository.save(new Employee("2", "Jane Smith", "Project Manager", 90000));
            repository.save(new Employee("3", "Sam Brown", "Business Analyst", 60000));

            repository.findAll().forEach(employee -> System.out.println(employee));
        };
    }
}
