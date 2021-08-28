/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MehodClass;

import DBConection.DB_Con;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anushka Wijewickrama
 */
public class UpdateStudent {
    private boolean status =false;//create private variable
    ;
   public boolean  updateStudent(String fName,String Lname ,String age ,String tele_No,String address,String index_No){
     try {
            
            Connection c= DBConection.DB_Con.getMyConnection();
            Statement s = c.createStatement();
            
            String quary = "UPDATE register SET FirstName = '"+fName+"', LastName = '"+Lname+"', Age ='"+age+"', Tel_No ='"+tele_No+"', Address ='"+address+"' WHERE Index_No ='"+index_No+"'  ";
            s.executeUpdate(quary);
            status = true;
            //JOptionPane.showMessageDialog(null, "Update Succesfull !!");

        } catch (ClassNotFoundException | SQLException ex) {
            status = false;
        }  
     return status;
    } 
   

   }

