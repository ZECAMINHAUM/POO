/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Quadrado {
    
    private double area ;
    private double perimetro ;
    private final String Tperimetro = "Area e Perimetro";

    public void AreaPerimetro(double x){
        
        area = x * x;
        perimetro = 4*x;
        JOptionPane.showMessageDialog(null, " Perimetro: " + perimetro +
                                            "\n" + " Area: " + area,
                                             Tperimetro , JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean tadentro(double qx, double px, double py){
        
        if(px > qx || py > qx){ 
            return false;
        }else{
           return false;
        }
        
    }
}
