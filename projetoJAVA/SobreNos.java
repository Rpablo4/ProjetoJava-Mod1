package projetoJAVA;

import java.util.Scanner;

public class SobreNos {
	
	public void sobreNos() {
		
		PulaLinhas espaco = new PulaLinhas();
		Scanner input = new Scanner(System.in);
		int x;
		do {
			System.out.println("\t-Desenvolvedores do projeto: \n"
					+ "");
			System.out.println("Digite 0 para sair");
			x = input.nextInt();
			espaco.PulaLinhas();
		} while(x!=0);
		
	}

}
