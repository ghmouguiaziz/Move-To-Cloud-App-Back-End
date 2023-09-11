package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.Availablity;
import com.example.movetocloudapp.Entities.EnvCompute;
import com.example.movetocloudapp.Entities.EnvStorage;

import java.util.List;

public interface IEnvStorageService {
    public String addEnvStorage(EnvStorage af, int id);
    public String updateEnvStorage(EnvStorage a ,int id);
    public String updateDataCenterEnvStorage(int iddc ,int ida);
    public String deleteEnvStorage(int id);
    public List<EnvStorage> getAllEnvStorage();
    public EnvStorage getEnvStorageById(int id);
    public List<EnvStorage> findByAvailablityStorage(Availablity t, String name);
}
