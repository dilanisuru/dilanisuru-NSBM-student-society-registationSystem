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
import javax.swing.JOptionPane;

/**
 *
 * @author Anushka Wijewickrama
 */
public class StaffRegistation {
     FunctionVisible fv = new FunctionVisible();
     
    public void staffRegister(String fName,String lName,String userName, String password, String rePassword,String birthday,String address){
     
         
        //validation checking
        if(password.equals(rePassword) && !password.equals("") && !fName.equals("")&& !lName.equals("") && !userName.equals("") ){
        try {
            Connection c;
            c = DB_Con.getMyConnection();
            Statement s = c.createStatement();
            
            String query = "INSERT INTO login(FirstName, LastName, UserName, Password, Retype_Password, BirthDate, Address)  VALUES ('"+fName+"','"+lName+"','"+userName+"','"+password+"','"+rePassword+"','"+birthday+"','"+address+"')";
            s.execute(query);
            //clear_Control();//after save clear textFiled
            fv.visibleloginpage();
            JOptionPane.showMessageDialog(null, "Registation successfull");
        } catch (ClassNotFoundException e) {
            
            JOptionPane.showMessageDialog(null, "Data not Correctly Enterd !!","Access Denied",JOptionPane.ERROR_MESSAGE);
            
        }
         catch(SQLException ex){
             JOptionPane.showMessageDialog(null, "Enter different UserName","Access Denied",JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, ex.getMessage(),"Access Denied",JOptionPane.ERROR_MESSAGE);
         }
       
        }
        else{
            JOptionPane.showMessageDialog(null, "Data not Correctly Enterd !!","Access Denied",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
}

