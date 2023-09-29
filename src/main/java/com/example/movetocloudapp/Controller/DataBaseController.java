package com.example.movetocloudapp.Controller;

import com.example.movetocloudapp.Entities.*;
import com.example.movetocloudapp.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:4200")
public class DataBaseController {
    @Autowired
    IZoneService izoneservice;
    @Autowired
    IServicesPriceService iServicesPriceservice;

    @Autowired
    IDevicesPurService iDevicesPurservice;

    @Autowired
    INetworkElementsCapacitiesService iNetworkElementscapacitiesservice;
    @Autowired
    INetworkElementsService INetworkElementsService;
    @Autowired
    IServersPurService iServersPurservice;
    @Autowired
    ILicensesPriceService iLicensesPriceservice;
    @Autowired
    ILicensesPurService iLicensesPurservice;
    @Autowired
    IServersAndDevicesPriceService iServersAndDevicesPriceservice;
    @Autowired
    IAffiliateService iaffiliateservice;
    @Autowired
    IDataCenterService idatacenterservice;
    @Autowired
    IEnvComputeService ienvcomputeservice;
    @Autowired
    IEnvControlNetwork ienvControlnetworkservice;
    @Autowired
    INetworkElementsService inetworkelementsservice;
    @Autowired
    IEnvStorageService ienvstorageservice;
    @Autowired
    IResourcesService iresourcesservice;
    @Autowired
    IStorageCapacitiesService istoragecapacitiesservice;
    @Autowired
    IComputeCapacitiesService icomputecapacitiesservice;
    @Autowired
    IControlNetworkCapacitiesService icontrolnetworkcapacitiesservice;
    //////////////////////////////////ControlNetworkCapacities///////////////////////////////////////////////
    @PostMapping("/addControlNetworkCapacities")
    public String addControlNetworkCapacities(@RequestBody ControlNetworkCapacities z) {

        return  icontrolnetworkcapacitiesservice.addControlNetworkCapacities(z);
    }
    @PutMapping("/updateControlNetworkCapacities/{id}")
    public String updateControlNetworkCapacities(@RequestBody ControlNetworkCapacities z,@PathVariable int id){
        return icontrolnetworkcapacitiesservice.updateControlNetworkCapacities(z,id);
    }
    @DeleteMapping("/deleteControlNetworkCapacities/{id}")
    public String deleteControlNetworkCapacities(@PathVariable int id) {

        return  icontrolnetworkcapacitiesservice.deleteControlNetworkCapacities(id);
    }
    @GetMapping("/getAllControlNetworkCapacities")
    public List<ControlNetworkCapacities> getAllControlNetworkCapacities(){

        return icontrolnetworkcapacitiesservice.getAllControlNetworkCapacities();
    }
    @GetMapping("/getControlNetworkCapacitiesById/{id}")
    public ControlNetworkCapacities getControlNetworkCapacitiesById(@PathVariable int id){

        return icontrolnetworkcapacitiesservice.getControlNetworkCapacitiesById(id);
    }
    @GetMapping("/findByClassOfControlNetwork/{name}")
    public ControlNetworkCapacities findByClassOfControlNetwork(@PathVariable String name){

        return icontrolnetworkcapacitiesservice.findByClassOfControlNetwork(name);
    }
    //////////////////////////////////ComputeCapacities///////////////////////////////////////////////
    @PostMapping("/addComputeCapacities")
    public String addComputeCapacities(@RequestBody ComputeCapacities z) {

        return  icomputecapacitiesservice.addComputeCapacities(z);
    }
    @PutMapping("/updateComputeCapacities/{id}")
    public String updateComputeCapacities(@RequestBody ComputeCapacities z,@PathVariable int id){
        return icomputecapacitiesservice.updateComputeCapacities(z,id);
    }
    @DeleteMapping("/deleteComputeCapacities/{id}")
    public String deleteComputeCapacities(@PathVariable int id) {

        return  icomputecapacitiesservice.deleteComputeCapacities(id);
    }
    @GetMapping("/getAllComputeCapacities")
    public List<ComputeCapacities> getAllComputeCapacities(){

        return icomputecapacitiesservice.getAllComputeCapacities();
    }
    @GetMapping("/getComputeCapacitiesById/{id}")
    public ComputeCapacities getComputeCapacitiesById(@PathVariable int id){

        return icomputecapacitiesservice.getComputeCapacitiesById(id);
    }

