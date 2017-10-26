package ejercicio.prueba1;

public class EjercicioPrueba1 {

	public static void main(String[] args) {
		String [][] laberinto = generarLaberinto(20,10);
		
		for(int i=0;i<laberinto.length;i++) {
			for(int j=0;j<laberinto[0].length;j++) {
				System.out.print(laberinto[i][j]);
			}
		}
	}
	
	public static String[][] generarLaberinto(int alto, int ancho) {
		String[][] result = new String[alto][ancho];
		for(int i = 0;i<alto;i++) {
			for(int j = 0;j<ancho;j++) {
				if(i == 0 || i == alto-1) {
					result[i][j] = "_";
				}
				else if(i != 0 && i != (alto-1) && (j == 0 || j == (ancho - 1))) {
					result[i][j] = "|";
				}
				else {
					double valorInterior = Math.random();
					
					if(valorInterior <= 0.5) {
						result[i][j] = "/";
					}
					else {
						result[i][j] = "\\";
					}
				}
			}
			
			if(i == 0) {
				int entrada = (int)((Math.random()*ancho)+1);
				result[i][entrada] = "º";
			}
			
			result[i][ancho-1] += "\n";
		}
		
		int tesoroAncho = (int)((Math.random()*ancho)+1);
		int tesoroAlto = (int)((Math.random()*ancho)+1);
		
		if(tesoroAncho == 0)
			tesoroAncho++;
		else if(tesoroAncho == ancho-1)
			tesoroAncho--;
		
		if(tesoroAlto == 0)
			tesoroAlto++;
		else if(tesoroAlto == alto-1)
			tesoroAlto--;
		
		result[tesoroAlto][tesoroAncho] = "*";
		
		return result;
	}

}
