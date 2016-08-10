
package com.qk.directory.dao;

import com.qk.directory.dto.SubCategOne;
import java.util.ArrayList;


public interface SubCategOneDao {

    public boolean addSubCategOne(SubCategOne subCategOne);

    public boolean updateSubCategOne(SubCategOne subCategOne);

    public boolean deleteSubCategOne(SubCategOne subCategOne);

    public SubCategOne getSubCategOnetBy_sbo_id(Integer sbo_id);

    public SubCategOne getSubCategOneBy_sbo_name(String sbo_name);

    public ArrayList<SubCategOne> getAllSubCategOne();


}
