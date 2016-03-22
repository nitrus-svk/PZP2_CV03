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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*I2DGeometria objekty[] = new I2DGeometria[2];
        objekty[0] = new Stvorec(10);
        objekty[1] = new Kruh(8);
        
        for (I2DGeometria objekt: objekty) {
            System.out.println(objekt.dajObvod());
        }*/
        
        Obdlznik obdlznik1 = new Obdlznik(6, 5);
        Trojuholnik trojuholnik1 = new Trojuholnik(5);
        
        obdlznik1.zobraz();
        trojuholnik1.zobraz();
    }
    
}
