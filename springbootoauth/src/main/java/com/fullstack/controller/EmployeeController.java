package com.fullstack.controller;

import com.fullstack.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employeeList = Stream.of(new Employee(121, "SWARA", 98000),
            new Employee(111, "RUPESH", 58000),
            new Employee(191, "BHUMI", 78000)).toList();

    @GetMapping("/list")
    public ResponseEntity<List<Employee>> findAll() {
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping("/sortbyid")
    public ResponseEntity<List<Employee>> sortById() {
        return ResponseEntity.ok(employeeList.stream().sorted(Comparator.comparing(Employee::getEmpId)).toList());
    }

    @GetMapping("/sortbyname")
    public ResponseEntity<List<Employee>> sortByName() {
        return ResponseEntity.ok(employeeList.stream().sorted(Comparator.comparing(Employee::getEmpName)).toList());
    }

    @GetMapping("/findbyname/{empName}")
    public ResponseEntity<List<Employee>> findByName(@PathVariable String empName) {
        return ResponseEntity.ok(employeeList.stream().filter(emp -> emp.getEmpName().equals(empName)).toList());
    }


}
