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
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo myRetan =new Retangulo(2,3,4,5);
        myRetan.showPoints();
        Circulo myCirc = new Circulo(4,20,5);
        myCirc.showPoints();
        System.out.println(myCirc.showSinglePoint(20));
    }
    
}
