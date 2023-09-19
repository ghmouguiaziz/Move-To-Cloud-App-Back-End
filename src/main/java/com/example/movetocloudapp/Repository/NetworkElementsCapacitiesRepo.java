package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.ComputeCapacities;
import com.example.movetocloudapp.Entities.NetworkElements;
import com.example.movetocloudapp.Entities.NetworkElementsCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkElementsCapacitiesRepo extends JpaRepository<NetworkElementsCapacities,Integer> {
    NetworkElementsCapacities findByName(String name);
}
