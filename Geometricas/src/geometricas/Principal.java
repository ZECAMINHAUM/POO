/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricas;

import Dados.Circulo;
import javafx.geometry.Orientation;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class Principal extends JFrame{
   
    JButton bt_circulo, bt_quadrado, bt_triangulo, bt_retangulo;
    
    public Principal(){
        
        setTitle("Formas Geometricas");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        //Criando
        bt_circulo = new JButton("Circulo");
        bt_quadrado = new JButton("Quadrado");
        bt_retangulo = new JButton("Retangulo");
        bt_triangulo = new JButton("Triangulo");
        
        //adicionando
        getContentPane().add(bt_circulo);
        getContentPane().add(bt_quadrado);
        getContentPane().add(bt_retangulo);
        getContentPane().add(bt_triangulo);
        
        
    
        
    }
    
    public static void main (String[] args){
        
        new Principal().setVisible(true);
        
    }
    
    
    
    
}
