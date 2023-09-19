package com.example.movetocloudapp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EnvCompute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCompute;
    private String classOfCompute ;
    private String name ;
    private int qty ;
    private int spareQty;
    private int vcpu;
    private int cpu;
    private int annee;
    private int vram;
    private int bcvcpu;
    private int bcvram;
    private int bcngvcpu;
    private int bcngvram;
    private int icvcpu;
    private int icvram;
    private int invcpu;
    private int invram;
    private int sfps;
    private int sfpspare;
    @Temporal(TemporalType.DATE)
    private Date actDate;

    @Enumerated(EnumType.STRING)
    private Champ champ ;

    @Enumerated(EnumType.STRING)
    private Availablity availablity ;
    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;
}
