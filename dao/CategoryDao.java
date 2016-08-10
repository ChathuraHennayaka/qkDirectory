
package com.qk.directory.dao;

import com.qk.directory.dto.Category;
import java.util.ArrayList;


public interface CategoryDao {

    public boolean addCategory(Category category);

    public boolean updateCategory(Category category);

    public boolean deleteCategory(Category category);

    public Category getCategoryBy_c_id(Integer c_id);

    public Category getCategoryBy_c_name(String c_name);

    public ArrayList<Category> getAllCategory();
    
    
}
