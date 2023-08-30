package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.EnvStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvStorageRepo extends JpaRepository<EnvStorage,Integer> {
}
