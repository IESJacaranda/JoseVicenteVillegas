import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int num = charactersInString("Jose Vicente Villegas", 'e');
		System.out.println(num);
		
	}
	
	public static int charactersInString(String cad, char letra) {
		int count = 0;
		for (int i=0; i<cad.length(); i++) {
			if(cad.charAt(i)== letra) {
				count++;
			}
		}

		return count;
	}

}
