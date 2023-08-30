package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.EnvCompute;

import java.util.List;

public interface IEnvComputeService {
    public String addEnvCompute(EnvCompute af, int id);
    public String updateEnvCompute(EnvCompute a ,int id);
    public String updateDataCenterEnvCompute(int iddc ,int ida);
    public String deleteEnvCompute(int id);
    public List<EnvCompute> getAllEnvCompute();
    public EnvCompute getEnvComputeById(int id);
}
