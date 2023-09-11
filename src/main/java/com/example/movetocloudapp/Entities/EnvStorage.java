package com.example.movetocloudapp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnvStorage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStorage;
    private String classOfStorage ;
    private int rnge;
    private int qty ;
    private int spareQty;
    private int sfpspare ;
    private int sfps ;
    private int grossVolume ;
    private int netVolume ;
    private int perfGrossVolume ;
    private int capaNetVolume ;
    private int perfNetVolume ;
    private int capaGrossVolume ;
    private int annee;

    @Enumerated(EnumType.STRING)
    private Availablity availablity ;

    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;

}
