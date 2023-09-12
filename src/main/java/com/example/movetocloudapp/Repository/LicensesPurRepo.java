package com.example.movetocloudapp.Repository;


import com.example.movetocloudapp.Entities.DevicesPur;
import com.example.movetocloudapp.Entities.LicensesPur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LicensesPurRepo extends JpaRepository<LicensesPur,Integer> {
    List<LicensesPur> findByDatacenter_IdDataCenter(int id);
}
