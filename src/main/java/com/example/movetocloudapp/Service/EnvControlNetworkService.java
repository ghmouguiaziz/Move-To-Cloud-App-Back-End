package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.*;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Entities.EnvControlNetwork;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.EnvControlNetworkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnvControlNetworkService implements IEnvControlNetwork{
    @Autowired
    EnvControlNetworkRepo envcontrolnetworkrepo;
    @Autowired
    DataCenterRepo datacenterrepo;

    @Override
    public String addEnvControlNetwork(EnvControlNetwork e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        envcontrolnetworkrepo.save(e);
        return "added";
    }
    @Override
    public String updateEnvControlNetwork(EnvControlNetwork dc ,int id) {

        EnvControlNetwork dc1 = envcontrolnetworkrepo.findById(id).get();
        dc1.setClassOfControlNetwork(dc.getClassOfControlNetwork());
        dc1.setQty(dc.getQty());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setAnnee(dc.getAnnee());
        dc1.setSfps(dc.getSfps());
        dc1.setSfpspare(dc.getSfpspare());
        dc1.setAvailablity(dc.getAvailablity());
        envcontrolnetworkrepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterEnvControlNetwork(int ide ,int iddc){
        EnvControlNetwork e = envcontrolnetworkrepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        envcontrolnetworkrepo.save(e);
        return "updated";
    }
    @Override
    public String deleteEnvControlNetwork(int id) {

        envcontrolnetworkrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<EnvControlNetwork> getAllEnvControlNetwork() {

        return envcontrolnetworkrepo.findAll();
    }
    @Override
    public EnvControlNetwork getEnvControlNetworkById(int id) {

        return envcontrolnetworkrepo.findById(id).orElse(null);
    }

    public List<EnvControlNetwork> findByAvailablityControlNetwork(Availablity t, int id){
        return envcontrolnetworkrepo.findByAvailablityAndDatacenter_IdDataCenter(t , id);
    }


}
