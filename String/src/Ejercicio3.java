import java.util.Scanner;

public class Ejercicio3 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int num = upperCaseInString("Jose Vicente Villegas");
		System.out.println(num);
		
	}
	
	public static int upperCaseInString(String cad) {
		int count = 0;
		
		for (int i = 0; i < cad.length(); i++) {

		    // Comprobar las mayusculas.
		    if (Character.isUpperCase(cad.charAt(i))) {
		    	count++;
		    }

		}

		return count;
	}
	
}
