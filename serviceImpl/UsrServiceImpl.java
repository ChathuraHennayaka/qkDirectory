package com.qk.directory.serviceImpl;

import com.qk.directory.dao.UsrDao;
import com.qk.directory.dto.Usr;
import com.qk.directory.service.UsrService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsrServiceImpl implements UsrService{
    
    @Autowired
    UsrDao usrDao;
    
    public boolean addUsr(Usr usr){
        return usrDao.addUsr(usr);
    }

    public boolean updateUsr(Usr usr){
        return usrDao.updateUsr(usr);
    }

    public boolean deleteUsr(Usr usr){
        return usrDao.deleteUsr(usr);
    }

    public Usr getUsrBy_usr_id(Integer usr_id){
        return usrDao.getUsrBy_usr_id(usr_id);
    }

    public Usr getUsrBy_usr_name(String usr_name){
        return usrDao.getUsrBy_usr_name(usr_name);
    }
    
    public Usr getUsrBy_usr_email(String usr_email){
        return usrDao.getUsrBy_usr_email(usr_email);
    }

    public ArrayList<Usr> getAllUsr(){
        return usrDao.getAllUsr();
    }
}
