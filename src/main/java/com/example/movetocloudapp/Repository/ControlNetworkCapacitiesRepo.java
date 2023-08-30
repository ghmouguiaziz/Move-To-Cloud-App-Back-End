package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.ControlNetworkCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlNetworkCapacitiesRepo extends JpaRepository<ControlNetworkCapacities,Integer> {
}
