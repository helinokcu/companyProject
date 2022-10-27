package com.example.companymanagement.Service;

import com.example.companymanagement.Dto.ManagerDto;
import com.example.companymanagement.model.Manager;
import com.example.companymanagement.repository.ManagerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    private final ModelMapper modelMapper;
    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository, ModelMapper modelMapper, ManagerRepository managerRepository1) {
        this.modelMapper = modelMapper;
        this.managerRepository = managerRepository1;
    }

    public ManagerDto createManager(ManagerDto managerDto){
        Manager manager=modelMapper.map(managerDto,Manager.class);
        manager.setFirstName(managerDto.getFirstName());
        manager.setLastName(manager.getLastName());
        return modelMapper.map(managerRepository.save(manager), ManagerDto.class);
    }



}
