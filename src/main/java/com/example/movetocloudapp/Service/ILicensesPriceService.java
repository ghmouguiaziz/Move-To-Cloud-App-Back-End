package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.LicensesPrice;

import java.util.List;

public interface ILicensesPriceService {
    public String addLicensesPrice(LicensesPrice z ) ;
    public String updateLicensesPrice(LicensesPrice z ,int id);
    public String deleteLicensesPrice(int id);
    public List<LicensesPrice> getAllLicensesPrice();
    public LicensesPrice getLicensesPriceById(int id);
}
