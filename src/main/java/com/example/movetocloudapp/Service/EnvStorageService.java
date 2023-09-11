package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Entities.EnvStorage;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.EnvStorageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvStorageService implements IEnvStorageService{
    @Autowired
    EnvStorageRepo envstoragerepo;
    @Autowired
    DataCenterRepo datacenterrepo;

    @Override
    public String addEnvStorage(EnvStorage e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        envstoragerepo.save(e);
        return "added";
    }
    @Override
    public String updateEnvStorage(EnvStorage dc ,int id) {

        EnvStorage dc1 = envstoragerepo.findById(id).get();
        dc1.setClassOfStorage(dc.getClassOfStorage());
        dc1.setQty(dc.getQty());
        dc1.setRnge(dc.getRnge());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setAnnee(dc.getAnnee());
        dc1.setGrossVolume(dc.getGrossVolume());
        dc1.setNetVolume(dc.getNetVolume());
        dc1.setSfps(dc.getSfps());
        dc1.setSfpspare(dc.getSfpspare());
        dc1.setPerfGrossVolume(dc.getPerfGrossVolume());
        dc1.setPerfNetVolume(dc.getPerfNetVolume());
        dc1.setCapaGrossVolume(dc.getCapaGrossVolume());
        dc1.setCapaNetVolume(dc.getCapaNetVolume());
        envstoragerepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterEnvStorage(int ide ,int iddc){
        EnvStorage e = envstoragerepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        envstoragerepo.save(e);
        return "updated";
    }
    @Override
    public String deleteEnvStorage(int id) {

        envstoragerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<EnvStorage> getAllEnvStorage() {

        return envstoragerepo.findAll();
    }
    @Override
    public EnvStorage getEnvStorageById(int id) {

        return envstoragerepo.findById(id).orElse(null);
    }
    public List<EnvStorage> findByAvailablityStorage(Availablity t, String name){
        return envstoragerepo.findByAvailablityAndDatacenter_Name(t , name);
    }

}
