package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.NetworkElements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface NetworkElementsRepo extends JpaRepository<NetworkElements,Integer> {
}
