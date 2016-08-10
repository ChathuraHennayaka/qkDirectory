package com.qk.directory.serviceImpl;

import com.qk.directory.dao.SubCategOneDao;
import com.qk.directory.dto.SubCategOne;
import com.qk.directory.service.SubCategOneService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategOneServiceImpl implements SubCategOneService{
    
    @Autowired
    SubCategOneDao subCategOneDao;
    public boolean addSubCategOne(SubCategOne subCategOne){
        return subCategOneDao.addSubCategOne(subCategOne);
    }

    public boolean updateSubCategOne(SubCategOne subCategOne){
        return subCategOneDao.updateSubCategOne(subCategOne);
    }

    public boolean deleteSubCategOne(SubCategOne subCategOne){
        return subCategOneDao.deleteSubCategOne(subCategOne);
    }

    public SubCategOne getSubCategOnetBy_sbo_id(Integer sbo_id){
        return subCategOneDao.getSubCategOnetBy_sbo_id(sbo_id);
    }

    public SubCategOne getSubCategOneBy_sbo_name(String sbo_name){
        return subCategOneDao.getSubCategOneBy_sbo_name(sbo_name);
    }

    public ArrayList<SubCategOne> getAllSubCategOne(){
        return subCategOneDao.getAllSubCategOne();
    }
}