    @GetMapping("/findByClassOfCompute/{name}")
    public ComputeCapacities findByClassOfCompute(@PathVariable String name){

        return icomputecapacitiesservice.findByClassOfCompute(name);
    }

    //////////////////////////////////NetworkElementsCapacities///////////////////////////////////////////////
    @PostMapping("/addNetworkElementsCapacities")
    public String addNetworkElementsCapacities(@RequestBody NetworkElementsCapacities z) {

        return  iNetworkElementscapacitiesservice.addNetworkElementsCapacities(z);
    }
    @PutMapping("/updateNetworkElementsCapacities/{id}")
    public String updateNetworkElementsCapacities(@RequestBody NetworkElementsCapacities z,@PathVariable int id){
        return iNetworkElementscapacitiesservice.updateNetworkElementsCapacities(z,id);
    }
    @DeleteMapping("/deleteNetworkElementsCapacities/{id}")
    public String deleteNetworkElementsCapacities(@PathVariable int id) {

        return  iNetworkElementscapacitiesservice.deleteNetworkElementsCapacities(id);
    }
    @GetMapping("/getAllNetworkElementsCapacities")
    public List<NetworkElementsCapacities> getAllNetworkElementsCapacities(){

        return iNetworkElementscapacitiesservice.getAllNetworkElementsCapacities();
    }
    @GetMapping("/getNetworkElementsCapacitiesById/{id}")
    public NetworkElementsCapacities getNetworkElementsCapacitiesById(@PathVariable int id){

        return iNetworkElementscapacitiesservice.getNetworkElementsCapacitiesById(id);
    }
    @GetMapping("/findByDeviceName/{name}")
    public NetworkElementsCapacities findByDeviceName(@PathVariable String name){

        return iNetworkElementscapacitiesservice.findByDeviceName(name);
    }



    //////////////////////////////////StorageCapacities///////////////////////////////////////////////
    @PostMapping("/addStorageCapacities")
    public String addStorageCapacities(@RequestBody StorageCapacities z) {

        return  istoragecapacitiesservice.addStorageCapacities(z);
    }
    @PutMapping("/updateStorageCapacities/{id}")
    public String updateStorageCapacities(@RequestBody StorageCapacities z,@PathVariable int id){
        return istoragecapacitiesservice.updateStorageCapacities(z,id);
    }
    @DeleteMapping("/deleteStorageCapacities/{id}")
    public String deleteStorageCapacities(@PathVariable int id) {

        return  istoragecapacitiesservice.deleteStorageCapacities(id);
    }
    @GetMapping("/getAllStorageCapacities")
    public List<StorageCapacities> getAllStorageCapacities(){

        return istoragecapacitiesservice.getAllStorageCapacities();
    }
    @GetMapping("/getStorageCapacitiesById/{id}")
    public StorageCapacities getStorageCapacitiesById(@PathVariable int id){

        return istoragecapacitiesservice.getStorageCapacitiesById(id);
    }

    @GetMapping("/findByClassOfStorage/{name}")
    public StorageCapacities findByClassOfStorage(@PathVariable String name){

        return istoragecapacitiesservice.findByClassOfStorage(name);
    }
    //////////////////////////////////Zone///////////////////////////////////////////////
    @PostMapping("/addZone")
    public String addZone(@RequestBody Zone z) {

        return  izoneservice.addZone(z);
    }
    @PutMapping("/updateZone/{id}")
    public String updateZone(@RequestBody Zone z,@PathVariable int id){
        return izoneservice.updateZone(z,id);
    }
    @DeleteMapping("/deleteZone/{id}")
    public String deleteZone(@PathVariable int id) {

        return  izoneservice.deleteZone(id);
    }
    @GetMapping("/getAllZone")
    public List<Zone> getAllZone(){

        return izoneservice.getAllZone();
    }
    @GetMapping("/getZoneById/{id}")
    public Zone getZoneById(@PathVariable int id){

        return izoneservice.getZoneById(id);
    }


