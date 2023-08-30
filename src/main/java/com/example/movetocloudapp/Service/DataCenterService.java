package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.Affiliate;
import com.example.movetocloudapp.Entities.Zone;
import com.example.movetocloudapp.Repository.DataCenterRepo;
import com.example.movetocloudapp.Repository.AffiliateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataCenterService implements IDataCenterService{
    @Autowired
    DataCenterRepo datacenterrepo;
    @Autowired
    AffiliateRepo affiliaterepo;

    @Override
    public String addDataCenter(DataCenter dc, int id) {
        Affiliate af= affiliaterepo.findById(id).get();
        dc.setAffiliate(af);
        datacenterrepo.save(dc);
        return "added";
    }
    @Override
    public String updateDataCenter(DataCenter dc ,int id) {

        DataCenter dc1 = datacenterrepo.findById(id).get();
        dc1.setName(dc.getName());
        datacenterrepo.saveAndFlush(dc1);
        return "updated";
    }
    @Override
    public String updateAffiliateDataCenter(int iddc ,int ida){
        DataCenter dc = datacenterrepo.findById(iddc).get();
        Affiliate a= affiliaterepo.findById(ida).get();
        dc.setAffiliate(a);
        datacenterrepo.save(dc);
        return "updated";
    }
    @Override
    public String deleteDataCenter(int id) {

        datacenterrepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<DataCenter> getAllDataCenter() {

        return datacenterrepo.findAll();
    }
    @Override
    public DataCenter getDataCenterById(int id) {

        return datacenterrepo.findById(id).orElse(null);
    }
    @Override
    public List<DataCenter> getAllDataCenterByAffiliate(String dataCenterName){
        Affiliate z = affiliaterepo.findByName(dataCenterName);
        return z.getDataCenters();}

}
