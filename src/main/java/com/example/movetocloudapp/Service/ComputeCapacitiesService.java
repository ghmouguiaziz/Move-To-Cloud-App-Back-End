package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ComputeCapacities;
import com.example.movetocloudapp.Repository.ComputeCapacitiesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputeCapacitiesService implements IComputeCapacitiesService {
    @Autowired
    ComputeCapacitiesRepo computecapacitiesrepo;
    @Override
    public String addComputeCapacities(ComputeCapacities z) {
        computecapacitiesrepo.save(z);
        return "Added";
    }
    @Override
    public String updateComputeCapacities(ComputeCapacities z ,int id) {

        ComputeCapacities z1 = computecapacitiesrepo.findById(id).get();
        z1.setClassOfCompute(z.getClassOfCompute());
        z1.setCpu(z.getCpu());
        z1.setMaxvram(z.getMaxvram());
        z1.setMaxvcpu(z.getMaxvcpu());
        z1.setName(z.getName());
        z1.setSfps(z.getSfps());
        z1.setDescr(z.getDescr());
        computecapacitiesrepo.saveAndFlush(z1);
        return "updated";
    }
    @Override
    public String deleteComputeCapacities(int id) {

        computecapacitiesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<ComputeCapacities> getAllComputeCapacities() {

        return computecapacitiesrepo.findAll();
    }
    @Override
    public ComputeCapacities getComputeCapacitiesById(int id) {

        return computecapacitiesrepo.findById(id).orElse(null);
    }
    @Override
    public ComputeCapacities findByClassOfCompute(String name){

        return computecapacitiesrepo.findByName(name);
    }

}
