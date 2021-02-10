import java.util.Scanner;

public class Ejercicio6 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(buscarPalabra("shybaoxlna","hola"));
	}
	
	public static boolean buscarPalabra(String cadena, String buscar) {
		
		int indiceOculta=0;

		if(cadena.length()>=buscar.length()) {
			
			for (int i=0; i<cadena.length(); i++) {
				if(indiceOculta<buscar.length()
					&& cadena.charAt(i)==buscar.charAt(indiceOculta)) {
					indiceOculta++;
				}
			}
		}
		
		return indiceOculta == buscar.length();

	}
}
