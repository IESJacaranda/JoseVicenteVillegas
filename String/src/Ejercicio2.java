import java.util.Scanner;

public class Ejercicio2 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int num = lowCaseInString("Jose Vicente Villegas");
		System.out.println(num);
		
	}
	
	public static int lowCaseInString(String cad) {
		int count = 0;
		
		for (int i = 0; i < cad.length(); i++) {

		    // Comprobar las minusculas.
		    if (Character.isLowerCase(cad.charAt(i))) {
		    	count++;
		    }
		}

		return count;
	}
}
