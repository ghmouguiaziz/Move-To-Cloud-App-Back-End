package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.DataCenter;

import java.util.List;

public interface IDataCenterService {

    public String addDataCenter(DataCenter af, int id);
    public String updateDataCenter(DataCenter a ,int id);
    public String updateAffiliateDataCenter(int iddc ,int ida);
    public String deleteDataCenter(int id);
    public List<DataCenter> getAllDataCenter();
    public DataCenter getDataCenterById(int id);
    public List<DataCenter> getAllDataCenterByAffiliate(String AffiliateName);

}
