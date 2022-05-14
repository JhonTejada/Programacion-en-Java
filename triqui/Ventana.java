
package com.usc.ui;

import java.awt.Color;
import javax.swing.JFrame;


public class Ventana extends JFrame{
    
    PnelLogo Logotriqui;
    PanelTablero tablerotriqui;
    PanelPuntaje puntajetriqui;
    
    
    public static void main(String [] args){
        Ventana miVentana = new Ventana();
        miVentana.setVisible(true);
}
    
    /*metodo constructor para establecer las caracteristicas de la ventana*/
    public Ventana()
    {
        this.setTitle("Mi 1° aplicación con UI");
        this.setBackground(Color.black);
        this.setSize(800,600);
        this.setResizable(false);
        
        Logotriqui = new PnelLogo();
        this.add(Logotriqui);   
        
        tablerotriqui = new PanelTablero();
        this.add(tablerotriqui);
        
        puntajetriqui = new PanelPuntaje();
        this.add(puntajetriqui);
    }
}
