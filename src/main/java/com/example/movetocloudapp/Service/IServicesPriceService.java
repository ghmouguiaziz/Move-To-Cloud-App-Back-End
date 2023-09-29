package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Services;
import com.example.movetocloudapp.Entities.ServicesPrice;

import java.util.List;

public interface IServicesPriceService {
    public String addServicesPrice(ServicesPrice z ) ;
    public String updateServicesPrice(ServicesPrice z ,int id);
    public String deleteServicesPrice(int id);
    public List<ServicesPrice> getAllServicesPrice(Services s);
    public ServicesPrice getServicesPriceByName(String name);
    public List<ServicesPrice> getServicesPriceByProvider(String p);

}
