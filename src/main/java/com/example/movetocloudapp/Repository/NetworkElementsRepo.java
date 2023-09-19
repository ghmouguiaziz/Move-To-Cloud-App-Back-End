package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvStorage;
import com.example.movetocloudapp.Entities.NetworkElements;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface NetworkElementsRepo extends JpaRepository<NetworkElements,Integer> {
    List<NetworkElements> findByAvailablityAndDatacenter_IdDataCenter(Availablity a, int id);
}
