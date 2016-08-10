package com.qk.directory.serviceImpl;

import com.qk.directory.dao.CategoryDao;
import com.qk.directory.dto.Category;
import com.qk.directory.service.CategoryService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceimpl implements CategoryService{
    
    @Autowired
    CategoryDao categoryDao;
    
    public boolean addCategory(Category category){
        return categoryDao.addCategory(category);
    }

    public boolean updateCategory(Category category) {
        return categoryDao.updateCategory(category);
    }

    public boolean deleteCategory(Category category){
        return categoryDao.deleteCategory(category);
    }

    public Category getCategoryBy_c_id(Integer c_id){
        return categoryDao.getCategoryBy_c_id(c_id);
    }

    public Category getCategoryBy_c_name(String c_name) {
        return categoryDao.getCategoryBy_c_name(c_name);
    }

    public ArrayList<Category> getAllCategory() {
        return  categoryDao.getAllCategory();
    }
    
}
