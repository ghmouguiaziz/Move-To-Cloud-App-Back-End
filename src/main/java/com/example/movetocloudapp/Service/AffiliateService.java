package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Affiliate;
import com.example.movetocloudapp.Entities.Zone;
import com.example.movetocloudapp.Repository.AffiliateRepo;
import com.example.movetocloudapp.Repository.ZoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AffiliateService implements IAffiliateService {

    @Autowired
    AffiliateRepo affiliaterepo;
    @Autowired
    ZoneRepo zonerepo;

    @Override
    public String addAffiliate(Affiliate af, int id) {
        Zone z= zonerepo.findById(id).get();
        af.setZone(z);
        affiliaterepo.save(af);
        return "added";
    }
    @Override
    public String updateAffiliate(Affiliate a ,int id) {

        Affiliate a1 = affiliaterepo.findById(id).get();
        a1.setName(a.getName());
        a1.setFullName(a.getFullName());
        affiliaterepo.saveAndFlush(a1);
        return "updated";
    }
    @Override
    public String updateZoneAffiliate(int ida ,int idz){
        Affiliate a = affiliaterepo.findById(ida).get();
        Zone z= zonerepo.findById(idz).get();
        a.setZone(z);
        affiliaterepo.save(a);
        return "updated";
    }
    @Override
    public String deleteAffiliate(int id) {

        affiliaterepo.deleteById(id);
        return "deleted";
    }
    @Override
    public List<Affiliate> getAllAffiliate() {

        return affiliaterepo.findAll();
    }
    @Override
    public Affiliate getAffiliateById(int id) {

        return affiliaterepo.findById(id).orElse(null);
    }

    @Override
    public List<Affiliate> getAllAffiliateByZone(String zoneName){
        Zone z = zonerepo.findByName(zoneName);
        return z.getAffiliates();
    }
}
