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
public class Circulo {
    private double raio;
    
    public void setRaio(double raio){
        this.raio=raio;
    }
    public void getRaio(){
        System.out.println("o raio desse círculo é " + this.raio);
    }
    public double calculaArea(){
        return Math.PI*Math.pow(this.raio, 2);
    }
    
    public double calculaPerimetro(){
        return 2*Math.PI*this.raio;
    }
    
    public boolean isIn(double distancia){
        if(distancia>this.raio){
            return false;
        }
        return true;
    }
}
