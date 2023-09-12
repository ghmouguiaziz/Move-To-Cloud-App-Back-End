package com.example.movetocloudapp.Service;

import com.example.movetocloudapp.Entities.LicensesPur;

import java.util.List;

public interface ILicensesPurService {
    public String addLicensesPur(LicensesPur af, int id);
    public String updateLicensesPur(LicensesPur a ,int id);
    public String deleteLicensesPur(int id);
    public List<LicensesPur> getAllLicensesPur();
    public LicensesPur getLicensesPurById(int id);
    public List<LicensesPur> findByDataCenter(int id);
}
