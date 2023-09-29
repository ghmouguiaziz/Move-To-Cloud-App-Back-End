package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Services;
import com.example.movetocloudapp.Entities.ServicesPrice;
import com.example.movetocloudapp.Repository.ServicesPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesPriceService implements IServicesPriceService{
    @Autowired
    ServicesPriceRepo ServicesPricerepo;
    @Override
    public String addServicesPrice(ServicesPrice z) {
        ServicesPricerepo.save(z);
        return "Added";
    }
    @Override
    public String updateServicesPrice(ServicesPrice z ,int id) {

        ServicesPrice z1 = ServicesPricerepo.findById(id).get();
        z1.setName(z.getName());
        ServicesPricerepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteServicesPrice(int id) {

        ServicesPricerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<ServicesPrice> getAllServicesPrice(Services s) {

        return ServicesPricerepo.findByServiceType(s);
    }
    @Override
    public ServicesPrice getServicesPriceByName(String name) {

        return ServicesPricerepo.findByName(name);
    }
    @Override
    public List<ServicesPrice> getServicesPriceByProvider(String p) {

        return ServicesPricerepo.findByProvider(p);
    }
}
