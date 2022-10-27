package com.example.patientappointmentsystem.repository;

import com.example.patientappointmentsystem.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager,String> {
}
