package com.qk.directory.service;

import com.qk.directory.dto.Usr;
import java.util.ArrayList;


public interface UsrService {
    public boolean addUsr(Usr usr);

    public boolean updateUsr(Usr usr);

    public boolean deleteUsr(Usr usr);

    public Usr getUsrBy_usr_id(Integer usr_id);

    public Usr getUsrBy_usr_name(String usr_name);
    
    public Usr getUsrBy_usr_email(String usr_email);

    public ArrayList<Usr> getAllUsr();
}
