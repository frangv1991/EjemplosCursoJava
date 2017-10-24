/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

/**
 *
 * @author japar
 */
public class Laberinto {

    public static void main(String[] args) {
        String[] simbolos = {"/", "\\"};
        int tamanio=40;
        for (int i=0;i<tamanio;i++) {
            for (int j=0;j<tamanio;j++) {
                System.out.print(generarSimboloAleatorio(simbolos));
            }
            System.out.println("");
        }
    }

    public static String generarSimboloAleatorio(String[] simbolos) {
        return simbolos[(int) (Math.random() * simbolos.length)];
    }

}
