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
public abstract class Vehiculo {
    protected double velocidadMaxima;
    protected double precio;

    public Vehiculo(double velocidadMaxima, double precio) {
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
    
}
