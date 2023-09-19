package com.example.movetocloudapp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ComputeCapacities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComputeCapacities;
    private String classOfCompute ;
    private String name ;
    private String descr ;
    private int cpu ;
    private int maxvcpu;
    private int maxvram;
    private int sfps;

}
