package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ServersAndDevicesPrice;
import com.example.movetocloudapp.Repository.ServersAndDevicesPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServersAndDevicesPriceService implements IServersAndDevicesPriceService{
    @Autowired
    ServersAndDevicesPriceRepo ServersAndDevicesPricerepo;
    @Override
    public String addServersAndDevicesPrice(ServersAndDevicesPrice z) {
        ServersAndDevicesPricerepo.save(z);
        return "Added";
    }
    @Override
    public String updateServersAndDevicesPrice(ServersAndDevicesPrice z ,int id) {

        ServersAndDevicesPrice z1 = ServersAndDevicesPricerepo.findById(id).get();
        z1.setEuroPrice(z.getEuroPrice());
        z1.setUsdPrice(z.getUsdPrice());
        z1.setName(z.getName());
        z1.setAnnee(z.getAnnee());
        z1.setDescr(z.getDescr());


        ServersAndDevicesPricerepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteServersAndDevicesPrice(int id) {

        ServersAndDevicesPricerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<ServersAndDevicesPrice> getAllServersAndDevicesPrice() {

        return ServersAndDevicesPricerepo.findAll();
    }
    @Override
    public ServersAndDevicesPrice getServersAndDevicesPriceById(int id) {

        return ServersAndDevicesPricerepo.findById(id).orElse(null);
    }
}
