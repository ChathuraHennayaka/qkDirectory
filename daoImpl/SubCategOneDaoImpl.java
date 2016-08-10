package com.qk.directory.daoImpl;

import com.qk.directory.dao.SubCategOneDao;
import com.qk.directory.dto.SubCategOne;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubCategOneDaoImpl implements SubCategOneDao {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addSubCategOne(SubCategOne subCategOne) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(subCategOne);
        openSession.getTransaction().commit();
        openSession.close();

        return true;

    }

    public boolean updateSubCategOne(SubCategOne subCategOne) {
         Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(subCategOne);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteSubCategOne(SubCategOne subCategOne)  {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(subCategOne);
        openSession.getTransaction().commit();
        openSession.close();
        return true;
    }

    public SubCategOne getSubCategOnetBy_sbo_id(Integer sbo_id)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategOne.findBySboId");
        namedQuery.setInteger("sboId", sbo_id);
        SubCategOne subCategOne = (SubCategOne) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return subCategOne;
    }

    public SubCategOne getSubCategOneBy_sbo_name(String sbo_name)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategOne.findBySboName");
        namedQuery.setString("sboName", sbo_name);
        SubCategOne subCategOne = (SubCategOne) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return subCategOne;
    }

    public ArrayList<SubCategOne> getAllSubCategOne() {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategOne.findAll");        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<SubCategOne>) list;
    }


}
