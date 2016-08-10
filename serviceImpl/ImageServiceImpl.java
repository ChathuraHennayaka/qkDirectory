package com.qk.directory.serviceImpl;

import com.qk.directory.dao.ImageDao;
import com.qk.directory.dto.Image;
import com.qk.directory.service.ImageService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService{
    
    @Autowired
    ImageDao imageDao;
    public boolean addImage(Image img){
        return imageDao.addImage(img);
    }

    public boolean updateImage(Image img){
        return imageDao.updateImage(img);
    }

    public boolean deleteImage(Image img){
        return imageDao.deleteImage(img);
    }

    public Image getImageBy_img_id(Integer img_id){
        return imageDao.getImageBy_img_id(img_id);
    }

    public ArrayList<Image> getImage(){
        return imageDao.getImage();
    }
}
