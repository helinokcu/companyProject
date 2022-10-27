package com.example.patientappointmentsystem.repository;

import com.example.patientappointmentsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,String> {
}
