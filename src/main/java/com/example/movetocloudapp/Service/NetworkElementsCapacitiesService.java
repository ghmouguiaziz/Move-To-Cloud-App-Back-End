package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ComputeCapacities;
import com.example.movetocloudapp.Entities.NetworkElementsCapacities;
import com.example.movetocloudapp.Repository.NetworkElementsCapacitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NetworkElementsCapacitiesService implements INetworkElementsCapacitiesService {
    @Autowired
    NetworkElementsCapacitiesRepo NetworkElementscapacitiesrepo;
    @Override
    public String addNetworkElementsCapacities(NetworkElementsCapacities z) {
        NetworkElementscapacitiesrepo.save(z);
        return "Added";
    }
    @Override
    public String updateNetworkElementsCapacities(NetworkElementsCapacities z ,int id) {

        NetworkElementsCapacities z1 = NetworkElementscapacitiesrepo.findById(id).get();
        z1.setFree(z.getFree());
        z1.setUsed(z.getUsed());
        z1.setAnnee(z.getAnnee());
        z1.setPorts(z.getPorts());
        z1.setName(z.getName());

        NetworkElementscapacitiesrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteNetworkElementsCapacities(int id) {

        NetworkElementscapacitiesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<NetworkElementsCapacities> getAllNetworkElementsCapacities() {

        return NetworkElementscapacitiesrepo.findAll();
    }
    @Override
    public NetworkElementsCapacities getNetworkElementsCapacitiesById(int id) {

        return NetworkElementscapacitiesrepo.findById(id).orElse(null);
    }
    @Override
    public NetworkElementsCapacities findByDeviceName(String name){

        return NetworkElementscapacitiesrepo.findByName(name);
    }

}
