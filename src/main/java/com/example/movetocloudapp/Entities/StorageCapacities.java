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
public class StorageCapacities implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idStorageCapacities;
    private String classOfStorage ;
    private int rnge ;
    private int diskNumber;
    private int diskVolume;
    private int volumeBrut;
    private int volumeNet;
    private int sfps;

}
