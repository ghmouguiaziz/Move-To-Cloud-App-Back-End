package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.DevicesPur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevicesPurRepo extends JpaRepository<DevicesPur,Integer> {
    List<DevicesPur> findByDatacenter_IdDataCenter(int id);
}
