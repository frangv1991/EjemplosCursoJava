package ejemploscursojava;

import java.util.ArrayList;
import java.util.List;

public class JugandoConMascotas {

	public static void main(String[] args) {
		/*
		Perro mutante = new Perro() {
			@Override
			public void darAlerta() {
				System.out.println("MIAUUU!!!");
			}
		};
		
		Perro[] mascotas = {new Perro(), new PerroSalchicha(), mutante};
		
		for(Perro angelito : mascotas) {
			angelito.pasear();
		}
		*/
		
		/*
		Caja<Mascota> perrera = new Caja<Mascota>();
		Perro chucho = new Perro();
		//perrera.set(chucho);
		
		Gato ficifur = new Gato();
		perrera.set(ficifur);
		
		Gato midifuchi = (Gato)perrera.get();
		midifuchi.jugar();
		*/
		
		List<Integer> lista = new ArrayList<>();
		lista.add(8);
		lista.add(7);
		lista.add(5);
		lista.add(7);
		
		for(Integer i:lista) {
			System.out.println(i);
		}
		
	}

}
