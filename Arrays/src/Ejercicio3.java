import java.util.Scanner;

public class Ejercicio3 {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		int matriz[][],nFilas,nCol;
		
		System.out.println("Introduce las filas:");
		nFilas = teclado.nextInt();
		System.out.println("Introduce las columnas:");
		nCol = teclado.nextInt();
		
		matriz = new int[nFilas][nCol];
		
		for(int i=0; i<nFilas; i++) {
			int sumaFilas = 0;
			
			for(int j=0; j<nCol; j++) {
				sumaFilas += matriz[i][j];
			}
			
			System.out.println("La suma de las filas es"+sumaFilas);
		}
		
		for(int j=0; j<nCol; j++) {
			int sumaCol = 0;
			
			for(int i=0; i<nFilas; i++) {
				sumaCol += matriz[i][j];
			}
			
			System.out.println("La suma de las columnas es"+sumaCol);
		}
	}
	
}
