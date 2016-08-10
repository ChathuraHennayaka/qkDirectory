package com.qk.directory.serviceImpl;

import com.qk.directory.dao.AdDao;
import com.qk.directory.dto.Ad;
import com.qk.directory.service.AdService;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService{
    
    @Autowired
    AdDao adDao;
    
    public boolean addAd(Ad ad){
        return adDao.addAd(ad);
    }

    public boolean updateAd(Ad ad){
        return adDao.updateAd(ad);
    }

    public boolean deleteAd(Ad ad){
        return adDao.deleteAd(ad);
    }

    public Ad getAdBy_ad_id(Integer ad_id){
        return adDao.getAdBy_ad_id(ad_id);
    }
    
    public Ad getAdBy_ad_name(String ad_name){
        return adDao.getAdBy_ad_name(ad_name);
    }
    
    public Ad getAdBy_ad_title(String ad_title){
        return adDao.getAdBy_ad_title(ad_title);
    }

    public Ad getAdBy_ad_keywd(String ad_keywd){
        return adDao.getAdBy_ad_keywd(ad_keywd);
    }

    public Ad getAdBy_ad_date(Date ad_date){
        return adDao.getAdBy_ad_date(ad_date);
    }

    public Ad getAdBy_ad_pnum(Integer ad_pnum){
        return adDao.getAdBy_ad_pnum(ad_pnum);
    }
    
    public ArrayList<Ad> getAllAd(){
        return adDao.getAllAd();
    }
}
