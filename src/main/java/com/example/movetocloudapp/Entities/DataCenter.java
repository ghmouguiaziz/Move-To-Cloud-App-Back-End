package com.example.movetocloudapp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class DataCenter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idDataCenter ;
    private String name ;

    @JsonIgnore
    @ManyToOne
    private Affiliate affiliate;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvCompute> envcomputes;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvStorage> envstorages;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<EnvControlNetwork> envcontrolnetworks;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<Resources> resources;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<NetworkElements> networkelements;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<DevicesPur> devicespurs;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<LicensesPur> licensespurs;

    @OneToMany(mappedBy = "datacenter", cascade = CascadeType.ALL)
    private List<ServersPur> serverspurs;
}
