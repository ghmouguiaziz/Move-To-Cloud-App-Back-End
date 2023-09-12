package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.DevicesPur;

import java.util.List;

public interface IDevicesPurService {

    public String addDevicesPur(DevicesPur af,int id);
    public String updateDevicesPur(DevicesPur a ,int id);
    public String deleteDevicesPur(int id);
    public List<DevicesPur> getAllDevicesPur();
    public DevicesPur getDevicesPurById(int id);
    public List<DevicesPur> findByDataCenter(int id);
}
