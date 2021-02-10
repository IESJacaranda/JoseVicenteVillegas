import java.util.Scanner;

public class Ejercicio4 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int num = numberInString("Jose Vicente Villegas 21 1999");
		System.out.println(num);
		
	}
	
	public static int numberInString(String cad) {
		int count = 0;
		
		for (int i = 0; i < cad.length(); i++) {

		    if (Character.isDigit(cad.charAt(i))) {
		    	count++;
		    }

		}

		return count;
	}
}
