package ejemploscursojava.herencia;

public class Coche extends VehiculoTerrestre{
	private int pasajeros;
	private String marca;
	
	public Coche(int pasajeros, String marca, double velocidadMaxima, double precio) {
		super(velocidadMaxima, precio);
		this.pasajeros = pasajeros;
		this.marca = marca;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
