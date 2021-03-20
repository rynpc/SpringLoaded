package com.example.payroll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BossController {

    private final EmployeeRepository repository;

    BossController(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/boss")
    List<Employee> all() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]
}
