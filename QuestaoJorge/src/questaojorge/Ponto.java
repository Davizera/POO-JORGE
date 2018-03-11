/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questaojorge;

/**
 *
 * @author davik
 */
public class Ponto {
    private double x, y;
    
    public void setPoints(double x, double y){
        this.x=x;
        this.y=y;
    }
    public void getPoints(){
        System.out.println("O valor de X é " + this.x + ", o valor de Y é " + this.y);
    }
    
    public double distanciaEntrePontos(Ponto p2){
        double delta_x = Math.pow(this.x - p2.x, 2);
        double delta_y = Math.pow(this.y - p2.y, 2);
        return Math.sqrt(delta_x + delta_y);
    }
}
