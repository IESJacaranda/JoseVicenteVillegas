package relacion1_3;

public class Maquina_Cafe {

	private int Deposito_Cafe;
	private int Deposito_Leche;
	private int Deposito_Vasos;
	private double monedero;	
	
	public final static double precioCafe=1.0;
	public final static double precioLeche=0.8;
	public final static double precioCafeConLeche=1.5;

	
	public Maquina_Cafe() {
		this.Deposito_Cafe = 50;
		this.Deposito_Leche = 50;
		this.Deposito_Vasos = 80;
		this.monedero = 50.0;
	}


	public int getDeposito_Cafe() {
		return Deposito_Cafe;
	}


	public void setDeposito_Cafe(int deposito_Cafe) {
		Deposito_Cafe = deposito_Cafe;
	}


	public int getDeposito_Leche() {
		return Deposito_Leche;
	}


	public void setDeposito_Leche(int deposito_Leche) {
		Deposito_Leche = deposito_Leche;
	}


	public int getDeposito_Vasos() {
		return Deposito_Vasos;
	}


	public void setDeposito_Vasos(int deposito_Vasos) {
		Deposito_Vasos = deposito_Vasos;
	}


	public double getMonedero() {
		return monedero;
	}


	public void setMonedero(double monedero) {
		this.monedero = monedero;
	}

	
	public double servirCafe(double precioCafe) {
		monedero = monedero-precioCafe;
		Deposito_Cafe--;
		return monedero;
	}
	
	public double servirLeche(double precioLeche) {
		monedero = monedero-precioLeche;
		Deposito_Cafe--;
		return monedero;
	}
	
	public void servirCafeconLeche() {
		if(this.Deposito_Cafe>0 && this.Deposito_Leche>0 && this.Deposito_Vasos>0) {
			this.Deposito_Cafe--;
			this.Deposito_Cafe--;
			this.Deposito_Cafe--;
			monedero = monedero-precioCafeConLeche;
			Deposito_Cafe--;

		}else {
			System.out.println("No hay un elemento en la maquina");
		}


	}
	
	public void vaciarMonedero() {
		this.monedero=0;
	}
	
	public void llenarDemositos() {
		this.Deposito_Cafe = 50;
		this.Deposito_Leche = 50;
		this.Deposito_Vasos = 80;
	}


	@Override
	public String toString() {
		return "Las existencias de cafe son:" + Deposito_Cafe + ", Las existencias de leche son:" + Deposito_Leche
				+ ", Las existencias de vasos son:" + Deposito_Vasos + ", Queda este dinero en la maquina:" + monedero + "]";
	}
	
}
