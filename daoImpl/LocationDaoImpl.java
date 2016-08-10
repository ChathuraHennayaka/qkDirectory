package com.qk.directory.daoImpl;

import com.qk.directory.dao.LocationDao;
import com.qk.directory.dto.Location;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LocationDaoImpl implements LocationDao{
    
    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }
    
    public boolean addLocation(Location loc){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(loc);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean updateLocation(Location loc){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(loc);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteLocation(Location loc){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(loc);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public Location getLocationBy_loc_id(Integer loc_id){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Location.findByLocId");
        namedQuery.setInteger("locId", loc_id);
        Location loc = (Location) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return loc;
    } 
    
    public Location getLocationBy_loc_name(String loc_name){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Location.findByLocName");
        namedQuery.setString("locName", loc_name);
        Location loc = (Location) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return loc;
    } 

    public ArrayList<Location> getAllLocation(){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Location.findAll");
        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Location>) list;
    }
}
