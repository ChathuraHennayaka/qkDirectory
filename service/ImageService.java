package com.qk.directory.service;

import com.qk.directory.dto.Image;
import java.util.ArrayList;


public interface ImageService {
    public boolean addImage(Image img);

    public boolean updateImage(Image img);

    public boolean deleteImage(Image img);

    public Image getImageBy_img_id(Integer img_id);  

    public ArrayList<Image> getImage();
}
