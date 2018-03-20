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
        System.out.print("Esses é o primeiro ponto: ");
        pRet1.getPoints();
        System.out.print("Esses é o segundo ponto: ");
        pRet2.getPoints();
        
    }
    public boolean isIn(Ponto analisado){
        double minX,minY,maxX,maxY;
        if(this.pRet1.getX()<this.pRet2.getX()){
            minX=this.pRet1.getX();
            maxX=this.pRet2.getX();
        }else{
            minX=this.pRet2.getX();
            maxX=this.pRet1.getX();
        }
        if(this.pRet1.getY()<this.pRet2.getY()){
            minY=this.pRet1.getY();
            maxY=this.pRet2.getY();
        }else{
            minY=this.pRet2.getY();
            maxY=this.pRet1.getY();
        }
        if(analisado.getX()<minX || analisado.getX()>maxX || analisado.getY()<minY || analisado.getY()>maxY){
            return false;
        }
        return true;
    }   
    
    public double Area(){
        return Math.abs(this.pRet1.getX()-this.pRet2.getX())*Math.abs(this.pRet1.getY()-this.pRet2.getY());
    }
     
    public double Perimetro(){
        return 2*Math.abs(this.pRet1.getX()-this.pRet2.getX())+2*Math.abs(this.pRet1.getY()-this.pRet2.getY());
    }
}
