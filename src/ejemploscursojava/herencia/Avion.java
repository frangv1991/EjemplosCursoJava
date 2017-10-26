/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.herencia;

/**
 *
 * @author japar
 */
public class Avion extends VehiculoAereo {
    protected int alas;

    public Avion(double alturaMaxima, double velocidadMaxima, int alas, double precio) {
        super(alturaMaxima, velocidadMaxima, precio);
        this.alas=alas;
    }

	@Override
	public String toString() {
		return "Avion [alas=" + alas + ", alturaMaxima=" + alturaMaxima + ", velocidadMaxima=" + velocidadMaxima + " precio="+precio+"]";
	}
	
	public static void main(String[] args) {
		Avion biplaza = new Avion(100,100,2, 100000.0);
		System.out.println(biplaza);
	}
    
}
