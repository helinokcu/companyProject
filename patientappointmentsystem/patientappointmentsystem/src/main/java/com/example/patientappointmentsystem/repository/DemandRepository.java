package com.example.patientappointmentsystem.repository;

import com.example.patientappointmentsystem.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandRepository extends JpaRepository<Demand,String> {
}
