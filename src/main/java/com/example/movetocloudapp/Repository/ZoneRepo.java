package com.example.movetocloudapp.Repository;


import com.example.movetocloudapp.Entities.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ZoneRepo extends JpaRepository <Zone,Integer> {
    Zone findByName(String name);
}
