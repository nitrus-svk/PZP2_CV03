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
public class Sachovnica implements IZobrazitelny {
    private String[][] bloky = {
        {"░","▒","░","▒","░","▒","░","▒"},
        {"▒","░","▒","░","▒","░","▒","░"},
        {"░","▒","░","▒","░","▒","░","▒"},
        {"▒","░","▒","░","▒","░","▒","░"},
        {"░","▒","░","▒","░","▒","░","▒"},
        {"▒","░","▒","░","▒","░","▒","░"},
        {"░","▒","░","▒","░","▒","░","▒"},
        {"▒","░","▒","░","▒","░","▒","░"}
        };
    
    public Sachovnica() {
        
    }
    

    public void zobraz() {
        /*for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print("▒");
                    } else {
                        System.out.print("░");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print("░");
                    } else {
                        System.out.print("▒");
                    }
                }
            }
            System.out.println();
        }*/
        
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                System.out.print(bloky[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
