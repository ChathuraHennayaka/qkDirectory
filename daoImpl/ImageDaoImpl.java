package com.qk.directory.daoImpl;

import com.qk.directory.dao.ImageDao;
import com.qk.directory.dto.Image;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ImageDaoImpl implements ImageDao{
    
    @Autowired
    SessionFactory factory;

    protected Session getSession() {
        return factory.openSession();
    }
    
    public boolean addImage(Image img){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.save(img);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean updateImage(Image img){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.update(img);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public boolean deleteImage(Image img){
        Session openSession = getSession();
        openSession.beginTransaction();
        openSession.delete(img);
        openSession.getTransaction().commit();
        openSession.close();

        return true;
    }

    public Image getImageBy_img_id(Integer img_id){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Image.findByImgId");
        namedQuery.setInteger("imgId", img_id);
        Image img = (Image) namedQuery.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return img;
    }

    public ArrayList<Image> getImage(){
        Session session = getSession();
        session.beginTransaction();
        Query namedQuery = session.getNamedQuery("Image.findAll");
        
        List list = namedQuery.list();
        session.getTransaction().commit();
        session.close();
        return (ArrayList<Image>) list;
    }
}
