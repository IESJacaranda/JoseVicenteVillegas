package relacion1_4;

public class Principal {

	public static void main(String[] args) {

		Complejo n1 = new Complejo(9,5);
		Complejo n2 = new Complejo(7,8);

		System.out.print("Operación de SUMA de los números complejos: "+ n1
				+ " - "+n2 +" = ");
		n1.suma(n2);
		System.out.println(n1+"\n");

		System.out.print("Operación de RESTA de los números complejos: "+ n1 + " + "+ n2 + " = ");
		n1.resta(n2);
		System.out.println(n1+"\n");

		System.out.println("Operación de PRODUCTO de los números complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "* ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.producto(n2);
		System.out.println(n1+"\n");

		System.out.println("Operación de COCIENTE de los números complejos: ("+ n1.getParteReal()+"+("+n1.getParteImaginaria() +"i)) "
				+ "* ("+n2.getParteReal()+"+("+n2.getParteImaginaria()+"i))");
		n1.cociente(n2);
		System.out.println(n1+"\n");
		
	}

}
