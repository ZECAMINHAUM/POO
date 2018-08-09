/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometricas;

import Dados.Circulo;
import Dados.Pontos;
import Dados.Quadrado;
import Dados.Retangulo;
import Dados.Triangulo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ButtonHandler implements ActionListener{
    
    private final JButton bt_circulo;
    private final JButton bt_quadrado;
    private final JButton bt_triangulo;
    private final JButton bt_retangulo;
    private final Pontos p1;
    private final Pontos p2;
    private final Pontos p3;
    private final Pontos p4;
    private boolean teste;
    private Double Resu;
    private final Circulo circ;
    private Retangulo ret;
    private Quadrado quad;
    private Triangulo tri;
 
    public ButtonHandler(JButton bt_circulo, JButton bt_quadrado, JButton bt_triangulo, JButton bt_retangulo){
        this.bt_circulo = bt_circulo;
        this.bt_quadrado = bt_quadrado;
        this.bt_retangulo = bt_retangulo;
        this.bt_triangulo = bt_triangulo;
        p1 = new Pontos();
        p2 = new Pontos();
        p3 = new Pontos();
        p4 = new Pontos();
        circ = new Circulo();
        
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
       
        if(evento.getSource() == bt_circulo){
            
            //dados do circulo
            circ.setRaio(Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio o raio do Circulo")));
            p1.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do ponto do centro ")));
            p1.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do ponto do centro")));
            
            //dados do ponto - circulo
            p2.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do segundo ponto")));
            p2.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do segundo ponto")));
            
            circ.AreaPerimetro(circ.getRaio());
            Resu = p1.distancia(p1, p2);
           
            if(Resu <= circ.getRaio()){
                JOptionPane.showMessageDialog(null,"O segundo Ponto está dentro do Circulo");
            }else{
                JOptionPane.showMessageDialog(null,"O segundo Ponto está fora do Circulo");
            }
        }
        if(evento.getSource() == bt_quadrado){
         
            //dados do quadrado
            p1.setX(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de lado do quadrado")));
            
            //dados do ponto - quadrado
            p3.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do ponto")));
            p3.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do ponto")));
            
            quad.AreaPerimetro(p1.getX());
            quad.tadentro(p1.getX(), p3.getX(), p3.getY());
            
        }
        if(evento.getSource() == bt_retangulo){
            
            //dados do retangulo
            p1.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro X do Retangulo")));
            p1.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Y do Retangulo")));
            p2.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo X do Retangulo")));
            p2.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Y do Retangulo")));
            
            //dados do ponto -retangulo
            p3.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do ponto")));
            p3.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do ponto")));
            
            
            ret.AreaPerimetro(p1.getX(),p2.getX() , p1.getY(), p2.getY());
            teste = ret.tadentro(p1.getX(),p2.getX() , p1.getY(), p2.getY(),p3.getX(), p3.getY());
            
            if(teste == true){
                JOptionPane.showMessageDialog(null, "O Ponto está dentro do Retangulo");
            }else{ 
                JOptionPane.showMessageDialog(null, "O Ponto está fora do Retangulo");
            }
        }
        if(evento.getSource() == bt_triangulo){
            
             //dados do retangulo
            p1.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro X do Triangulo")));
            p1.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Y do Triangulo")));
            p2.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo X do Triangulo")));
            p2.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo Y do Triangulo")));
            p3.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro X do Triangulo")));
            p3.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro Y do Triangulo")));
            
            //dados do ponto
            p4.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o X do ponto")));
            p4.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o Y do ponto")));
            
            Resu = tri.Area(p1.getX(), p2.getX(), p3.getX(), p1.getY(), p2.getY(), p3.getY());
            JOptionPane.showMessageDialog(null, "A area é: " + Resu, 
                                     null, JOptionPane.INFORMATION_MESSAGE);
            tri.Perimetro(p1.getX(), p2.getX(), p3.getX(), p1.getY(), p2.getY(), p3.getY());
            teste = tri.tadentro(p1.getX(), p2.getX(), p3.getX(),p4.getX(),
                                 p1.getY(), p2.getY(), p3.getY(), p4.getY());
            
            if(teste == true ){ 
                JOptionPane.showMessageDialog(null, "O Ponto está dentro do Retangulo");
            }else{ 
                JOptionPane.showMessageDialog(null, "O Ponto está fora do Retangulo");
            }
       
        }
    }
    
}
