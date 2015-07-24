/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

/**
 *
 * @author zlux
 */
public class school_model {
    private String school_id;
    private String school_name;
    
    
    
    public void setSchoolID(String id)
    {
        school_id = id;
    }
    
    public void setSchoolName(String name)
    {
        school_name = name;
    }
    
    public String getSchoolID()
    {
        return school_id;
    }
    
    public String getSchoolName()
    {
        return school_name;
    }
    
    
    public int saveToDB()
    {
        return 0;
    }
    
}
