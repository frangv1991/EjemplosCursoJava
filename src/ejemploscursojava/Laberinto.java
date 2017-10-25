/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japar
 */
public class Laberinto {

    public static void main(String[] args) {
        String[] simbolos = {"\\", "/"};
        String tesoro="*";
        String usuario="o";
        Path path=Paths.get("c:/workspace/laberinto.txt");
        int tamanio=40;
        int xusuario=Math.random()>0.5?0:tamanio;
        int yusuario=(int) (Math.random()*(tamanio+1));
        int xtesoro=(int) (Math.random()*tamanio) +1;
        int ytesoro=(int) (Math.random()*tamanio) +1;
        try(PrintWriter out=new PrintWriter(
                    Files.newBufferedWriter(path, Charset.forName("UTF-8"), StandardOpenOption.CREATE,StandardOpenOption.WRITE))){
        
        for (int i=0;i<tamanio+1;i++) {            
            for (int j=0;j<tamanio+1;j++) {
                if(i==xusuario && j==yusuario)
                    out.print(usuario);
                else if(i==xtesoro  && j==ytesoro)
                    out.print(tesoro);
                else if(i==0 || i==tamanio)
                    out.print("_");
                else if(j==0 || j==tamanio)
                    out.print("|");
                else
                    out.print(generarSimboloAleatorio(simbolos));
            }
            out.println("");
        }
        } catch (IOException ex) {
            Logger.getLogger(Laberinto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public static String generarSimboloAleatorio(String[] simbolos) {
        return simbolos[(int) (Math.random() * simbolos.length)];
    }

}
