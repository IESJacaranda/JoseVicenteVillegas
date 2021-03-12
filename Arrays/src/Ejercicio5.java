import java.util.Scanner;

public class Ejercicio5 {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
        int[] Array1 = {01,10,20};
		
        System.out.println(rotar(Array1));
        
	}
	
	public static int[] rotar(int[] numeros) {
		  int primero = numeros[0];
	
		  int i;
		  
		  for(i= 0; i<numeros.length-1; i++) {
		    numeros[i] = numeros[i+1]; 
		  }
		  
		  numeros[i]= primero;
		  
		  return numeros;
		  
	}
}
