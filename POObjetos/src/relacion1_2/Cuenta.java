package relacion1_2;

public class Cuenta {

	private double saldo;
	private int numIngreso;
	private int numReintegro;
	
	public Cuenta() {}
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}

	public void hacerReintegro(double reintegro) {
		if(saldo>0 && saldo >=reintegro) {
			saldo = saldo-reintegro;
			numReintegro++;
			System.out.println("Reintegro realizado correctamente");
		}else {
			System.out.println("La operacion no se puede realizar");
		}
	}
	
	public void hacerIngreso(double ingreso) {
		if(ingreso>0) {
			saldo = saldo+ingreso;
			numIngreso++;
			System.out.println("Ingreso realizado correctamente");
		}else {
			System.out.println("La operacion no se puede realizar");
		}	
	}
	
	public String getStatus() {
		return "El saldo es"+this.saldo
				+", el numero de ingresos es "+ this.numIngreso
				+", el numero de reintegros es "+ this.numReintegro;
	}
	
	public String getSaldoFinal() {
		return "El saldo es "+this.getSaldoFinal();
	}
}
