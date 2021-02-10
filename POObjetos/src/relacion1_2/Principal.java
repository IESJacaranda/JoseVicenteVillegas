package relacion1_2;

import java.util.Scanner;

public class Principal {

	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta(800);
		
		System.out.println("Introduce la opcion 1.Hacer un reintegro 2.Hacer un ingreso 3.Consultar el saldo y elnúmero de reintegros e ingresos realizados 4.Finalizar las operaciones");
		int opcion = teclado.nextInt();
		
		while(opcion != 4) {
			switch(opcion) {
				case 1:
					System.out.println("Introduce la cantidad a retirar.");
					double reintegro;
					reintegro = teclado.nextDouble();
					cuenta.hacerReintegro(reintegro);
					break;
					
				case 2:
					System.out.println("Introduce la cantidad a retirar.");
					double ingreso;
					ingreso = teclado.nextDouble();
					cuenta.hacerIngreso(ingreso);
					break;
		
				case 3:
					System.out.println(cuenta.getSaldoFinal());
					System.out.println(cuenta.getStatus());
					break;
					
				case 4:
					break;
					
			}
			System.out.println("Introduce la opcion 1.Hacer un reintegro 2.Hacer un ingreso 3.Consultar el saldo y elnúmero de reintegros e ingresos realizados 4.Finalizar las operaciones");
			opcion = teclado.nextInt();
		}
		


	}

}
