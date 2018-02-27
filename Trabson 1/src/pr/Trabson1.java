/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;


import Dados.Pontos;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class Trabson1 {

    
    public static void main(String[] args) {
        double raio;
		double x1;
		double y1;
		double x2;
		double y2;
		
		Pontos pontos = new Pontos();		
		
		//obtendo os dados
		
		 
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio por favor"));
		x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o x do ponto A"));
		y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y do ponto A"));	
                x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o x do ponto B"));
		y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o y do ponto B"));
		
		
		//chamando os resultados
		pontos.distancia(x1, y1, x2, y2, raio);
		
    }
    
}
