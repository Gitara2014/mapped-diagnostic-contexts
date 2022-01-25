package com.bane.mdc.service;

import com.bane.mdc.domain.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    public Employee getEmployeeInfo(Long id){
        //dummy Employee
        Employee employee = new Employee(id, "Mark Smith", 33);
        logger.info(employee.toString());

        return employee;
    }
}
