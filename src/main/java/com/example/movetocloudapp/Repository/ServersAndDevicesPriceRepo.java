package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.ServerType;
import com.example.movetocloudapp.Entities.ServersAndDevicesPrice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServersAndDevicesPriceRepo extends JpaRepository<ServersAndDevicesPrice,Integer> {

    List<ServersAndDevicesPrice> findByType(ServerType s);
}
