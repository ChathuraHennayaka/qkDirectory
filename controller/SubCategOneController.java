package com.qk.directory.controller;

import com.qk.directory.dto.SubCategOne;
import com.qk.directory.service.SubCategOneService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class SubCategOneController {
    @Autowired
    SubCategOneService subCategOneService;
    
    @RequestMapping(value={"/makeSubCatogOne"},method=RequestMethod.GET)
    public String makeAccount(Model model) { 
        SubCategOne subCategOne=new SubCategOne(001, "Government Organisation");
        subCategOneService.addSubCategOne(subCategOne);
        return "SubCategOne";
    }
    @RequestMapping(value={"/updateSubCatogOne"},method=RequestMethod.GET)
    public String update(Model model) { 
        SubCategOne subCategOne=new SubCategOne(001, "Government Organisation");
        subCategOneService.updateSubCategOne(subCategOne);
        return "SubCatogOne";
    }
    @RequestMapping(value={"/deleteSubCatogOne"},method=RequestMethod.GET)
    public String delete(Model model) { 
        SubCategOne subCategOne=new SubCategOne(001, "Government Organisation");
        subCategOneService.deleteSubCategOne(subCategOne);
        return "SubCatogOne";
    }
    @RequestMapping(value={"/getSubCatogOne"},method=RequestMethod.GET)
    public String getAll(Model model) { 
        
        ArrayList<SubCategOne> allSubCategOne = subCategOneService.getAllSubCategOne();
        for (SubCategOne subCategOne : allSubCategOne) {
            System.out.println(subCategOne.getSboId()+" "+subCategOne.getSboName());
        }
        return "SubCatogOne";
    }
}
