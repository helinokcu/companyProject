package com.example.patientappointmentsystem.Dto;

import com.example.patientappointmentsystem.model.Demand;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private String id;
    private String firstName;
    private String lastName;
    private String eMail;
    private List<Demand> demands;
}
