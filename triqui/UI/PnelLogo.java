
package com.usc.ui;

import javax.swing.*;


public class PnelLogo extends JPanel{
    
    JLabel textoLogo;
    
    
   public PnelLogo(){
       
       textoLogo = new JLabel("Aqui va el logo");
       textoLogo.setText("Aqui va el logo");
       add(textoLogo);
   }
    
}
