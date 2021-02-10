package relacion1_1;

public class main {

	public static void main(String[] args) {

		Rectangulo rec1 = new Rectangulo();
		
		rec1.setAncho(4.0);
		rec1.setLongitud(12.6);
		
		System.out.println(rec1.calcularArea());
		System.out.println(rec1.calcularPerimetro());
		
		
	}

}
