package com.qk.directory.daoImpl;

import com.qk.directory.dao.SubCategTwoDao;
import com.qk.directory.dto.SubCategTwo;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SubCategTwoDaoImpl implements SubCategTwoDao {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addSubCategTwo(SubCategTwo subCategTwo) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(subCategTwo);
        openSession.getTransaction().commit();
        openSession.close();

        return true;

    }

    public boolean updateSubCategTwo(SubCategTwo subCategTwo) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(subCategTwo);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteSubCategTwo(SubCategTwo subCategTwo)  {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(subCategTwo);
        openSession.getTransaction().commit();
        openSession.close();
        return true;
    }

    public SubCategTwo getSubCategTwotBy_sbt_id(Integer sbt_id)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategTwo.findBySbtId");
        namedQuery.setInteger("sbtId", sbt_id);
        SubCategTwo subCategTwo = (SubCategTwo) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return subCategTwo;
    }

    public SubCategTwo getSubCategTwoBy_sbt_name(String sbt_name)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategTwo.findBySbtName");
        namedQuery.setString("sbtName", sbt_name);
        SubCategTwo subCategTwo = (SubCategTwo) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return subCategTwo;
    }

    public ArrayList<SubCategTwo> getAllSubCategTwo() {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("SubCategTwo.findAll");        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<SubCategTwo>) list;
    }

    
}
