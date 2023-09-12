package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.LicensesPur;
import com.example.movetocloudapp.Entities.ServersPur;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.ServersPurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServersPurService implements IServersPurService{
    @Autowired
    ServersPurRepo ServersPurrepo;
    @Autowired
    DataCenterRepo datacenterrepo;
    @Override
    public String addServersPur(ServersPur e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        ServersPurrepo.save(e);
        return "added";
    }
    @Override
    public String updateServersPur(ServersPur z ,int id) {

        ServersPur z1 = ServersPurrepo.findById(id).get();
        z1.setDate(z.getDate());
        z1.setCpu(z.getCpu());
        z1.setAnnee(z.getAnnee());
        z1.setQty(z.getQty());
        z1.setClassOfCompute(z.getClassOfCompute());

        ServersPurrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteServersPur(int id) {

        ServersPurrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<ServersPur> getAllServersPur() {

        return ServersPurrepo.findAll();
    }
    @Override
    public ServersPur getServersPurById(int id) {

        return ServersPurrepo.findById(id).orElse(null);
    }
    public List<ServersPur> findByDataCenter(int id){
        return ServersPurrepo.findByDatacenter_IdDataCenter(id);
    }

}
