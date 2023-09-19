package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvControlNetwork;
import com.example.movetocloudapp.Entities.EnvStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnvControlNetworkRepo extends JpaRepository<EnvControlNetwork,Integer> {
    List<EnvControlNetwork> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);

}
