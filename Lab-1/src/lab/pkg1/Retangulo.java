/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

/**
 *
 * @author davik
 */
public class Retangulo {
    
    Ponto pRet1= new Ponto();
    Ponto pRet2= new Ponto();

    public Retangulo(double x1, double y1,double x2, double y2){
        this.pRet1.setPoints(x1, y1);
        this.pRet2.setPoints(x2, y2);
    }
    
    public void showPoints(){
        System.out.print("Esses são os primeiros ponto: ");
        pRet1.getPoints();
        System.out.print("Esses são os segundo ponto: ");
        pRet2.getPoints();
        
    }
     
    
}
