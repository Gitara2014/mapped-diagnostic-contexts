package com.bane.mdc.controller;

import com.bane.mdc.domain.Employee;
import com.bane.mdc.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public Employee getEmployee(@RequestParam("id") String id) {

        logger.info("Employee: " + id);

        return employeeService.getEmployeeInfo(Long.getLong(id));
    }
}
