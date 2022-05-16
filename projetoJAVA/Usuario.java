package projetoJAVA;

import java.util.Scanner;

public class Usuario{


	public void Usuario() throws InterruptedException {
		
		String nome;
		String biotipo = null;
		int idade;
		float peso=0;
		float altura=0;
		float imc=0;
		int op=0;
		
		Scanner leia = new Scanner (System.in);
		PulaLinhas pularLinhas = new PulaLinhas ();
		
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.print("\nCarregando completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nAntes de começarmos nossos treinamentos precisamos de algumas informações: ");
		System.out.println("\nSeu Nome: ");
		nome = leia.next();
		System.out.println("\nSua idade: ");
		idade = leia.nextInt();
		Thread.sleep(1000);
		
		System.out.println("\nCarregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.print("\nCarregando completo!!!\n");
		Thread.sleep(2000);
		
		pularLinhas.PulaLinhas();
		
		//calculando o imc
		
		System.out.println("\nAgora vamos calcular seu IMC(ÍNDICE DE MASSA CORPORAL).");
		System.out.println("\nPor favor Preencha os campos abaixo:");
		System.out.println("\nSua Altura: ");
		altura = leia.nextFloat();
		System.out.println("\nSeu Peso: ");
		peso = leia.nextFloat();
		System.out.print("Calculando seu IMC...\n");
		Thread.sleep(1000);
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.println("\nCarregando completo!!!\n");
		Thread.sleep(2000);
	
		imc = peso/(altura*altura);
	
		System.out.printf("\nSeu IMC é: %.2f\n",imc);
		Thread.sleep(3000);
		
		pularLinhas.PulaLinhas();
		//Biotipo
		System.out.println("\nPara finalizar precisamos saber qual seu Biotipo(Escolha sua opção abaixo:)");
		System.out.println("\n1- Ectomorfo (Possui uma estrututa óssea pequena, peitoral reto, ombros pequenos e metabolismo acelerado)");
		System.out.println("\n2- Endomorfo (Possui facilidade para engordar, caixa toráxica e cintura larga)");
		System.out.println("\n3- Mesomorfo (Possui estrutura óssea grande, hipertrofia muscular e aparência esportiva)");
		op = leia.nextInt();
		
		switch(op) {
		
		case 1:
			biotipo = "Ectomorfo";
		break;
		case 2:
			biotipo = "Endomorfo";
		break;
		case 3:
			biotipo = "Mesomorfo";
		break;
		default:
			System.out.println("\nOpção Inválida!!!");
			
		}
		
		System.out.println("\n Seu biotipo é : "+biotipo);
		Thread.sleep(2000);

	}

}
