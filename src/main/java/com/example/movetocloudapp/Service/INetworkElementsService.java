package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.NetworkElements;

import java.util.List;

public interface INetworkElementsService {
    public String addNetworkElements(NetworkElements af, int id);
    public String updateNetworkElements(NetworkElements a ,int id);
    public String updateDataCenterNetworkElements(int iddc ,int ida);
    public String deleteNetworkElements(int id);
    public List<NetworkElements> getAllNetworkElements();
    public NetworkElements getNetworkElementsById(int id);
}
