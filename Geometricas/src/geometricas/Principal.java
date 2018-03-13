/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricas;

import Dados.Circulo;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Principal extends JFrame{
   
    JButton btcirculo, btquadrado, bttriangulo, btretangulo;
    
    public Principal(){
    
        
    }
    
    public static void main (String[] args){
        
        
        
        Circulo circulo = new Circulo();
        String op = null;
        
        op = JOptionPane.showInputDialog("Opções: " + "\n" + "Circulo" + "\n" + "Retangulo" + "\n" + "Quadrado" + "\n" +"Triangulo");
        if(op.equals("Circulo") || op.equals("circulo")){
        
            //recebendo valores do circulo
            circulo.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do Circulo")));
            circulo.setCx(Double.parseDouble(JOptionPane.showInputDialog("Digite o x do primeiro ponto do Circulo")));
            circulo.setCy(Double.parseDouble(JOptionPane.showInputDialog("DIgite o Y do ponto do Circulo")));

        }
        if(op.equals("Rentangulo") || op.equals("retangulo")){
            //recebendo valores do retangulo
            
        }
        
        
        
      
        
 
        
    }
    
    
    
    
}
