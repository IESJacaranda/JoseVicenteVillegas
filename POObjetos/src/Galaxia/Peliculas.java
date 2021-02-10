package Galaxia;

public class Peliculas {

	String nombrePelicula;
	int anyoEstreno;
	String personaje1;
	String personaje2;
	String personaje3;
	
	public Peliculas() {

	}

	public String getNombrePelicula() {
		return nombrePelicula;
	}

	public void setNombrePelicula(String nombrePelicula) {
		this.nombrePelicula = nombrePelicula;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	public String getPersonaje1() {
		return personaje1;
	}

	public void setPersonaje1(String personaje1) {
		this.personaje1 = personaje1;
	}

	public String getPersonaje2() {
		return personaje2;
	}

	public void setPersonaje2(String personaje2) {
		this.personaje2 = personaje2;
	}

	public String getPersonaje3() {
		return personaje3;
	}

	public void setPersonaje3(String personaje3) {
		this.personaje3 = personaje3;
	}
	
	public String compararFechaPelicula(int anyoEstreno) {
		return nombrePelicula;
		
	}

	@Override
	public String toString() {
		return "Nombre Pelicula" + nombrePelicula + ", anyo Estreno(" + anyoEstreno + ") , Personajes"
				+ personaje1 + ", " + personaje2 + ", " + personaje3;
	}
	
	
	

}
