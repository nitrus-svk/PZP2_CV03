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
public class Stvorec implements I2DGeometria{
    private double strana;

    public Stvorec(double strana) {
        this.strana = strana;
    }  
    
    public double dajObsah() {return strana*strana;}
    public double dajObvod() {return 4*strana;}
}
