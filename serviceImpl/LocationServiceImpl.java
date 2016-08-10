package com.qk.directory.serviceImpl;

import com.qk.directory.dao.LocationDao;
import com.qk.directory.dto.Location;
import com.qk.directory.service.LocationService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService{
    
    @Autowired
    LocationDao locationDao;
    public boolean addLocation(Location loc){
        return locationDao.addLocation(loc);
    }

    public boolean updateLocation(Location loc){
        return locationDao.updateLocation(loc);
    }

    public boolean deleteLocation(Location loc){
        return locationDao.deleteLocation(loc);
    }

    public Location getLocationBy_loc_id(Integer loc_id){
        return locationDao.getLocationBy_loc_id(loc_id);
    }
    
    public Location getLocationBy_loc_name(String loc_name){
        return locationDao.getLocationBy_loc_name(loc_name);
    }

    public ArrayList<Location> getAllLocation(){
        return locationDao.getAllLocation();
    }
}
