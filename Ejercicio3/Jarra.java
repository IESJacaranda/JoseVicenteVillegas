package Ejercicio3;

public class Jarra {

	private int capacidaJarraA;
	private int capacidaJarraB;
	private int contenidoJarraA;
	private int contenidoJarraB;

	
	public Jarra() {

	}
	
	public Jarra(int capacidaJarraA, int capacidaJarraB) {

		this.capacidaJarraA = capacidaJarraA;
		this.capacidaJarraB = capacidaJarraB;

	}

	
	public int getCapacidaJarraA() {
		return capacidaJarraA;
	}



	public void setCapacidaJarraA(int capacidaJarraA) {
		this.capacidaJarraA = capacidaJarraA;
	}



	public int getCapacidaJarraB() {
		return capacidaJarraB;
	}



	public void setCapacidaJarraB(int capacidaJarraB) {
		this.capacidaJarraB = capacidaJarraB;
	}



	public int getContenidoJarraA() {
		return contenidoJarraA;
	}



	public void setContenidoJarraA(int contenidoJarraA) {
		this.contenidoJarraA = contenidoJarraA;
	}



	public int getContenidoJarraB() {
		return contenidoJarraB;
	}



	public void setContenidoJarraB(int contenidoJarraB) {
		this.contenidoJarraB = contenidoJarraB;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacidaJarraA;
		result = prime * result + capacidaJarraB;
		result = prime * result + contenidoJarraA;
		result = prime * result + contenidoJarraB;
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
		Jarra other = (Jarra) obj;
		if (capacidaJarraA != other.capacidaJarraA)
			return false;
		if (capacidaJarraB != other.capacidaJarraB)
			return false;
		if (contenidoJarraA != other.contenidoJarraA)
			return false;
		if (contenidoJarraB != other.contenidoJarraB)
			return false;
		return true;
	}

	
	public int volcarJarraA_B() {
		int volcadoA;
		volcadoA =this.getContenidoJarraA()+this.getCapacidaJarraB();
		return volcadoA;
	}
	
	public int volcarJarraB_A() {
		int volcadoB;
		volcadoB = this.getContenidoJarraB()+this.getContenidoJarraA();
		return volcadoB;
	}


	@Override
	public String toString() {
		return "Jarra [capacidaJarraA=" + capacidaJarraA + ", capacidaJarraB=" + capacidaJarraB + ", contenidoJarraA="
				+ contenidoJarraA + ", contenidoJarraB=" + contenidoJarraB + "]";
	}



}
