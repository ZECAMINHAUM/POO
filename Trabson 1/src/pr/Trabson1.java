/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr;


import Dados.Circulo;
import Dados.Pontos;
import javax.swing.JOptionPane;
/**
 *
 * @author Lucas
 */
public class Trabson1 {
    
    
    
    public static void main(String[] args) {
        
        double resu;
        
        //chamando as classes
        Circulo circulo = new Circulo();
        Pontos p1 = new Pontos();
        Pontos p2 = new Pontos();
      
        
        //raio do Circulo
        circulo.setCirculo(Double.parseDouble(JOptionPane.showInputDialog("Qual o raio do circulo?")));
        
        //dados do primeiro ponto
        p1.setpontoX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do primeiro ponto")));
        p1.setpontoY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do primeiro ponto")));
        
        
        //dados do segundo ponto
        p2.setpontoX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do segundo ponto")));
        p2.setpontoY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do segundo ponto")));
        
        //resultado
        circulo.area(circulo.getCirculo());
        circulo.perimetro(circulo.getCirculo());
        resu = p1.distancia(p1, p2);
        
        if(resu < circulo.getCirculo()){
            JOptionPane.showMessageDialog(null,"O segundo Ponto está dentro do Circulo");
        }else{
            JOptionPane.showMessageDialog(null,"O segundo Ponto está fora do Circulo");

        }
        
         
      	
    }
    
}
