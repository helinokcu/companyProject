package com.example.companymanagement.Service;

import com.example.companymanagement.Dto.DemandDto;
import com.example.companymanagement.model.Demand;
import com.example.companymanagement.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class DemandService {
    private final DemandService demandService;
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    public DemandService(DemandService demandService, EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.demandService = demandService;
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }



}
