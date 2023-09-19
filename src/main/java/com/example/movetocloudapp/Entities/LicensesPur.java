package com.example.movetocloudapp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LicensesPur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nodeType ;
    private String sku;
    private String provider;
    private int qty;
    @Temporal(TemporalType.DATE)
    private Date actDate;
    @Temporal(TemporalType.DATE)
    private Date expDate;
    private int annee;
    private int duration;

    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;
}
