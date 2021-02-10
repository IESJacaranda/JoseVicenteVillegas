package Galaxia;

public class Personajes {

	String nombre;
	int capDestruccion;
	String primeraPelicula;
	double estatura;
	String especie;
	double peso;
	
	public Personajes() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapDestruccion() {
		return capDestruccion;
	}

	public void setCapDestruccion(int capDestruccion) throws Exception {
		if(capDestruccion <=0 && capDestruccion >=100) {
			throw new Exception("Numero nmo valido");
		}else {
			this.capDestruccion = capDestruccion;
		}
	}

	public String getPrimeraPelicula() {
		return primeraPelicula;
	}

	public void setPrimeraPelicula(String primeraPelicula) {
		this.primeraPelicula = primeraPelicula;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	public int mostrarNivelPoder() {
		
		return this.getCapDestruccion();
		
	}
	
	@Override
	public String toString() {
		return "Personajes [nombre=" + nombre + ", capDestruccion=" + capDestruccion + ", primeraPelicula="
				+ primeraPelicula + ", estatura=" + estatura + ", especie=" + especie + ", peso=" + peso;
	}
	
	
	
	
}
