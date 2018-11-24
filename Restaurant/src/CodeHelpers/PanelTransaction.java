/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeHelpers;

import javax.swing.JPanel;

/**
 *
 * @author oscar
 */
public class PanelTransaction {
    //Esta clase contiene metodos especificos para cambiar los paneles en un layout
    
    
    
    //Funcion que permite cambiar los paneles a voluntad, argumentos panelContenedor, panel a cargar
    public void cambiarPanel(JPanel contenedor,JPanel panel)
    {
        contenedor.removeAll();
        contenedor.add(panel);
        contenedor.updateUI();
        contenedor.repaint();
        contenedor.repaint();
    }
    
}
