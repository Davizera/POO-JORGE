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
public class Ponto {
    private double x,y;
    
    public void setPoints(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void getPoints(){
        System.out.println("O valor de x é "+ this.x +", o valor de y é "+ this.y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public double distanciaEntrePontos(Ponto p2){
        double delta_x = Math.pow(this.x - p2.getX(), 2);
        double delta_y = Math.pow(this.y - p2.getY(), 2);
        return Math.sqrt(delta_x + delta_y);
    }
        
    }
    

