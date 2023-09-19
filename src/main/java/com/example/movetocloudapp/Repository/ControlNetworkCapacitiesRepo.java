package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.ControlNetworkCapacities;
import com.example.movetocloudapp.Entities.EnvControlNetwork;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlNetworkCapacitiesRepo extends JpaRepository<ControlNetworkCapacities,Integer> {
    ControlNetworkCapacities findByClassOfcontrolNetwork (String name);
}
