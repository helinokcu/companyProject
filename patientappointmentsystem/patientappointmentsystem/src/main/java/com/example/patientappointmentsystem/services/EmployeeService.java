package com.example.patientappointmentsystem.services;

import com.example.patientappointmentsystem.Dto.EmployeeDto;
import com.example.patientappointmentsystem.model.Employee;
import com.example.patientappointmentsystem.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }
    public EmployeeDto createEmployee(EmployeeDto employeeDto){
        Employee employee=modelMapper.map(employeeDto,Employee.class);
        employee.setFirstName(employeeDto.getFirstName());
        employee.setLastName(employeeDto.getLastName());
        employee.setEMail(employeeDto.getEMail());
        return modelMapper.map(employeeRepository.save(employee),EmployeeDto.class);


    }
}
