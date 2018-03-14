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
public class Triangulo {
    
    private double ABC;
    private double ACT;
    private double ABT;
    private double CTB;
    
    private double area ;
    private double perimetro ;
   
    
    public Triangulo(){
        
        area = 0;
        perimetro = 0;

    }
    
    public double Area(double x1, double x2, double x3, double y1, double y2, double y3){
        area = Math.abs(((x2 - x1)*(y3 - y1) - (x3 - x1) * (y2 - y1))/2);
        perimetro = (x1+x2+x3)+ (y1+y2+y3);
        return area;        
    }
    
    public void Perimetro (double x1, double x2, double x3, double y1, double y2, double y3){ 
       
        perimetro = (x1+x2+x3)+ (y1+y2+y3);
        JOptionPane.showMessageDialog(null, "O Perimentro é " + perimetro, 
                                     null, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public boolean tadentro(double x1, double x2, double x3, double x4, 
                            double y1, double y2, double y3, double y4){
        
        ABC = Area(x1, x2, x3, y1, y2, y3);
        ACT = Area(x1, x3, x4, y1, y3, y4);
        ABT = Area(x1, x2, x4, y1, y2, y4);
        CTB = Area(x3, x4, x2, y3, y4, y2);
        
        if(ABC == ACT+ABT+CTB){
            return true;
        }
        return false;
  
    }
   
}
    
  
    

