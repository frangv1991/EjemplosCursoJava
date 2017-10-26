package ejemploscursojava;

public class Perro implements Mascota, Guardian {

	@Override
	public void serAmistoso() {
		System.out.println("Mover el rabo");
	}

	@Override
	public void jugar() {
		System.out.println("Tírame la pelota!");
	}

	@Override
	public void darAlerta() {
		System.out.println("Guau! Guau!");
	}

	@Override
	public void echar() {
		System.out.println("Grrrrrr");
	}
	
	public void pasear() throws KKException {
		serAmistoso();
		if(Math.random() < 0.1) {
			throw new KKException();
		}
	}

}
