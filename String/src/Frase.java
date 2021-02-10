
public class Frase {

	private String cadena;
	
	public Frase(String cadena) {
		this.cadena = cadena;
	}


	public int contarPalabras() {
		int numPalabras = 0;
				
		this.cadena = this.cadena.trim();
		
		while(this.cadena != this.cadena.replace("  "," ")){
			this.cadena = this.cadena.replace("  ", " ");
		}
		
		for(int i=0; i<=this.cadena.length(); i++) {
			if(this.cadena.charAt(i)==' ') {
				numPalabras++;
			}
		}
		
		return numPalabras+1;
	}
}
