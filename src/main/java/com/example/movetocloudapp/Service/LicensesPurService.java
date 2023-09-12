package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.DevicesPur;
import com.example.movetocloudapp.Entities.LicensesPur;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.LicensesPurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class LicensesPurService implements ILicensesPurService {
    @Autowired
    LicensesPurRepo LicensesPurrepo;
    @Autowired
    DataCenterRepo datacenterrepo;
    @Override
    public String addLicensesPur(LicensesPur e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        LicensesPurrepo.save(e);
        return "added";
    }
    @Override
    public String updateLicensesPur(LicensesPur z ,int id) {

        LicensesPur z1 = LicensesPurrepo.findById(id).get();
        z1.setProvider(z.getProvider());
        z1.setActDate(z.getActDate());
        z1.setExpDate(z.getExpDate());
        z1.setSku(z.getSku());
        z1.setNodeType(z.getNodeType());
        z1.setQty(z.getQty());
        z1.setAnnee(z.getAnnee());
        LicensesPurrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteLicensesPur(int id) {

        LicensesPurrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<LicensesPur> getAllLicensesPur() {

        return LicensesPurrepo.findAll();
    }
    @Override
    public LicensesPur getLicensesPurById(int id) {

        return LicensesPurrepo.findById(id).orElse(null);
    }
    public List<LicensesPur> findByDataCenter(int id){
        return LicensesPurrepo.findByDatacenter_IdDataCenter(id);
    }
}
