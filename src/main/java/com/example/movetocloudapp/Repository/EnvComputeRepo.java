package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.EnvCompute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvComputeRepo extends JpaRepository<EnvCompute,Integer> {
}
