package com.qk.directory.service;

import com.qk.directory.dto.Location;
import java.util.ArrayList;

public interface LocationService {
    public boolean addLocation(Location loc);

    public boolean updateLocation(Location loc);

    public boolean deleteLocation(Location loc);

    public Location getLocationBy_loc_id(Integer loc_id);  
    
    public Location getLocationBy_loc_name(String loc_name);  

    public ArrayList<Location> getAllLocation();
}
