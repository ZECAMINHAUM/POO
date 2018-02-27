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
public class Pontos extends Circulo{
    
    double raio;
   
    
    public void distancia (double x1, double y1, double x2, double y2, double raio) {
		double resu, varea, vperimetro  ;
		
		//chamando calculo de area
		varea = area(raio);
		
		//chamando calculo de perimetro
		vperimetro = perimetro(raio);
		
		x1 = x1 - x2;
		y1 = y1 - y2;
		resu = Math.pow(x1, 2) + Math.pow(y1, 2);
		resu = Math.sqrt(resu);
		
		if(resu > raio) {
		JOptionPane.showMessageDialog(null, "Area: "+ varea + "\n" + 
									"Perimetro: " + vperimetro + "\n" +
									"A distancia é de: " + resu + "\n" +
									"O ponto B está fora do circulo");
		}else {
			JOptionPane.showMessageDialog(null, "Area: "+ varea + "\n" + 
										"Perimetro: " + vperimetro + "\n" +
										"A distancia é de: " + resu + "\n" +
										"O ponto B está dentro do circulo");
		}
	}
    
    
}
