/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MehodClass;

import javax.swing.JPanel;

/**
 *
 * @author Anushka Wijewickrama
 */
public class SetColour {
     // set colour
    public void stclr(JPanel Panel){//set clour
    Panel.setBackground(new java.awt.Color(111,165,255));
}
   public void rclr(JPanel Panel){//reset clour
    Panel.setBackground(new java.awt.Color(255,255,255));
}
}
