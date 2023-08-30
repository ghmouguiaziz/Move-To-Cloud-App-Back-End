package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.EnvControlNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvControlNetworkRepo extends JpaRepository<EnvControlNetwork,Integer> {
}
