package projetoJAVA;

import java.util.Scanner;

public class Dicas {
	
	String dicas;
	int x;
	Scanner input = new Scanner(System.in);
	PulaLinhas espaco = new PulaLinhas();
	
	public void Dicas() {
		do {
			System.out.println("dicas do jãoAAAAAA\n************************");
			System.out.println("\n\tDigite 0 para sair");
			x = input.nextInt();
			
			espaco.PulaLinhas();
		} while(x!=0);
		
		
		
	}

	public String getDicas(String Dicas) {
		return dicas;
	}

	public void setDicas(String dicas) {
		this.dicas = dicas;
	}
	
	
}
