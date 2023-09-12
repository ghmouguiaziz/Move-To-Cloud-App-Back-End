package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.ServersPur;

import java.util.List;

public interface IServersPurService {
    public String addServersPur(ServersPur af, int id);
    public String updateServersPur(ServersPur a ,int id);
    public String deleteServersPur(int id);
    public List<ServersPur> getAllServersPur();
    public ServersPur getServersPurById(int id);
    public List<ServersPur> findByDataCenter(int id);
}
