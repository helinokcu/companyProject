package com.example.patientappointmentsystem.Dto;

import com.example.patientappointmentsystem.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDto {
    private String managerName;
    private String managerSurname;
    private List<Employee> employees;

}
