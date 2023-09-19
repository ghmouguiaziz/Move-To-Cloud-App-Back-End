package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ComputeCapacities;

import java.util.List;

public interface IComputeCapacitiesService {
    public String addComputeCapacities(ComputeCapacities z ) ;
    public String updateComputeCapacities(ComputeCapacities z ,int id);
    public String deleteComputeCapacities(int id);
    public List<ComputeCapacities> getAllComputeCapacities();
    public ComputeCapacities getComputeCapacitiesById(int id);
    public ComputeCapacities findByClassOfCompute(String name);
}
