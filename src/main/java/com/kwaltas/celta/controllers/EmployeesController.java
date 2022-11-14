package com.kwaltas.celta.controllers;

import com.kwaltas.celta.entities.Employee;
import com.kwaltas.celta.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("Enrique");
        employee.setEmail("muasdas@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Kwaltas");
        employee.setProfile("kwaltas03");
        employee.setPassword("123456789");
        return employee;
    }



    @RequestMapping(value = "/employees21321")
    public Employee deleteEmployees() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Enrique");
        employee.setEmail("muasdas@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Kwaltas");
        employee.setProfile("kwaltas03");
        employee.setPassword("123456789");
        return employee;


    }

    @RequestMapping(value = "/employees2145621")
    public Employee modifyEmployees() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Enrique");
        employee.setEmail("muasdas@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Kwaltas");
        employee.setProfile("kwaltas03");
        employee.setPassword("123456789");
        return employee;
    }


        @RequestMapping(value = "/employees2564")
    public Employee searchEmployees() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setName("Enrique");
        employee.setEmail("muasdas@gmail.com");
        employee.setRole("Developer");
        employee.setEnterprise("Kwaltas");
        employee.setProfile("kwaltas03");
        employee.setPassword("123456789");
        return employee;
    }


}
