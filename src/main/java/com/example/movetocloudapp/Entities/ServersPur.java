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
public class ServersPur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private Date date;
    private int qty;
    private int annee;
    private int cpu;
    private String classOfCompute;

    @JsonIgnore
    @ManyToOne
    private  DataCenter datacenter;

}
