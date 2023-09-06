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
public class Resources implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idResources;
    private String name ;
    private int annee;
    private int bcVcpu;
    private int bcRam;
    private int bcNgVcpu;
    private int bcNgRam;
    private int icVcpu;
    private int icRam;
    private int perfStrorage;
    private int capaStorage;
    private String hypothesys;

    @Enumerated(EnumType.STRING)
    private TypeResource type;
    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;

}
