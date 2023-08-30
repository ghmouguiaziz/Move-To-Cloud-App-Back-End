package com.example.movetocloudapp.Repository;

import com.example.movetocloudapp.Entities.Affiliate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AffiliateRepo extends JpaRepository<Affiliate,Integer> {
    Affiliate findByName(String name);
}
