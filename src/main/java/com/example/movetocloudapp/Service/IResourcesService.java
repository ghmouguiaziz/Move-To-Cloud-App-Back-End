package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.DataCenter;
import com.example.movetocloudapp.Entities.Resources;
import com.example.movetocloudapp.Entities.TypeResource;

import java.util.List;

public interface IResourcesService {
    public String addResources(Resources af, int id);
    public String updateResources(Resources a ,int id);
    public String updateDataCenterResources(int iddc ,int ida);
    public String deleteResources(int id);
    public List<Resources> getAllResources();
    public Resources getResourcesById(int id);
    public List<Resources> getAllResourcesByDataCenter(String AffiliateName);
    public List <Resources> findByType(TypeResource t, int id , Availablity a);
}
