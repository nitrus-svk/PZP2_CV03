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
public class Trojuholnik implements IZobrazitelny {
    private double strana;
    /*private double stranaB;
    private double stranaC;
    private double vA;*/

    public Trojuholnik(double strana/*, double stranaB, double stranaC, double vA*/) {
        this.strana = strana;
        /*this.stranaB = stranaB;
        this.stranaC = stranaC;
        this.vA = vA;*/
    }
    
    /*public double dajObsah() {return (stranaA + vA) / 2;}
    public double dajObvod() {return stranaA + stranaB + stranaC;}*/
    
    public void zobraz() {
        for (int i = 1; i <= strana; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i == 1) || (i == strana)) {
                    System.out.print("*");
                } else if ((j == 1) || (j == i)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(); // medzera medzi utvarmi
    }
}
