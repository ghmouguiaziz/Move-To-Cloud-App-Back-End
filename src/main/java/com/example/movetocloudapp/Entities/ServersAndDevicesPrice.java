package com.example.movetocloudapp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ServersAndDevicesPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int euroPrice;
    private int usdPrice;
    private int annee;
    private String name ;
    private String descr;
    @Enumerated(EnumType.STRING)
    private ServerType type;




}
