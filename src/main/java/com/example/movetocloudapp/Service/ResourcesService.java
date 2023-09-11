package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Affiliate;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.Resources;
import com.example.movetocloudapp.Entities.TypeResource;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.ResourcesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.movetocloudapp.Entities.TypeResource.*;

@Service
public class ResourcesService implements IResourcesService {
    @Autowired
    ResourcesRepo resourcesrepo;
    @Autowired
    DataCenterRepo datacenterrepo;

    @Override
    public String addResources(Resources e, int id) {
        DataCenter dc= datacenterrepo.findById(id).get();
        e.setDatacenter(dc);
        resourcesrepo.save(e);
        return "added";
    }
    @Override
    public String updateResources(Resources dc ,int id) {

        Resources dc1 = resourcesrepo.findById(id).get();
        dc1.setType(dc.getType());
        dc1.setName(dc.getName());
        dc1.setBcRam(dc.getBcRam());
        dc1.setBcVcpu(dc.getBcVcpu());
        dc1.setHypothesys(dc.getHypothesys());
        dc1.setBcNgRam(dc.getBcNgRam());
        dc1.setBcNgVcpu(dc.getBcNgVcpu());
        dc1.setIcVcpu(dc.getIcVcpu());
        dc1.setIcRam(dc.getIcRam());
        dc1.setCapaStorage(dc.getCapaStorage());
        dc1.setAnnee(dc.getAnnee());
        dc1.setPerfStrorage(dc.getPerfStrorage());
        dc1.setHypothesys(dc.getHypothesys());

        resourcesrepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateDataCenterResources(int ide ,int iddc){
        Resources e = resourcesrepo.findById(ide).get();
        DataCenter dc= datacenterrepo.findById(iddc).get();
        e.setDatacenter(dc);
        resourcesrepo.save(e);
        return "updated";
    }
    @Override
    public String deleteResources(int id) {

        resourcesrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<Resources> getAllResources() {

        return resourcesrepo.findAll();
    }
    @Override
    public Resources getResourcesById(int id) {

        return resourcesrepo.findById(id).orElse(null);
    }
    @Override
    public List<Resources> getAllResourcesByDataCenter(String DataCenterName){
        DataCenter z = datacenterrepo.findByName(DataCenterName);
        return z.getResources();}
    @Override
    public List <Resources> findByType(TypeResource t, String name){
        return resourcesrepo.findByTypeAndDatacenter_Name(t , name);
    }
}
