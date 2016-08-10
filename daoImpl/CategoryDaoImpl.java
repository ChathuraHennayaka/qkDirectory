package com.qk.directory.daoImpl;

import com.qk.directory.dao.CategoryDao;
import com.qk.directory.dto.Category;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }

    public boolean addCategory(Category category) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(category);
        openSession.getTransaction().commit();
        openSession.close();

        return true;

    }

    public boolean updateCategory(Category category) {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(category);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteCategory(Category category)  {
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(category);
        openSession.getTransaction().commit();
        openSession.close();
        return true;
    }

    public Category getCategoryBy_c_id(Integer c_id)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findByCId");
        namedQuery.setInteger("cId", c_id);
        Category category = (Category) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return category;
    }

    public Category getCategoryBy_c_name(String c_name)  {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findByCName");
        namedQuery.setString("cName", c_name);
        Category category = (Category) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return category;
    }

    public ArrayList<Category> getAllCategory() {
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Category.findAll");
        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Category>) list;
    }


}
