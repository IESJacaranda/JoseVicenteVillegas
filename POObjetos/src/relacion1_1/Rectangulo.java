package relacion1_1;

public class Rectangulo {

	private double longitud = 1.0;
	private double ancho = 1;
	
	public double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(double longitud) {
		if(longitud>0 && longitud<20) {
			this.longitud = longitud;
		}
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		if(ancho>0 && ancho<20) {
			this.ancho = ancho;
		}
	}
	
	public double calcularArea() {
		return this.ancho*this.longitud;
	}
	
	public double calcularPerimetro() {
		return 2*(ancho+longitud);
	}
}
