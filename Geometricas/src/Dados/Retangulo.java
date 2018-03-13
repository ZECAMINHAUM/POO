/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import javax.swing.JOptionPane;

/**
 *
 * @author pesquisa
 */
public class Retangulo extends Circulo{
    
    private double rx;
    private double ry;
    private String Tperimetro = "Area e Perimetro";

    public double getRx() {
        return rx;
    }

    public void setRx(double rx) {
        this.rx = rx;
    }

    public double getRy() {
        return ry;
    }

    public void setRy(double ry) {
        this.ry = ry;
    }
    
    
    
    
    public void RAreaPerimetro (double x1, double x2, double y1, double y2){ 
        
        double perimetro = x1 + x2 + y1 + y2;
        double area = Math.abs(x1 - x2)* Math.abs(y1 - y2);
        JOptionPane.showMessageDialog(null, " Perimetro: " + perimetro +
                                            "\n" + " Area: " + area,
                                             Tperimetro , JOptionPane.INFORMATION_MESSAGE);
                
        
    }
    
}
