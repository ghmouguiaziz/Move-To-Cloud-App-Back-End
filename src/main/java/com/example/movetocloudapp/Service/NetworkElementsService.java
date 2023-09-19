package com.example.movetocloudapp.Service;


import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Entities.NetworkElements;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.NetworkElementsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetworkElementsService implements INetworkElementsService{
    @Autowired
    NetworkElementsRepo networkelementsrepo;
    @Autowired
    DataCenterRepo datacenterrepo;

    @Override
    public String addNetworkElements(NetworkElements e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        networkelementsrepo.save(e);
        return "added";
    }
    @Override
    public String updateNetworkElements(NetworkElements dc ,int id) {

        NetworkElements dc1 = networkelementsrepo.findById(id).get();
        dc1.setQty(dc.getQty());
        dc1.setName(dc.getName());
        dc1.setSpareQty(dc.getSpareQty());
        dc1.setAnnee(dc.getAnnee());
        dc1.setAvailablity(dc.getAvailablity());
        dc1.setPorts(dc.getPorts());
        dc1.setUsed(dc.getUsed());
        dc1.setFree(dc.getFree());

        networkelementsrepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterNetworkElements(int ide ,int iddc){
        NetworkElements e = networkelementsrepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        networkelementsrepo.save(e);
        return "updated";
    }
    @Override
    public String deleteNetworkElements(int id) {

        networkelementsrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<NetworkElements> getAllNetworkElements() {

        return networkelementsrepo.findAll();
    }
    @Override
    public NetworkElements getNetworkElementsById(int id) {

        return networkelementsrepo.findById(id).orElse(null);
    }
    public List<NetworkElements> findByAvailablity(Availablity t, int id){
        return networkelementsrepo.findByAvailablityAndDatacenter_IdDataCenter(t , id);
    }
}
