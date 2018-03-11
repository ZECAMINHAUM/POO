/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Lucas
 */
public class Circulo {
    
    private double raio;
    private String Tarea = "Area";
    private String Tperimetro = "Perimetro";
    
    public void setCirculo(double raio){
        this.raio = raio;
    }
    
    public double getCirculo(){
        return this.raio;
    }
    //calculo area
    public void area (double raio) {
	raio = Math.pow(raio, 2) * 3.14;
	JOptionPane.showMessageDialog(null, raio, Tarea ,JOptionPane.INFORMATION_MESSAGE);
    }
	
    //calculo de perimetro
    public void perimetro (double raio) {
	raio = Math.pow(3.14, 2) * raio;
	JOptionPane.showMessageDialog(null, raio, Tperimetro , JOptionPane.INFORMATION_MESSAGE);
    }
    
}
