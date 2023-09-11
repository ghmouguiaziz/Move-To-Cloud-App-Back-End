package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.ControlNetworkCapacities;
import com.example.movetocloudapp.Entities.EnvControlNetwork;
import com.example.movetocloudapp.Entities.EnvStorage;

import java.util.List;

public interface IControlNetworkCapacitiesService {
    public String addControlNetworkCapacities(ControlNetworkCapacities z ) ;
    public String updateControlNetworkCapacities(ControlNetworkCapacities z ,int id);
    public String deleteControlNetworkCapacities(int id);
    public List<ControlNetworkCapacities> getAllControlNetworkCapacities();
    public ControlNetworkCapacities getControlNetworkCapacitiesById(int id);

}
