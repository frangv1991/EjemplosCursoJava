/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

/**
 *
 * @author japar
 */
public class Alumno {

    private String nombre;
    private String nota;
    protected int chuleria;
    
    public Alumno(String nombre, String nota, int chuleria){
        this.nombre=nombre;
        this.nota=nota;
        this.chuleria=chuleria;     
    }
    
    public void fardar(){
        System.out.println("Mi nota es:"+ nota);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chuleria;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nota == null) ? 0 : nota.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (chuleria != other.chuleria)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nota == null) {
			if (other.nota != null)
				return false;
		} else if (!nota.equals(other.nota))
			return false;
		return true;
	}
   
}
