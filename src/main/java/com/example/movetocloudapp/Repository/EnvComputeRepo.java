package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvCompute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvComputeRepo extends JpaRepository<EnvCompute,Integer> {
    List<EnvCompute> findByAvailablityAndDatacenter_Name(Availablity a,String name);

}
