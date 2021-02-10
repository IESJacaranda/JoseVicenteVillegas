import java.util.Scanner;

public class Ejercicio8 {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(contar("Computador"));
	}

	/**
	 * Vocales distintas dentro de una cadena de texto
	 * @param frase
	 * @return
	 */
	public static int contar(String frase) {

		frase = frase.toLowerCase();
		String vocalesDistintas = "";
		String vocales = "aeiou";
		
		for(int i=0; i<frase.length(); i++) {
			char c = vocales.charAt(i);
			if(vocalesDistintas.indexOf(c)<0 
					&& vocales.indexOf(c)>=0) {
				vocalesDistintas+=c;
				
			}
		}
				
		return vocalesDistintas.length();

	}
}
