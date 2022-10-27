package com.example.companymanagement.Dto;

import com.example.companymanagement.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemandDto {
    private Employee employee;
    private LocalDateTime localDateTime;
    private boolean accept;
}