    //////////////////////////////////Affiliate///////////////////////////////////////////////
    @PostMapping("/addAffiliate/{id}")

    public String addAffiliate(@RequestBody Affiliate a, @PathVariable int id){
        return iaffiliateservice.addAffiliate(a,id);
    }
    @PutMapping("/updateAffiliate/{id}")
    public String updateAffiliate(@RequestBody Affiliate a,@PathVariable int id){
        return iaffiliateservice.updateAffiliate(a,id);
    }
    @PutMapping("/updateZoneAffiliate/{ida}/{idz}")
    public String updateAffiliate(@PathVariable int ida,@PathVariable int idz){
        return iaffiliateservice.updateZoneAffiliate(ida,idz);
    }
    @DeleteMapping("/deleteAffiliate/{id}")
    public String deleteAffiliate(@PathVariable int id) {

        return  iaffiliateservice.deleteAffiliate(id);
    }
    @GetMapping("/getAllAffiliate")
    public List<Affiliate> getAllAffiliate(){

        return iaffiliateservice.getAllAffiliate();
    }
    @GetMapping("/getAffiliateById/{id}")
    public Affiliate getAffiliateById(@PathVariable int id){

        return iaffiliateservice.getAffiliateById(id);
    }

    @GetMapping("/getAllAffiliateByZone/{zoneName}")
    public List<Affiliate> getAllAffiliateByZone(@PathVariable String zoneName){
        return iaffiliateservice.getAllAffiliateByZone(zoneName);
    }
    //////////////////////////////////DataCenter///////////////////////////////////////////////
    @PostMapping("/addDataCenter/{id}")
    public String addDataCenter(@RequestBody DataCenter dc, @PathVariable int id){
        return idatacenterservice.addDataCenter(dc,id);
    }
    @PutMapping("/updateDataCenter/{id}")
    public String updateDataCenter(@RequestBody DataCenter dc,@PathVariable int id){
        return idatacenterservice.updateDataCenter(dc,id);
    }
    @PutMapping("/updateAffiliateDataCenter/{iddc}/{ida}")
    public String updateAffiliateDataCenter(@PathVariable int iddc,@PathVariable int ida){
        return idatacenterservice.updateAffiliateDataCenter(iddc,ida);
    }
    @DeleteMapping("/deleteDataCenter/{id}")
    public String deleteDataCenter(@PathVariable int id) {

        return  idatacenterservice.deleteDataCenter(id);
    }
    @GetMapping("/getDataCenterById/{id}")
    public DataCenter getDataCenterById(@PathVariable int id){

        return idatacenterservice.getDataCenterById(id);
    }
    @GetMapping("/getAllDataCenter")
    public List<DataCenter> getAllDataCenter(){

        return idatacenterservice.getAllDataCenter();
    }
    @GetMapping("/getAllDataCenterByAffiliate/{dataCenterName}")
    public List<DataCenter> getAllDataCenterByAffiliate(@PathVariable String dataCenterName) {
        return idatacenterservice.getAllDataCenterByAffiliate(dataCenterName);
    }

