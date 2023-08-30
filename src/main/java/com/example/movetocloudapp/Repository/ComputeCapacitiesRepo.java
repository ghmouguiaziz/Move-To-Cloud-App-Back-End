package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.ComputeCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComputeCapacitiesRepo extends JpaRepository<ComputeCapacities,Integer> {

}
