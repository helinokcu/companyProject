package com.example.companymanagement.Service;

import com.example.companymanagement.Dto.ManagerDto;
import com.example.companymanagement.model.Manager;
import com.example.companymanagement.repository.ManagerRepository;
import org.modelmapper.ModelMapper;

public class ManagerService {
    private final ModelMapper modelMapper;

    public ManagerService(ManagerRepository managerRepository, ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

}
