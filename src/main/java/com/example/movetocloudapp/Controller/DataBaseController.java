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
    @GetMapping("/findByType/{type}/{name}")
   public List<Resources> findByType(@PathVariable TypeResource type, @PathVariable String name){
        return iresourcesservice.findByType(type,name);
    }
    @GetMapping("/findByAvailablity/{type}/{name}")
    public List<EnvCompute> findByAvailablity(@PathVariable Availablity type, @PathVariable String name){
        return ienvcomputeservice.findByAvailablity(type,name);
    }
    @GetMapping("/findByAvailablityStorage/{type}/{name}")
    public List<EnvStorage> findByAvailablityStorage(@PathVariable Availablity type, @PathVariable String name){
        return ienvstorageservice.findByAvailablityStorage(type,name);
    }
    @GetMapping("/findByAvailablityControlNetwork/{type}/{name}")
    public List<EnvControlNetwork> findByAvailablityControlNetwork(@PathVariable Availablity type, @PathVariable String name){
        return ienvControlnetworkservice.findByAvailablityControlNetwork(type,name);
    }


}
