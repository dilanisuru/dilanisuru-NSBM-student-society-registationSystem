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
public class DisplayStudent extends DBConection.DB_Con{
    DBConection.DB_Con db = new DB_Con();
    private boolean status =false;
    
    public  boolean listStudent(DefaultTableModel jTable) {
       try {
            DefaultTableModel dtm = (DefaultTableModel)jTable;
            dtm.setRowCount(0);
             Connection c;
             c = db.getMyConnection();
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
            
        } 
       return status;
    }
}
