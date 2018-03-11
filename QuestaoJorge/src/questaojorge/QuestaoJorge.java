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
public class QuestaoJorge {

    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p3 = new Ponto();
        Circulo c1 = new Circulo();
        double dist;
        p1.setPoints(2,2);
        p3.setPoints(0,0);
        p1.getPoints();
        p3.getPoints();
        dist = p1.distanciaEntrePontos(p3);
        System.out.println("A distância é "+ dist);
        c1.setRaio(3);
        c1.getRaio();
        if(c1.isIn(dist)){
            System.out.println("O ponto está dentro do circulo!");
        }else{
            System.out.println("O ponto não está dentro do circulo!");
        }
    }
    
}
