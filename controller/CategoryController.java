package com.qk.directory.controller;

import com.qk.directory.dto.Category;
import com.qk.directory.service.CategoryService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/")
public class CategoryController{
    @Autowired
    CategoryService categoryService;

    @RequestMapping(value={"/makeCatogary"},method=RequestMethod.GET)
    public String makeAccount(Model model) { 
        Category category1=new Category(001, "Products or Services");
        Category category2=new Category(002, "Business Organisation");
        Category category3=new Category(003, "Government Organisation");
        Category category4=new Category(004, "Religious Places");
        Category category5=new Category(005, "Personal Names");
        categoryService.addCategory(category1);
        categoryService.addCategory(category2);
        categoryService.addCategory(category3);
        categoryService.addCategory(category4);
        categoryService.addCategory(category5);
        return "Category";
    }
    @RequestMapping(value={"/updateCatogary"},method=RequestMethod.GET)
    public String update(Model model) { 
        Category category1=new Category(001, "Products or Services");
        Category category2=new Category(002, "Business Organisation");
        Category category3=new Category(003, "Government Organisation");
        Category category4=new Category(004, "Religious Places");
        Category category5=new Category(005, "Personal Names");
        categoryService.updateCategory(category1);
        categoryService.updateCategory(category2);
        categoryService.updateCategory(category3);
        categoryService.updateCategory(category4);
        categoryService.updateCategory(category5);
        return "Category";
    }
    @RequestMapping(value={"/deleteCatogary"},method=RequestMethod.GET)
    public String delete(Model model) { 
        Category category1=new Category(001, "Products or Services");
        Category category2=new Category(002, "Business Organisation");
        Category category3=new Category(003, "Government Organisation");
        Category category4=new Category(004, "Religious Places");
        Category category5=new Category(005, "Personal Names");
        categoryService.deleteCategory(category1);
        categoryService.deleteCategory(category2);
        categoryService.deleteCategory(category3);
        categoryService.deleteCategory(category4);
        categoryService.deleteCategory(category5);
        return "Category";
    }
    @RequestMapping(value={"/getCatogary"},method=RequestMethod.GET)
    public String getAll(Model model) { 
        
        ArrayList<Category> allCategory = categoryService.getAllCategory();
        for (Category category : allCategory) {
            System.out.println(category.getCId()+" "+category.getCName());
        }
        return "Category";
    }
  
}

