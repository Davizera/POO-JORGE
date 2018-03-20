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
        System.out.println("Entrada de dados:");
        x=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de x do ponto aleatório: "));
        y=Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de y do ponto aleatório: "));
        pontoAleatorio.setPoints(x,y);
        System.out.println("--------------RETÂNGULO---------------------------------------------");
        System.out.println("Entrada de dados:");
        double x1Ret,y1Ret,x2Ret,y2Ret;
        x1Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe x1 do retângulo: "));
        y1Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe y1 do retângulo: "));
        x2Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe x2 do retângulo: "));
        y2Ret = Double.parseDouble(JOptionPane.showInputDialog("Informe y2 do retângulo: "));
        Retangulo myRetan =new Retangulo(x1Ret,y1Ret,x2Ret,y2Ret);
        if(myRetan.isIn(pontoAleatorio)){
            System.out.println("O ponto está dentro do retângulo");
        }else{
            System.out.println("O ponto está fora do retângulo");
        }
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
        if(myCirc.isIn(myCirc.centro.distanciaEntrePontos(pontoAleatorio))){
            System.out.println("O ponto aleatório está dentro do círculo");
        }else{
            System.out.println("O ponto aleatório não está dentro do círculo");
        }
        System.out.println("A área do círculo é: "+myCirc.Area());
        System.out.println("O perimetro do círculo é: "+myCirc.Perimetro());
        System.out.println("A distancia entre o ponto aleatório e o centro do círculo é: "+myCirc.centro.distanciaEntrePontos(pontoAleatorio));
        
        
    }
    
}