    //////////////////////////////////EnvCompute///////////////////////////////////////////////
    @PostMapping("/addEnvCompute/{id}")
    public String addEnvCompute(@RequestBody EnvCompute e, @PathVariable int id){
        return ienvcomputeservice.addEnvCompute(e,id);
    }
    @PutMapping("/updateEnvCompute/{id}")
    public String updateEnvCompute(@RequestBody EnvCompute e,@PathVariable int id){
        return ienvcomputeservice.updateEnvCompute(e,id);
    }
    @PutMapping("/updateDataCenterEnvCompute/{ide}/{iddc}")
    public String updateDataCenterEnvCompute(@PathVariable int ide,@PathVariable int iddc){
        return ienvcomputeservice.updateDataCenterEnvCompute(ide,iddc);
    }
    @DeleteMapping("/deleteEnvCompute/{id}")
    public String deleteEnvCompute(@PathVariable int id) {

        return  ienvcomputeservice.deleteEnvCompute(id);
    }
    @GetMapping("/getEnvComputeById/{id}")
    public EnvCompute getEnvComputeById(@PathVariable int id){

        return ienvcomputeservice.getEnvComputeById(id);
    }
    @GetMapping("/getAllEnvCompute")
    public List<EnvCompute> getAllEnvCompute(){

        return ienvcomputeservice.getAllEnvCompute();
    }
    @GetMapping("/getAllComputesByDataCenter/{dataCenterName}")
    public List<EnvCompute> getAllComputesByDataCenter(@PathVariable String dataCenterName) {
        return ienvcomputeservice.getAllComputesByDataCenter(dataCenterName);
    }
    //////////////////////////////////EnvControlNetwork///////////////////////////////////////////////

    @PostMapping("/addEnvControlNetwork/{id}")
    public String addEnvControlNetwork(@RequestBody EnvControlNetwork e, @PathVariable int id){
        return ienvControlnetworkservice.addEnvControlNetwork(e,id);
    }
    @PutMapping("/updateEnvControlNetwork/{id}")
    public String updateEnvControlNetwork(@RequestBody EnvControlNetwork e,@PathVariable int id){
        return ienvControlnetworkservice.updateEnvControlNetwork(e,id);
    }
    @PutMapping("/updateDataCenterEnvControlNetwork/{ide}/{iddc}")
    public String updateDataCenterEnvControlNetwork(@PathVariable int ide,@PathVariable int iddc){
        return ienvControlnetworkservice.updateDataCenterEnvControlNetwork(ide,iddc);
    }
    @DeleteMapping("/deleteEnvControlNetwork/{id}")
    public String deleteEnvControlNetwork(@PathVariable int id) {

        return  ienvControlnetworkservice.deleteEnvControlNetwork(id);
    }
    @GetMapping("/getEnvControlNetworkById/{id}")
    public EnvControlNetwork getEnvControlNetworkById(@PathVariable int id){

        return ienvControlnetworkservice.getEnvControlNetworkById(id);
    }
    @GetMapping("/getAllEnvControlNetwork")
    public List<EnvControlNetwork> getAllEnvControlNetwork(){

        return ienvControlnetworkservice.getAllEnvControlNetwork();
    }
    //////////////////////////////////EnvStorage///////////////////////////////////////////////

    @PostMapping("/addEnvStorage/{id}")
    public String addEnvStorage(@RequestBody EnvStorage e, @PathVariable int id){
        return ienvstorageservice.addEnvStorage(e,id);
    }
    @PutMapping("/updateEnvStorage/{id}")
    public String updateEnvStorage(@RequestBody EnvStorage e,@PathVariable int id){
        return ienvstorageservice.updateEnvStorage(e,id);
    }
    @PutMapping("/updateDataCenterEnvStorage/{ide}/{iddc}")
    public String updateDataCenterEnvStorage(@PathVariable int ide,@PathVariable int iddc){
        return ienvstorageservice.updateDataCenterEnvStorage(ide,iddc);
    }
    @DeleteMapping("/deleteEnvStorage/{id}")
    public String deleteEnvStorage(@PathVariable int id) {

        return  ienvstorageservice.deleteEnvStorage(id);
    }
    @GetMapping("/getEnvStorageById/{id}")
    public EnvStorage getEnvStorageById(@PathVariable int id){

        return ienvstorageservice.getEnvStorageById(id);
    }
    @GetMapping("/getAllEnvStorage")
    public List<EnvStorage> getAllEnvStorage(){

        return ienvstorageservice.getAllEnvStorage();
    }
    //////////////////////////////////NetworkElements///////////////////////////////////////////////

