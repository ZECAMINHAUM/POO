/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Lucas
 */
public class Circulo {
    
    public double area (double raio) {
		raio = Math.pow(raio, 2) * 3.14;
		return raio;
	}
	
	//calculo de perimetro
	public double perimetro (double raio) {
		raio = Math.pow(3.14, 2) * raio;
		return raio;
	}
    
}
