package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.LicensesPrice;
import com.example.movetocloudapp.Repository.LicensesPriceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LicensesPriceService implements ILicensesPriceService{
    @Autowired
    LicensesPriceRepo LicensesPricerepo;
    @Override
    public String addLicensesPrice(LicensesPrice z) {
        LicensesPricerepo.save(z);
        return "Added";
    }
    @Override
    public String updateLicensesPrice(LicensesPrice z ,int id) {

        LicensesPrice z1 = LicensesPricerepo.findById(id).get();
        z1.setOinnovPrice(z.getOinnovPrice());
        z1.setRedhatPrice(z.getRedhatPrice());
        z1.setSku(z.getSku());
        z1.setAnnee(z.getAnnee());
        z1.setSub(z.getSub());
        z1.setNodeType(z.getNodeType());

        LicensesPricerepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteLicensesPrice(int id) {

        LicensesPricerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<LicensesPrice> getAllLicensesPrice() {

        return LicensesPricerepo.findAll();
    }
    @Override
    public LicensesPrice getLicensesPriceById(int id) {

        return LicensesPricerepo.findById(id).orElse(null);
    }
}
