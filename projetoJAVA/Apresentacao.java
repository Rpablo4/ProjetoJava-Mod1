package projetoJAVA;
import java.util.Scanner;

public class Apresentacao {

	public void Apresentacao () throws InterruptedException {
		
		int op=0;
	
		Scanner leia = new Scanner (System.in);
		PulaLinhas pularLinhas = new PulaLinhas ();
		Usuario usuario = new Usuario();
		
		System.out.println("\n\t\tTreinos Smart\n");
		System.out.println("\nAqui voc� ter� vantagens como:\n");
		System.out.println("\n1� Exerc�cios personalizados.");
		System.out.println("\n2� Acompanhamento de seu desenvolvimento." );
		System.out.println("\n3� Metas a serem alcan�adas. ");
		System.out.println("\nVoc� ir� ver tudo isso e um pouco mais no TREINOS SMART." + 
		"\nnosso programa de controle e desenvolvimento de exerc�cios fisicos da melhor forma para voc�");
	
		System.out.println("\n1- Digite 1 para avan�ar");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			 pularLinhas.PulaLinhas();
		break;	
			 
		}
		
		//Primeiros dados
		usuario.Usuario();
		
		System.out.println("\nAnalisando seus dados... ");
		Thread.sleep(1000);
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando...");
		Thread.sleep(1000);
		System.out.println("\nCarregando completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nTodos seus dados foram analisados!!!");
		System.out.println("\n\t\tTenha um �timo trino!!!");
		Thread.sleep(2000);
	}

}
