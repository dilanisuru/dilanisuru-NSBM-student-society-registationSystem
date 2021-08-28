/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MehodClass;

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Anushka Wijewickrama
 */
public class TextFiledClear {
   
    public void reclearTxtFiled(JTextField id ,JTextField fName, JTextField lName, JTextField age, JTextField tele_No, JTextArea address){
        id.setText("");
        fName.setText("");
        lName.setText("");
        age.setText("");
        tele_No.setText("");
        address.setText("");
    
    }
    
    public void reloginclearFiled(JTextField fName, JTextField lName, JTextField userName, JPasswordField password, JPasswordField rePassword, JTextArea address, JTextField birthday){
        fName.setText("");
        lName.setText("");
        userName.setText("");
        password.setText("");
        rePassword.setText("");
        address.setText("");
        birthday.setText("");
    
    }
    
}
