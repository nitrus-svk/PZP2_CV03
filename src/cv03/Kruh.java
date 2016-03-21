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
public class Kruh implements I2DGeometria {   
    private double polomer;

    public Kruh(double strana) {
        this.polomer = polomer;
    }

    public double dajObsah() {return 3.14 * polomer * polomer;}
    public double dajObvod() {return 2 * 3.14 * polomer;}
    
}
