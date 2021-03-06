
package com.qk.directory.dao;

import com.qk.directory.dto.SubCategTwo;
import java.util.ArrayList;


public interface SubCategTwoDao {
    
    public boolean addSubCategTwo(SubCategTwo subCategTwo);

    public boolean updateSubCategTwo(SubCategTwo subCategTwo);

    public boolean deleteSubCategTwo(SubCategTwo subCategTwo);

    public SubCategTwo getSubCategTwotBy_sbt_id(Integer sbt_id);

    public SubCategTwo getSubCategTwoBy_sbt_name(String sbt_name);

    public ArrayList<SubCategTwo> getAllSubCategTwo();
}
