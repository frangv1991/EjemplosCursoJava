package ejemploscursojava;

public class Gato implements Mascota {

	@Override
	public void serAmistoso() {
		System.out.println("MEAOW!!!");
	}

	@Override
	public void jugar() {
		System.out.println("Dame un ovillo de lana");
	}

}