    @PostMapping("/addNetworkElements/{id}")
    public String addNetworkElements(@RequestBody NetworkElements e, @PathVariable int id){
        return inetworkelementsservice.addNetworkElements(e,id);
    }
    @PutMapping("/updateNetworkElements/{id}")
    public String updateNetworkElements(@RequestBody NetworkElements e,@PathVariable int id){
        return inetworkelementsservice.updateNetworkElements(e,id);
    }
    @PutMapping("/updateDataCenterNetworkElements/{ide}/{iddc}")
    public String updateDataCenterNetworkElements(@PathVariable int ide,@PathVariable int iddc){
        return inetworkelementsservice.updateDataCenterNetworkElements(ide,iddc);
    }
    @DeleteMapping("/deleteNetworkElements/{id}")
    public String deleteNetworkElements(@PathVariable int id) {

        return  inetworkelementsservice.deleteNetworkElements(id);
    }
    @GetMapping("/getNetworkElementsById/{id}")
    public NetworkElements getNetworkElementsById(@PathVariable int id){

        return inetworkelementsservice.getNetworkElementsById(id);
    }
    @GetMapping("/getAllNetworkElements")
    public List<NetworkElements> getAllNetworkElements(){

        return inetworkelementsservice.getAllNetworkElements();
    }
    //////////////////////////////////Resources///////////////////////////////////////////////

    @PostMapping("/addResources/{id}")
    public String addResources(@RequestBody Resources e, @PathVariable int id){
        return iresourcesservice.addResources(e,id);
    }
    @PutMapping("/updateResources/{id}")
    public String updateResources(@RequestBody Resources e,@PathVariable int id){
        return iresourcesservice.updateResources(e,id);
    }
    @PutMapping("/updateDataCenterResources/{ide}/{iddc}")
    public String updateDataCenterResources(@PathVariable int ide,@PathVariable int iddc){
        return iresourcesservice.updateDataCenterResources(ide,iddc);
    }
    @DeleteMapping("/deleteResources/{id}")
    public String deleteResources(@PathVariable int id) {

        return  iresourcesservice.deleteResources(id);
    }
    @GetMapping("/getResourcesById/{id}")
    public Resources getResourcesById(@PathVariable int id){

        return iresourcesservice.getResourcesById(id);
    }
    @GetMapping("/getAllResources")
    public List<Resources> getAllResources(){

        return iresourcesservice.getAllResources();
    }
    @GetMapping("/getAllResourcesByDataCenter/{dataCenterName}")
    public List<Resources> getAllResourcesByDataCenter(@PathVariable String dataCenterName) {
        return iresourcesservice.getAllResourcesByDataCenter(dataCenterName);
    }
    @GetMapping("/findByType/{type}/{id}/{a}")
   public List<Resources> findByType(@PathVariable TypeResource type, @PathVariable int id,@PathVariable Availablity a){
        return iresourcesservice.findByType(type,id,a);
    }
    @GetMapping("/findByAvailablity/{type}/{id}")
    public List<EnvCompute> findByAvailablity(@PathVariable Availablity type, @PathVariable int id){
        return ienvcomputeservice.findByAvailablity(type,id);
    }
    @GetMapping("/findComputesByYear/{type}/{id}/{year}")
    public List<EnvCompute> findComputesByYear(@PathVariable Availablity type, @PathVariable int id, @PathVariable int year){
        return ienvcomputeservice.findComputesByYear(type,id,year);
    }
    @GetMapping("/findByAvailablityStorage/{type}/{id}")
    public List<EnvStorage> findByAvailablityStorage(@PathVariable Availablity type, @PathVariable int id){
        return ienvstorageservice.findByAvailablityStorage(type,id);
    }
    @GetMapping("/findByAvailablityControlNetwork/{type}/{id}")
    public List<EnvControlNetwork> findByAvailablityControlNetwork(@PathVariable Availablity type, @PathVariable int id){
        return ienvControlnetworkservice.findByAvailablityControlNetwork(type,id);
    }
    @GetMapping("/findByAvailablityElements/{type}/{id}")
    public List<NetworkElements> findByAvailablityElements(@PathVariable Availablity type, @PathVariable int id){
        return INetworkElementsService.findByAvailablity(type,id);
    }

