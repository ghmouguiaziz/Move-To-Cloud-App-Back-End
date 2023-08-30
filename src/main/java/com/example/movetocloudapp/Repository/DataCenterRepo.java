package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.DataCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataCenterRepo extends JpaRepository<DataCenter,Integer> {
   DataCenter findByName(String DataCenterName);
}
