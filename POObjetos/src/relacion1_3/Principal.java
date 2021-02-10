package relacion1_3;

import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Maquina_Cafe maq1 = new Maquina_Cafe();
		maq1.setMonedero(70.0);
		
		System.out.println("Introduce la opcion 1.Servir café solo (1 euro) "
				+ " 2.Servir leche (0,8 euros) "
				+ "3.Servir café con leche (1,5 euros)"
				+ "4.Consultar estado máquina. Aparecen los datos de los depósitos y del monedero"
				+ "5.Apagar máquina y salir");
		int opcion = teclado.nextInt();
		
		while(opcion != 5) {
			switch(opcion) {
				case 1:
					System.out.println("Cafe servido.");
					double costo=1.0;
					maq1.servirCafe(costo);
					break;
					
				case 2:
					System.out.println("Leche servida.");
					costo=0.8;
					maq1.servirLeche(costo);
					break;
		
				case 3:
					System.out.println("Cafe con Leche servido.");
					costo=1.5;
					maq1.servirCafeconLeche();
					break;
					
				case 4:
					System.out.println(maq1.toString());
					break;
					
				case 5:
					System.out.println("Apagar y salir");
					break;		
			}
			
			System.out.println("Introduce la opcion 1.Hacer un reintegro 2.Hacer un ingreso 3.Consultar el saldo y elnúmero de reintegros e ingresos realizados 4.Finalizar las operaciones");
			opcion = teclado.nextInt();
		}
	}

}
