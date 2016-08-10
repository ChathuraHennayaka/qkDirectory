package com.qk.directory.service;

import com.qk.directory.dto.Category;
import java.sql.SQLException;
import java.util.ArrayList;


public interface CategoryService {

    public boolean addCategory(Category category);
    public boolean updateCategory(Category category);
    public boolean deleteCategory(Category category);
    
    public Category getCategoryBy_c_id(Integer c_id);
    public Category getCategoryBy_c_name(String c_name);

    public ArrayList<Category> getAllCategory();
    
}
