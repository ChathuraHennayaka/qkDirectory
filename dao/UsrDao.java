package com.qk.directory.dao;

import com.qk.directory.dto.Usr;
import java.util.ArrayList;


public interface UsrDao {
    public boolean addUsr(Usr usr);

    public boolean updateUsr(Usr usr);

    public boolean deleteUsr(Usr usr);

    public Usr getUsrBy_usr_id(Integer usr_id);

    public Usr getUsrBy_usr_name(String usr_name);
    
    public Usr getUsrBy_usr_email(String usr_email);

    public ArrayList<Usr> getAllUsr();
}
