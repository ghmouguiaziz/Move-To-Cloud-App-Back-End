package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.*;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.EnvComputeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvComputeService implements IEnvComputeService {
    @Autowired
    EnvComputeRepo envcomputerepo;
    @Autowired
    DataCenterRepo datacenterrepo;

    @Override
    public String addEnvCompute(EnvCompute e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        envcomputerepo.save(e);
        return "added";
    }
    @Override
    public String updateEnvCompute(EnvCompute dc ,int id) {

        EnvCompute dc1 = envcomputerepo.findById(id).get();
        dc1.setClassOfCompute(dc.getClassOfCompute());
        dc1.setQty(dc.getQty());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setCpu(dc.getCpu());
        dc1.setAnnee(dc.getAnnee());
        dc1.setAvailablity(dc.getAvailablity());
        dc1.setBcngvram(dc.getBcngvram());
        dc1.setBcngvcpu(dc.getBcngvcpu());
        dc1.setBcvcpu(dc.getBcvcpu());
        dc1.setBcvram(dc.getBcvram());
        dc1.setIcvcpu(dc.getIcvcpu());
        dc1.setSfps(dc.getSfps());
        dc1.setVcpu(dc.getVcpu());
        dc1.setVram(dc.getVram());
        dc1.setSfpspare(dc.getSfpspare());
        dc1.setIcvram(dc.getIcvram());
        envcomputerepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterEnvCompute(int ide ,int iddc){
        EnvCompute e = envcomputerepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        envcomputerepo.save(e);
        return "updated";
    }
    @Override
    public String deleteEnvCompute(int id) {

        envcomputerepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<EnvCompute> getAllEnvCompute() {

        return envcomputerepo.findAll();
    }
    @Override
    public EnvCompute getEnvComputeById(int id) {

        return envcomputerepo.findById(id).orElse(null);
    }
    @Override
    public List<EnvCompute> getAllComputesByDataCenter(String DataCenterName){
        DataCenter z = datacenterrepo.findByName(DataCenterName);
        return z.getEnvcomputes();}
    public List<EnvCompute> findByAvailablity(Availablity t, int id){
        return envcomputerepo.findByAvailablityAndDatacenter_IdDataCenter(t , id);
    }
}

