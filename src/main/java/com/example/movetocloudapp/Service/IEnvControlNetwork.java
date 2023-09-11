package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvControlNetwork;

import java.util.List;

public interface IEnvControlNetwork {
    public String addEnvControlNetwork(EnvControlNetwork af, int id);
    public String updateEnvControlNetwork(EnvControlNetwork a ,int id);
    public String updateDataCenterEnvControlNetwork(int iddc ,int ida);
    public String deleteEnvControlNetwork(int id);
    public List<EnvControlNetwork> getAllEnvControlNetwork();
    public EnvControlNetwork getEnvControlNetworkById(int id);
    public List<EnvControlNetwork> findByAvailablityControlNetwork(Availablity t, String name);
}
