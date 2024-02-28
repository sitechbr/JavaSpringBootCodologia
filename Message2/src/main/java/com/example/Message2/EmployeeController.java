package com.example.Message2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;



    @GetMapping("/employees")
    public Iterable<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    @PostMapping("/employees")
    public Employee addOneEmployee(@RequestBody Employee employee) {
        return this.employeeRepository.save(employee);
    }
}