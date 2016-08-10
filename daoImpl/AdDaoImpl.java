package com.qk.directory.daoImpl;

import com.qk.directory.dao.AdDao;
import com.qk.directory.dto.Ad;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdDaoImpl implements AdDao{
    
    @Autowired
    SessionFactory factory;
    
    protected Session getSession() {
        return factory.openSession();
    }
    
    public boolean addAd(Ad ad){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(ad);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean updateAd(Ad ad){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(ad);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteAd(Ad ad){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(ad);
        openSession.getTransaction().commit();
        openSession.close();
        return true;
    }

    public Ad getAdBy_ad_id(Integer ad_id){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdId");
        namedQuery.setInteger("adId", ad_id);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }
    
    public Ad getAdBy_ad_name(String ad_name){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdName");
        namedQuery.setString("adName", ad_name);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }

    public Ad getAdBy_ad_date(Date ad_date){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdDate");
        namedQuery.setDate("adDate", ad_date);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }
    
    public Ad getAdBy_ad_keywd(String ad_keywd){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdKeywd");
        namedQuery.setString("adKeywd", ad_keywd);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }

    public Ad getAdBy_ad_title(String ad_title){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdTitle");
        namedQuery.setString("adTitle", ad_title);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }

    public Ad getAdBy_ad_pnum(Integer ad_pnum){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Ad.findByAdPnum");
        namedQuery.setInteger("adPnum", ad_pnum);
        Ad ad = (Ad) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return ad;
    }
    
    public ArrayList<Ad> getAllAd(){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findAll");        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Ad>) list;
    }
}
