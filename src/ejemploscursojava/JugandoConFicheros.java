package ejemploscursojava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JugandoConFicheros {

	public static void main(String[] args) {
		Path file = Paths.get("C:\\Users\\TIC\\Desktop\\prueba.txt");
		Path copia = Paths.get("C:\\Users\\TIC\\Desktop\\copia.txt");
		
		String line = null;
		Charset charset = Charset.forName("UTF-8");
		
		try (BufferedReader reader = Files.newBufferedReader(file, charset);
				PrintWriter writer = new PrintWriter(Files.newBufferedWriter(copia, charset))){
			
			line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				writer.println(line);
				line = reader.readLine();
			}
			
		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}
	}

}
