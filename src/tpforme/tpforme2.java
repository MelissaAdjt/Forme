/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpforme;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseMotionListener;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.beans.*;
import java.io.Serializable;
import javax.swing.JColorChooser;

/**
 *
 * @author HP
 */
public class tpforme2 implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
    
    public tpforme2() {
        propertySupport = new PropertyChangeSupport(this);
    }
     private void setBackground(Color couleur) {
      
    }
    
    public void changecouleur(){
      Color couleur = JColorChooser.showDialog(null, "couleur du fond", Color.DARK_GRAY);
      this.setBackground(couleur);
   }
     
 
   
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
public static void main(String[] args) {
        // TODO code application logic here
    }

   
}
