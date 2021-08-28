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
public class InsertStudent extends DB_Con{
 DB_Con db = new DB_Con();
    
    private boolean status =false;
    public boolean regStudent(String id, String fname, String lname, String age, String tel_no, String address){
        
        try {
            Connection c;
            c = db.getMyConnection();
            Statement s = c.createStatement();
            
            String query = "INSERT INTO register(Index_No, FirstName, LastName, Age, Tel_No, Address)  VALUES ('"+id+"','"+fname+"','"+lname+"','"+age+"','"+tel_no+"','"+address+"')";
            s.execute(query);
            
            
            status=true;
        } catch (ClassNotFoundException | SQLException ex) {
            
           status=false;
            
        }
       
    return status;
    }
}
