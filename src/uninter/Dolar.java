package uninter;

public class Dolar extends Moeda { 
	
	
		public Dolar (double valor) {
			this.valor = valor;
		}

	
	public void info() {
		
		System.out.println("Dolar - " + valor); 
	}

	
	public double converter() {
		return this.valor * 5.4;
	}
	

}
