package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.DevicesPur;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.DevicesPurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DevicesPurService implements IDevicesPurService{
    @Autowired
    DevicesPurRepo DevicesPurrepo;
    @Autowired
    DataCenterRepo datacenterrepo;
    @Override
    public String addDevicesPur(DevicesPur e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        DevicesPurrepo.save(e);
        return "added";
    }
    @Override
    public String updateDevicesPur(DevicesPur z ,int id) {

        DevicesPur z1 = DevicesPurrepo.findById(id).get();
        z1.setDate(z.getDate());
        z1.setQty(z.getQty());
        z1.setAnnee(z.getAnnee());
        DevicesPurrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteDevicesPur(int id) {

        DevicesPurrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<DevicesPur> getAllDevicesPur() {

        return DevicesPurrepo.findAll();
    }
    @Override
    public DevicesPur getDevicesPurById(int id) {

        return DevicesPurrepo.findById(id).orElse(null);
    }
    public List<DevicesPur> findByDataCenter(int id){
        return DevicesPurrepo.findByDatacenter_IdDataCenter(id);
    }

}