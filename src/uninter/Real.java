package uninter; 

public class Real extends Moeda { 

	public Real(double valorInicial) {
		this.valor = valorInicial;
	}


	public void info() {
		System.out.println("Real - " + valor); 
		
	}


	public double converter() {
		return this.valor * 1;

		
	}

}
