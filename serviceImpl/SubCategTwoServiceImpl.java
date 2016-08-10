package com.qk.directory.serviceImpl;

import com.qk.directory.dao.SubCategTwoDao;
import com.qk.directory.dto.SubCategTwo;
import com.qk.directory.service.SubCategTwoService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubCategTwoServiceImpl implements SubCategTwoService{
    
    @Autowired
    SubCategTwoDao subCategTwoDao;
    
    public boolean addSubCategTwo(SubCategTwo subCategTwo){
        return subCategTwoDao.addSubCategTwo(subCategTwo);
    }

    public boolean updateSubCategTwo(SubCategTwo subCategTwo){
        return subCategTwoDao.updateSubCategTwo(subCategTwo);
    }

    public boolean deleteSubCategTwo(SubCategTwo subCategTwo){
        return subCategTwoDao.deleteSubCategTwo(subCategTwo);
    }

    public SubCategTwo getSubCategTwotBy_sbt_id(Integer sbt_id){
        return subCategTwoDao.getSubCategTwotBy_sbt_id(sbt_id);
    }

    public SubCategTwo getSubCategTwoBy_sbt_name(String sbt_name){
        return subCategTwoDao.getSubCategTwoBy_sbt_name(sbt_name);
    }

    public ArrayList<SubCategTwo> getAllSubCategTwo(){
        return subCategTwoDao.getAllSubCategTwo();
    }
}
