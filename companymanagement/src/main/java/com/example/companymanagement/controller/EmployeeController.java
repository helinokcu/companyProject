package com.example.companymanagement.controller;


import com.example.companymanagement.Dto.EmployeeDto;
import com.example.companymanagement.Service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(value = "/createEmployee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto request=employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(request);
    }




}