    //////////////////////////////////DevicesPur///////////////////////////////////////////////
    @PostMapping("/addDevicesPur/{id}")
    public String addDevicesPur(@RequestBody DevicesPur e, @PathVariable int id){
        return iDevicesPurservice.addDevicesPur(e,id);
    }
    @PutMapping("/updateDevicesPur/{id}")
    public String updateDevicesPur(@RequestBody DevicesPur e,@PathVariable int id){
        return iDevicesPurservice.updateDevicesPur(e,id);
    }
    @DeleteMapping("/deleteDevicesPur/{id}")
    public String deleteDevicesPur(@PathVariable int id) {

        return  iDevicesPurservice.deleteDevicesPur(id);
    }
    @GetMapping("/getDevicesPurById/{id}")
    public DevicesPur getDevicesPurById(@PathVariable int id){

        return iDevicesPurservice.getDevicesPurById(id);
    }
    @GetMapping("/getAllDevicesPur")
    public List<DevicesPur> getAllDevicesPur(){

        return iDevicesPurservice.getAllDevicesPur();
    }
    @GetMapping("/findDevicesPurByDataCenter/{id}")
    public  List<DevicesPur> findByDataCenter(@PathVariable int id){
        return iDevicesPurservice.findByDataCenter(id);
    }

    //////////////////////////////////LicensesPur///////////////////////////////////////////////
    @PostMapping("/addLicensesPur/{id}")
    public String addLicensesPur(@RequestBody LicensesPur e, @PathVariable int id){
        return iLicensesPurservice.addLicensesPur(e,id);
    }
    @PutMapping("/updateLicensesPur/{id}")
    public String updateLicensesPur(@RequestBody LicensesPur e,@PathVariable int id){
        return iLicensesPurservice.updateLicensesPur(e,id);
    }
    @DeleteMapping("/deleteLicensesPur/{id}")
    public String deleteLicensesPur(@PathVariable int id) {

        return  iLicensesPurservice.deleteLicensesPur(id);
    }
    @GetMapping("/getLicensesPurById/{id}")
    public LicensesPur getLicensesPurById(@PathVariable int id){

        return iLicensesPurservice.getLicensesPurById(id);
    }
    @GetMapping("/getAllLicensesPur")
    public List<LicensesPur> getAllLicensesPur(){

        return iLicensesPurservice.getAllLicensesPur();
    }
    @GetMapping("/findLicensesPurByDataCenter/{id}")
    public  List<LicensesPur> findByLicensesPurDataCenter(@PathVariable int id){
        return iLicensesPurservice.findByDataCenter(id);
    }
    //////////////////////////////////ServersPur///////////////////////////////////////////////
    @PostMapping("/addServersPur/{id}")
    public String addServersPur(@RequestBody ServersPur e, @PathVariable int id){
        return iServersPurservice.addServersPur(e,id);
    }
    @PutMapping("/updateServersPur/{id}")
    public String updateServersPur(@RequestBody ServersPur e,@PathVariable int id){
        return iServersPurservice.updateServersPur(e,id);
    }
    @DeleteMapping("/deleteServersPur/{id}")
    public String deleteServersPur(@PathVariable int id) {

        return  iServersPurservice.deleteServersPur(id);
    }
    @GetMapping("/getServersPurById/{id}")
    public ServersPur getServersPurById(@PathVariable int id){

        return iServersPurservice.getServersPurById(id);
    }
    @GetMapping("/getAllServersPur")
    public List<ServersPur> getAllServersPur(){

        return iServersPurservice.getAllServersPur();
    }
    @GetMapping("/findServersPurByDataCenter/{id}")
    public  List<ServersPur> findByServersPurDataCenter(@PathVariable int id){
        return iServersPurservice.findByDataCenter(id);
    }

