package uninter; 

import java.util.ArrayList;

public class Cofrinho  {
	
	private ArrayList<Moeda> listaMoedas; 
	
	public Cofrinho() { 
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar (Moeda moeda) { 
		this.listaMoedas.add(moeda);
		
	}
	// Método
	public void listagemMoedas () { 
		if (this.listaMoedas.isEmpty()) {
			System.out.println("Não existe nenhuma moeda");
			return;
	
		}
	
	
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}


	
	public void RemoverMoedas(Moeda moeda) { 
	
		if (this.listaMoedas.isEmpty()) { 
			System.out.println("não tem moedas no cofrinho!");
		}
		
		else {
			this.listaMoedas.remove(moeda); 
		
		}
	}		
		
		public void totalConvertido() { 
			double total = 0;
			for (Moeda valor : listaMoedas) {
				total +=valor.converter();
			}
			System.out.println("Valor total em R$: " +String.format("%.2f", total));
			}
			
		
	}
	
	



