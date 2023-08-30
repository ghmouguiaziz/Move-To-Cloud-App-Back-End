package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourcesRepo extends JpaRepository<Resources,Integer> {

}
