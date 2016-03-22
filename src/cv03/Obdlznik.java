/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv03;

/**
 *
 * @author Roman
 */
public class Obdlznik implements IZobrazitelny {
    private double stranaA;
    private double stranaB;

    public Obdlznik(double stranaA, double stranaB) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
    }
    
    public void zobraz() {
        for (int i = 1; i <= stranaB; i++) {
            for (int j = 1; j <= stranaA; j++) {
                if ((i == 1) || (i == stranaB)) {
                    System.out.print("*");
                } else if ((j == 1) || (j == stranaA)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();   // medzera medzi utvarmi
    }
}
