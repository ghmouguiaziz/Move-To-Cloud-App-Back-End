package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.DevicesPur;
import com.example.movetocloudapp.Entities.ServersPur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServersPurRepo extends JpaRepository<ServersPur,Integer> {
    List<ServersPur> findByDatacenter_IdDataCenter(int id);
}
