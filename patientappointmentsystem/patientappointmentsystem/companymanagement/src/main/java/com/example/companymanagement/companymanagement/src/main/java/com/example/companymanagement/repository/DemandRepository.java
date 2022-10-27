package com.example.companymanagement.repository;

import com.example.companymanagement.model.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandRepository extends JpaRepository<Demand,String> {
}
