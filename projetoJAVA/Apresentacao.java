package projetoJAVA;
import java.util.Scanner;

public class Apresentacao {

	public void Apresentacao () throws InterruptedException {
		
		int op=0;
	
		Scanner leia = new Scanner (System.in);
		PulaLinhas pularLinhas = new PulaLinhas ();
		Usuario1 usuario1 = new Usuario1();
		
		System.out.println("\n\t\tTreinos Smart\n");
		System.out.println("\nAqui você terá vantagens como:\n");
		System.out.println("\n1ª Exercícios personalizados.");
		System.out.println("\n2ª Acompanhamento de seu desenvolvimento." );
		System.out.println("\n3ª Metas a serem alcançadas. ");
		System.out.println("\nVocê irá ver tudo isso e um pouco mais no TREINOS SMART." + 
		"\nnosso programa de controle e desenvolvimento de exercícios fisicos da melhor forma para você");
	
		System.out.println("\n1- Digite 1 para avançar");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			 pularLinhas.PulaLinhas();
		break;	
			 
		}
		
		//Primeiros dados
		usuario1.Usuario();
		
		System.out.println("\nAnalisando seus dados... ");
		Thread.sleep(1000);
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando...");
		Thread.sleep(1000);
		System.out.println("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nTodos seus dados foram analisados!!!");
		System.out.println("\n\t\tTenha um ótimo trino!!!");
		Thread.sleep(2000);
		pularLinhas.PulaLinhas();
	}

}
