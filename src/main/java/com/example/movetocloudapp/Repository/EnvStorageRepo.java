package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Entities.EnvStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvStorageRepo extends JpaRepository<EnvStorage,Integer> {
    List<EnvStorage> findByAvailablityAndDatacenter_Name(Availablity a, String name);
}
