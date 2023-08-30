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

public class Affiliate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idAffiliate ;
    private String name ;

    @JsonIgnore
    @ManyToOne
    private Zone zone;

    @OneToMany(mappedBy = "affiliate", cascade = CascadeType.ALL)
    private List<DataCenter> dataCenters;
}
