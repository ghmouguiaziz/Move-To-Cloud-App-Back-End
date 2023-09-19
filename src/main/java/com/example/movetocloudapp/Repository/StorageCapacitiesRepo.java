package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.StorageCapacities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageCapacitiesRepo extends JpaRepository<StorageCapacities,Integer> {
    StorageCapacities findByName(String name);
}
