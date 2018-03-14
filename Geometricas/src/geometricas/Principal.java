/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author Lucas
 */
public class Principal extends JFrame {
   
    private JButton bt_circulo;
    private JButton bt_quadrado;
    private JButton bt_triangulo;
    private JButton bt_retangulo;
    private ButtonHandler handler;
    
    public Principal(){
        
       
        //Criando
        bt_circulo = new JButton("Circulo");
        bt_quadrado = new JButton("Quadrado");
        bt_retangulo = new JButton("Retangulo");
        bt_triangulo = new JButton("Triangulo");
        handler = new ButtonHandler(bt_circulo, bt_quadrado, bt_triangulo, bt_retangulo);
        
        //adicionando
        getContentPane().setLayout(new FlowLayout(FlowLayout.LEADING));
        getContentPane().add(bt_circulo, BorderLayout.SOUTH);
        getContentPane().add(bt_quadrado, BorderLayout.SOUTH);
        getContentPane().add(bt_retangulo, BorderLayout.SOUTH);
        getContentPane().add(bt_triangulo, BorderLayout.SOUTH);
        
        //botões funcionando
        bt_circulo.addActionListener(handler);
        bt_quadrado.addActionListener(handler);
        bt_retangulo.addActionListener(handler);
        bt_triangulo.addActionListener(handler);
        
    }
    
    public static void main (String[] args){
        
        Principal p = new Principal();
        p.setVisible(true);
        p.setTitle("Formas Geometricas");
        p.setDefaultCloseOperation(p.EXIT_ON_CLOSE);
        p.setSize(400, 75);
        
    }
    
}
