/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

import ejemploscursojava.herencia.Coche;
import ejemploscursojava.herencia.Vehiculo;

/**
 *
 * @author japar
 */
public class VehiculosBarcenas {
    
    public static Vehiculo[] vehiculos={new Coche(5,"Audi",270,92000), new Coche(8,"Seat",220,37000), new Coche(4,"Toyota",230,85000)
        // Un coche por valor de 92.000 euros , velocidad maxima de 270 km/h
        // Un coche por valor de 37.000 euros, velocidad máxima 220 km/h
        // lo que se te ocurra, de todas maneras no sabremos nunca lo que robó...
    };
            
    
    public static void main(String[] args){
        
        double patrimonioTotal=0;
        for(Vehiculo v:vehiculos)
        {
            patrimonioTotal+=v.getPrecio();
        }
        System.out.println("Solo en vehiculos el patrimonio de Barcenas asciende a "+patrimonioTotal);
    }
}
