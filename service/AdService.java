package com.qk.directory.service;

import com.qk.directory.dto.Ad;
import java.util.ArrayList;
import java.util.Date;


public interface AdService {
    public boolean addAd(Ad ad);

    public boolean updateAd(Ad ad);

    public boolean deleteAd(Ad ad);

    public Ad getAdBy_ad_id(Integer ad_id);
    
    public Ad getAdBy_ad_name(String ad_name);
    
    public Ad getAdBy_ad_title(String ad_title);

    public Ad getAdBy_ad_keywd(String ad_keywd);

    public Ad getAdBy_ad_date(Date ad_date);

    public Ad getAdBy_ad_pnum(Integer ad_pnum);
    
    public ArrayList<Ad> getAllAd();
}
