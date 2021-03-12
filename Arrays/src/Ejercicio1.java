import java.util.Scanner;

public class Ejercicio1 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int tam2 = 0;
		int tam1 = 0;
		int [][] matriz = new int [tam1] [tam2];
		
		System.out.println("Introduce el valor");
		int valor = teclado.nextInt();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				matriz[i][j]=valor;
			}
		}
		
		for(int i=0; i<matriz.length; i++) {

			System.out.println(matriz[valor]);
			
		}
		
	}

}