    //////////////////////////////////LicensesPrice///////////////////////////////////////////////
    @PostMapping("/addLicensesPrice")
    public String addLicensesPrice(@RequestBody LicensesPrice z) {

        return  iLicensesPriceservice.addLicensesPrice(z);
    }
    @PutMapping("/updateLicensesPrice/{id}")
    public String updateLicensesPrice(@RequestBody LicensesPrice z,@PathVariable int id){
        return iLicensesPriceservice.updateLicensesPrice(z,id);
    }
    @DeleteMapping("/deleteLicensesPrice/{id}")
    public String deleteLicensesPrice(@PathVariable int id) {

        return  iLicensesPriceservice.deleteLicensesPrice(id);
    }
    @GetMapping("/getAllLicensesPrice")
    public List<LicensesPrice> getAllLicensesPrice(){

        return iLicensesPriceservice.getAllLicensesPrice();
    }
    @GetMapping("/getLicensesPriceById/{id}")
    public LicensesPrice getLicensesPriceById(@PathVariable int id){

        return iLicensesPriceservice.getLicensesPriceById(id);
    }

    //////////////////////////////////ServersAndDevicesPrice///////////////////////////////////////////////
    @PostMapping("/addServersAndDevicesPrice")
    public String addServersAndDevicesPrice(@RequestBody ServersAndDevicesPrice z) {

        return  iServersAndDevicesPriceservice.addServersAndDevicesPrice(z);
    }
    @PutMapping("/updateServersAndDevicesPrice/{id}")
    public String updateServersAndDevicesPrice(@RequestBody ServersAndDevicesPrice z,@PathVariable int id){
        return iServersAndDevicesPriceservice.updateServersAndDevicesPrice(z,id);
    }
    @DeleteMapping("/deleteServersAndDevicesPrice/{id}")
    public String deleteServersAndDevicesPrice(@PathVariable int id) {

        return  iServersAndDevicesPriceservice.deleteServersAndDevicesPrice(id);
    }
    @GetMapping("/getAllServersAndDevicesPrice")
    public List<ServersAndDevicesPrice> getAllServersAndDevicesPrice(){

        return iServersAndDevicesPriceservice.getAllServersAndDevicesPrice();
    }
    @GetMapping("/getServersAndDevicesPriceById/{id}")
    public ServersAndDevicesPrice getServersAndDevicesPriceById(@PathVariable int id){

        return iServersAndDevicesPriceservice.getServersAndDevicesPriceById(id);
    }
    @GetMapping("/findByTypeServer/{type}")
    public  List<ServersAndDevicesPrice> findByTypeServer(@PathVariable ServerType type){
        return iServersAndDevicesPriceservice.findByTypeServer(type);
    }
    @GetMapping("/findServersAndDevicesPriceByName/{name}")
    public  ServersAndDevicesPrice findByName(@PathVariable String name){
        return iServersAndDevicesPriceservice.findByName(name);
    }

    //////////////////////////////////ServicesPrice///////////////////////////////////////////////
    @PostMapping("/addServicesPrice")
    public String addServicesPrice(@RequestBody ServicesPrice z) {

        return  iServicesPriceservice.addServicesPrice(z);
    }
    @PutMapping("/updateServicesPrice/{id}")
    public String updateServicesPrice(@RequestBody ServicesPrice z,@PathVariable int id){
        return iServicesPriceservice.updateServicesPrice(z,id);
    }
    @DeleteMapping("/deleteServicesPrice/{id}")
    public String deleteServicesPrice(@PathVariable int id) {

        return  iServicesPriceservice.deleteServicesPrice(id);
    }
    @GetMapping("/getAllServicesPrice/{s}")
    public List<ServicesPrice> getAllServicesPrice(@PathVariable Services s){

        return iServicesPriceservice.getAllServicesPrice(s);
    }
    @GetMapping("/getServicesPriceByName/{name}")
    public ServicesPrice getServicesPriceByName(@PathVariable String name){

        return iServicesPriceservice.getServicesPriceByName(name);
    }

    @GetMapping("/getServicesPriceByProvider/{p}")
    public List<ServicesPrice> getServicesPriceByProvider(@PathVariable String p){

        return iServicesPriceservice.getServicesPriceByProvider(p);
    }


}
