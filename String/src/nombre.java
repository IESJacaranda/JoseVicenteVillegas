import java.util.Scanner;

public class nombre {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nombre, nombre2;
		char cBuscado, cReenplazar;
		
		System.out.println("Introduce el nombre:");
		nombre = teclado.nextLine();
		
		System.out.println("Introduce el caracter a buscar");
		cBuscado = teclado.nextLine().charAt(0);
		
		System.out.println("Introduce el caracter a cambiar");
		cReenplazar = teclado.nextLine().charAt(0);

		nombre2 = nombre.replace(cBuscado, cReenplazar);
		
		System.out.println("Nombre cambiado "+nombre2);
		
		System.out.println("Nombre Mayuscula "+nombre.toUpperCase());

	}
}
