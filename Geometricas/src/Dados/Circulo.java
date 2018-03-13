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
public class Circulo {
    
    private double cx;
    private double cy;
    private double raio;
    private String Tperimetro = "Area e Perimetro";

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void AreaPerimetro (double raio) {
	double area = Math.pow(raio, 2) * 3.14;
        double perimetro = Math.pow(3.14, 2) * raio;
	JOptionPane.showMessageDialog(null, " Perimetro: " + perimetro +
                                            "\n" + " Area: " + area,
                                             Tperimetro , JOptionPane.INFORMATION_MESSAGE);
    }
   
    
    
    
    
    
}
