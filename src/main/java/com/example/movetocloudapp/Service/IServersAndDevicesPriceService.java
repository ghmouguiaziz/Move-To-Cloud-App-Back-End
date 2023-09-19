package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ServerType;
import com.example.movetocloudapp.Entities.ServersAndDevicesPrice;

import java.util.List;

public interface IServersAndDevicesPriceService {
    public String addServersAndDevicesPrice(ServersAndDevicesPrice z ) ;
    public String updateServersAndDevicesPrice(ServersAndDevicesPrice z ,int id);
    public String deleteServersAndDevicesPrice(int id);
    public List<ServersAndDevicesPrice> getAllServersAndDevicesPrice();
    public ServersAndDevicesPrice getServersAndDevicesPriceById(int id);
    List<ServersAndDevicesPrice> findByTypeServer(ServerType s);
}
