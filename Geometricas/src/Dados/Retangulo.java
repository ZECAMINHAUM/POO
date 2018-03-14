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
public class Retangulo {
    
    private double area ;
    private double perimetro ;
    private final String Tperimetro;
    private double minX;
    private double minY;
    private double maxX;
    private double maxY;

    public Retangulo() {
    
        Tperimetro = "Area e Perimetro";
        area = 0;
        perimetro = 0;
        minX = 0;
        minY = 0;
        maxX = 0;
        maxY = 0;

    }
    
    public void AreaPerimetro (double x1, double x2, double y1, double y2){
        area = Math.abs(x1-x2)*Math.abs(y1-y2);
        perimetro = 2*Math.abs(x1-x2)*2*Math.abs(y1-y2);
	JOptionPane.showMessageDialog(null, " Perimetro: " + perimetro +
                                            "\n" + " Area: " + area,
                                             Tperimetro , JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean tadentro (double x1, double x2, double y1, double y2, double px, double py){
   
	if (x1 < x2) {
		minX=x1;
		maxX=x2;
	}
       else {
		minX= x2;
		maxX= x1;
	}
	if (y1<y2) {
		minY=y1;
		maxY=y2;
	}
	else {
		minY=y2;
		maxY=y1;
	}
	if (px<minX || px>maxX || py<minY || py>maxY ) {
            return false;
	}else{
            return true;	
        }
    }
}