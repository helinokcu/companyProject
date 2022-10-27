package com.example.companymanagement.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String eMail;
    @ManyToOne
    @JoinColumn(name = "demands_id")
    private Demand demands;

}
