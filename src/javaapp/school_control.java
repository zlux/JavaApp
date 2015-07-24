/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author zlux
 */
public class school_control {
    
    private school_view  schoolview;
    private school_model schoolmodel;
    
    school_control(school_view view, school_model model)
    {
        schoolview  = view;
        schoolmodel = model;
        
        schoolview.btn_add_school_add_listener(new add_school_listener());
    }
    
    
    class add_school_listener implements ActionListener
    {
       @Override
       public void actionPerformed(ActionEvent e)
       {
           //get data from user's input
           schoolview.saveAllData();
           
           //save data into model class
           schoolmodel.setSchoolID(schoolview.school_id);
           schoolmodel.setSchoolName(schoolview.school_name);
           
           //save to Database
           schoolmodel.saveToDB();
       }

    }
    
}
