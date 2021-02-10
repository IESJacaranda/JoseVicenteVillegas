import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		String cadena=("Jose Vicente Villegas 21 1999");
		System.out.println(palidrome(cadena));
		
	}
	
	public static boolean palidrome(String cad) {
		cad=cad.replace(" ", "").toLowerCase();
		String inverse = new StringBuilder(cad).reverse().toString();

		return inverse.equals(cad);
	}
}
