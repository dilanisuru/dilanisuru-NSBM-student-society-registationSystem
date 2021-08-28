/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MehodClass;

import DBConection.DB_Con;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anushka Wijewickrama
 */
public class RemoveStudent {
    private boolean status =false;
    FunctionVisible fv = new FunctionVisible();
    DB_Con db = new DB_Con();
    
    public boolean removeStudent(String id){
     try {
            Connection c;
            c = DB_Con.getMyConnection();
            Statement s = c.createStatement();
            
            String query = "DELETE FROM register WHERE Index_No ="+id;
            s.execute(query);
            //clear_Control();
            
           
        } catch (ClassNotFoundException | SQLException ex) {
            status =false;
            //JOptionPane.showMessageDialog(null, "Data delete not correctly");
            
        }
     return status;
    }
    
    public boolean removStudentdislist(DefaultTableModel jtable){
    try {
            DefaultTableModel dtm = (DefaultTableModel)jtable;
            dtm.setRowCount(0);
             Connection c;
             c = DB_Con.getMyConnection();
             Statement s= c.createStatement();
            
            String query ="SELECT * FROM register";
            
            ResultSet rst = s.executeQuery(query);
            while(rst.next()){
                Vector v = new Vector();
                v.add(rst.getInt("Index_No"));
                v.add(rst.getString("FirstName"));
                v.add(rst.getString("LastName"));
                v.add(rst.getInt("Age"));
                v.add(rst.getInt("Tel_No"));
                v.add(rst.getString("Address"));
               
                dtm.addRow(v);
                status=true;
        }
            
        } catch (ClassNotFoundException | NumberFormatException | SQLException ex) {
            status=false;
            // JOptionPane.showMessageDialog(null, "Database Empty","Error",JOptionPane.ERROR_MESSAGE);
            
        }
            return status;
    }
    
    public boolean regStudent(int id, String fname, String lname, int age, int tel_no, String address){
        
        try {
            Connection c;
            c = DB_Con.getMyConnection();
            Statement s = c.createStatement();
            
            String query = "INSERT INTO register(Index_No, FirstName, LastName, Age, Tel_No, Address)  VALUES ('"+id+"','"+fname+"','"+lname+"','"+age+"','"+tel_no+"','"+address+"')";
            s.execute(query);
            //clear_Control();
            
            status=true;
        } catch (ClassNotFoundException | SQLException ex) {
            
           status=false;
            
        }
       
    return status;
    }
}
