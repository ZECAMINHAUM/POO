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
public class Pontos {
    
    private double x;
    private double y;
    private String Tdst = "Distancia";
    
    public void setpontoX(double x){
        this.x = x;
    }
    
    public double getpontoX(double x){
        return this.x;
    }
    
    
    public void setpontoY(double y){
        this.y = y;
    }
    
    public double getpontoY(double y){
        return this.y;
    }
    
    
    public double distancia (Pontos p1, Pontos p2) {
        Double resu;
                
        resu = Math.sqrt(Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y), 2));
        JOptionPane.showMessageDialog(null,resu, Tdst, JOptionPane.INFORMATION_MESSAGE);
        
        return resu;
    }
}