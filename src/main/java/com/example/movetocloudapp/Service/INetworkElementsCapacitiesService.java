package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.NetworkElementsCapacities;

import java.util.List;

public interface INetworkElementsCapacitiesService {
    public String addNetworkElementsCapacities(NetworkElementsCapacities z ) ;
    public String updateNetworkElementsCapacities(NetworkElementsCapacities z ,int id);
    public String deleteNetworkElementsCapacities(int id);
    public List<NetworkElementsCapacities> getAllNetworkElementsCapacities();
    public NetworkElementsCapacities getNetworkElementsCapacitiesById(int id);
    public NetworkElementsCapacities findByDeviceName(String name);
}
