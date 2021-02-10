import java.util.Scanner;

public class Ejercicio7 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(reemplazar("hola jose como estas","jose","Ramon"));
	}
	
	/**
	 * 
	 * @param frase
	 * @param palabra
	 * @param nuevaPalabra
	 * @return
	 */
	public static String reemplazar(String frase, String palabra, String nuevaPalabra) {
	
		
		return frase.replace(palabra, nuevaPalabra);

	}
}
