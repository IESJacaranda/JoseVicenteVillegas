package Ejercicio3;

import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Jarra jarras = new Jarra(7,9);

		int opcion;
		
		System.out.println("Introduce la opcion: "
				+ "1.Llenar jarra "
				+ "2.Vaciar jarra "
				+ "3.Volcar jarra A en B "
				+ "4.Volcar jarra B en A "
				+ "5.Ver estado de las jarras "
				+ "6.Salir");
		
		opcion = teclado.nextInt();
		
		do {
			switch(opcion) {
			case 1:
				System.out.println("¿Qué jarra desea llenar (A/B)?");
				
				String opcionJarra = teclado.nextLine();
				
				if(opcionJarra=="A") {
					System.out.println("Introduce la cantidad a introducir");
					int llenar=teclado.nextInt();
					jarras.setContenidoJarraA(llenar);
				}else if(opcionJarra=="B") {
					System.out.println("Introduce la cantidad a introducir");
					int llenar=teclado.nextInt();
					jarras.setContenidoJarraB(llenar);
				}
				
				break;
				
			case 2:
				System.out.println("¿Qué jarra desea vaciar (A/ B)?");
				opcionJarra = teclado.nextLine();
				
				if(opcionJarra=="A") {
					jarras.setContenidoJarraA(0);
				}else if(opcionJarra=="B") {
					jarras.setContenidoJarraB(0);
				}
				
				break;
				
			case 3:
				System.out.println(jarras.volcarJarraA_B());
				break;
				
			case 4:
				System.out.println(jarras.volcarJarraB_A());
				break;
				
			case 5:
				System.out.println(jarras.toString());
				break;
				
			case 6:
				System.out.println("");
				break;
			}
			
			System.out.println("Introduce la opcion: "
					+ "1.Llenar jarra "
					+ "2.Vaciar jarra "
					+ "3.Volcar jarra A en B "
					+ "4.Volcar jarra B en A "
					+ "5.Ver estado de las jarras "
					+ "6.Salir");
			opcion = teclado.nextInt();

		}while(opcion!=6);

		
	}

}
