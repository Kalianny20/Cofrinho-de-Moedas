package uninter; 
import java.util.Scanner;

public class Menu {
	
	private Scanner entrada;
	private Cofrinho cofrinho;
	
	//Construtor
	public Menu() {
		entrada = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}

	public void exibirMenuPrincipal() {
		System.out.println("MENU:");
		System.out.println("1- ADICIONAR MOEDAS");
		System.out.println("2- REMOVER MOEDAS");
		System.out.println("3- LISTAR MOEDAS");
		System.out.println("4- CALCULAR O TOTAL EM REAL");
		System.out.println("0- SAIR");
		System.out.println("DIGITE SUA ESCOLHA:");
		
		String opcao = entrada.next();
		
		switch (opcao) {
		case "0": 
			System.out.println("Programa finalizado...");
			break;
		
		case "1": 
			System.out.println("Escolha uma moeda:");
	    	System.out.println("1 - Real");
	    	System.out.println("2 - Dolar");
	    	System.out.println("3 - Euro");
	    	
	    	int opcaoMoeda = entrada.nextInt();
	    	
	    	System.out.println("Digite o vaor:"); 
	    	
	    	String valorMoedaTexto = entrada.next();
	    	valorMoedaTexto = valorMoedaTexto.replace(",","."); 
	    	double valorMoeda = Double.parseDouble(valorMoedaTexto); 
	    	Moeda moeda = null;
	    	
	    	if (opcaoMoeda ==1 ) {
	    		moeda = new Real (valorMoeda);
	    		
	    	}
	    	
	    	else if (opcaoMoeda ==2) { 
	    		moeda = new Dolar (valorMoeda);
	    		
	    	}
	    	
	    	else if (opcaoMoeda == 3) { 
	    		moeda = new Euro (valorMoeda);
	    		
	    	}
	    	
	    	else { 
	    		System.out.println("Moeda Inexistente!");
		    	
	    	}
	    	
	    	cofrinho.adicionar(moeda);
	    	System.out.println("Moeda adicionada!");
			
	    	exibirMenuPrincipal();
	    	break;
	    	
		case "2":
			MenuRemoverMoedas(); 
			exibirMenuPrincipal();
			break;
			
        case "3":
        	cofrinho.listagemMoedas(); 
			exibirMenuPrincipal();
			break;
			
        case "4":
        	cofrinho.totalConvertido(); 
        	{
       	
        	 }
        	
        	exibirMenuPrincipal();
			break;
			
		default: 
			System.out.println("Opção inválida!");
			exibirMenuPrincipal();
			break;
			}
	}
	
   public void MenuRemoverMoedas() {
		
		cofrinho.listagemMoedas();  
		System.out.println("Escolha a moeda:");
		System.out.println("1-REAL");
		System.out.println("2-DOLAR");
		System.out.println("3-EURO");
		
		int ValorDeMoeda = entrada.nextInt(); 
		
		System.out.println("Digite o valor:");
		String ValorTexto = entrada.next();
		ValorTexto = ValorTexto.replace(",", "."); 
		double valor = Double.parseDouble(ValorTexto); 
		
		if (ValorDeMoeda == 1) {
			Real moeda = new Real(valor); 
			cofrinho.RemoverMoedas(moeda); 
			System.out.println("moeda removida!");
		} 
		
		else if (ValorDeMoeda == 2) {
			Dolar moeda = new Dolar(valor);  
			cofrinho.RemoverMoedas(moeda); 
			System.out.println("moeda removida!");
		}
		
		else if (ValorDeMoeda== 3) {
			Euro moeda = new Euro(valor); 
			cofrinho.RemoverMoedas(moeda); 
			System.out.println("moeda removida!");
		}
		
   }


}


		


