/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author davik
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------------Ponto---------------------------------------------");
        Ponto pontoAleatorio = new Ponto();
        double x,y;
        System.out.printls("Entrada de dados:");
        x=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x do ponto aleatório: "));
        y=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y do ponto aleatório: "));
        ponto.setPoints(x,y);
        System.out.println("--------------RETÂNGULO---------------------------------------------");
        System.out.println("Entrada de dados:");
        double x1Ret,y1Ret,x2Ret,y2Ret;
        x1Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe x1 do retângulo: "));
        y1Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe y1 do retângulo: "));
        x2Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe x2 do retângulo: "));
        y2Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe y2 do retângulo: "));
        Retangulo myRetan =new Retangulo(x1Ret,y1Ret,x2Ret,y2Ret);
        myRetan.showPoints();
        System.out.println("A área desse retângulo é: "+ myRetan.Area());
        System.out.println("O perimetro desse retângulo é: "+ myRetan.Perimetro());
        System.out.println("--------------CÍRCULO-----------------------------------------------");
        System.out.println("Entrada de de dados");
        double centroX,centroY,raio;
        centroX = Double.parseDouble(JOptionPane.showInputDialog("Informe o ponto x do centro: "));
        centroY = Double.parseDouble(JOptionPane.showInputDialog("Informe o ponto y do centro: "));
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do raio: ")); 
        Circulo myCirc = new Circulo(centroX,centroY,raio);
        myCirc.showPoints();
        myCirc.getRaio();
        double dist = myCirc.centro.distanciaEntrePontos(myRetan.pRet1);
        System.out.println(dist);
        
        
    }
    
}
