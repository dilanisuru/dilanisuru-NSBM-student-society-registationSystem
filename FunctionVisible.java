/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MehodClass;

import Pages.Calender;
import Pages.Help;
import Pages.Help2;
import Pages.Help3;
import Pages.Help4;
import Pages.LoginPage;
import Pages.RegistationLogin;
import Pages.WelcomePage;
import javax.swing.JFrame;

/**
 *
 * @author Anushka Wijewickrama
 */
public class FunctionVisible extends javax.swing.JFrame{
    
  // RegistationLogin rg = new RegistationLogin();
    public void visibleloginpage(){
    //create function 
     LoginPage p1 = new LoginPage();
        p1.setVisible(true);//set visible
        p1.pack();
        p1.setLocationRelativeTo(null);//center location
        p1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
   

    }  
      public void visibleWelcomePage(){
    //create function 
       WelcomePage w1 = new WelcomePage();
        w1.setVisible(true);//set visible
        w1.pack();
        w1.setLocationRelativeTo(null);//center location
        w1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   }  
      
      public void visibleRegister(){
       RegistationLogin rg = new RegistationLogin();// create new object
       rg.setVisible(true);//visible true
       rg.pack();
       rg.setLocationRelativeTo(null);//center location
       rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
      }
      public void visibleCalcuter(){
        Calender c1= new Calender();//create object
        c1.setVisible(true);//visible true
        c1.pack();
        c1.setLocationRelativeTo(null);//center location
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   
   }
        public void visiblehelp2(){
        //create function 
        Help2 h2 = new Help2();
        h2.setVisible(true);//set visible
        h2.pack();
        h2.setLocationRelativeTo(null);//center location
        h2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();//close current jframe and open new jframe (open create new account jfarme)

}
        public void visiblehelp3(){
        //create function 
        Help3 h3 = new Help3();
        h3.setVisible(true);//set visible
        h3.pack();
        h3.setLocationRelativeTo(null);//center location
        h3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();//close current jframe and open new jframe (open create new account jfarme)

}
        public void visiblehelp4(){
        //create function 
        Help4 h4 = new Help4();
        h4.setVisible(true);//set visible
        h4.pack();
        h4.setLocationRelativeTo(null);//center location
        h4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();//close current jframe and open new jframe (open create new account jfarme)

}
        public void visiblehelp1(){
        //create function 
        Help h1 = new Help();
        h1.setVisible(true);//set visible
        h1.pack();
        h1.setLocationRelativeTo(null);//center location
        h1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();//close current jframe and open new jframe (open create new account jfarme)

}
}
