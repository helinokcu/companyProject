package com.example.companymanagement.controller;

import com.example.companymanagement.Dto.ManagerDto;
import com.example.companymanagement.Service.ManagerService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping
public class ManagerController {
    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }


    @PostMapping(value = "/createManager")
    public ResponseEntity<ManagerDto> createEmployee(@RequestBody ManagerDto managerDto){
        ManagerDto request=managerService.createManager(managerDto);
        return ResponseEntity.ok(request);
    }
}
