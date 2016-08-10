package com.qk.directory.daoImpl;

import com.qk.directory.dao.UsrDao;
import com.qk.directory.dto.Usr;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsrDaoImpl implements UsrDao{
    
    
    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }
    
    public boolean addUsr(Usr usr){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(usr);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean updateUsr(Usr usr){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(usr);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteUsr(Usr usr){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(usr);
        openSession.getTransaction().commit();
        openSession.close();
        return true;
    }

    public Usr getUsrBy_usr_id(Integer usr_id){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Usr.findByUsrId");
        namedQuery.setInteger("usrId", usr_id);
        Usr usr = (Usr) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return usr;
    }

    public Usr getUsrBy_usr_name(String usr_name){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findByCName");
        namedQuery.setString("cName", usr_name);
        Usr usr = (Usr) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return usr;
    }
    
    public Usr getUsrBy_usr_email(String usr_email){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Usr.findByUsrEmail");
        namedQuery.setString("usrEmail", usr_email);
        Usr usr = (Usr) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return usr;
    }

    public ArrayList<Usr> getAllUsr(){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findAll");
        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Usr>) list;
    }
}
