package uninter;

public class Euro extends Moeda {
	
	
			public Euro (double valor) {
				this.valor = valor;
			}

		
		public void info() {
			
			System.out.println("Euro - " + valor); 

		}


		public double converter() {
			return this.valor * 5.6;
		}
			

}
