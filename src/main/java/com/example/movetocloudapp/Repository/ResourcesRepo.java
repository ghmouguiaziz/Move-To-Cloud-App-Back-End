package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.Resources;
import com.example.movetocloudapp.Entities.TypeResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourcesRepo extends JpaRepository<Resources,Integer> {



    List<Resources> findByTypeAndDatacenter_IdDataCenterAndAndAvailablity(TypeResource type, int id, Availablity a);
}
