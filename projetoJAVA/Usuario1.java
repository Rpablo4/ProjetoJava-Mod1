package projetoJAVA;

import java.util.Scanner;

public class Usuario1{


	public void Usuario() throws InterruptedException {
		
		String nome;
		String biotipo = null;
		int idade;
		float peso=0;
		float altura=0;
		float imc=0;
		
		int op=0;
		
		Scanner input = new Scanner (System.in);
		PulaLinhas pularLinhas = new PulaLinhas ();
		Usuarios usuario1 = new Usuarios("user","Adefinir",0,0,0,0);
		
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.print("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nAntes de começarmos nossos treinamentos precisamos de algumas informações: ");
		System.out.println("\nSeu Nome: ");
		nome = input.next();
		usuario1.setNome(nome);
		System.out.println("\nSua idade: ");
		idade = input.nextInt();
		usuario1.setIdade(idade);
		Thread.sleep(1000);
		
		System.out.println("\nCarregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.print("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		pularLinhas.PulaLinhas();
		
		//calculando o imc
		
		System.out.println("\nAgora vamos calcular seu IMC(ÍNDICE DE MASSA CORPORAL).");
		System.out.println("\nPor favor Preencha os campos abaixo:");
		System.out.println("\nSua Altura: ");
		altura = input.nextFloat();
		usuario1.setAltura(altura);
		System.out.println("\nSeu Peso: ");
		peso = input.nextFloat();
		usuario1.setPeso(peso);

		System.out.print("Calculando seu IMC...\n");
		Thread.sleep(1000);
		System.out.println("Carregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.println("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
	
		imc = peso/(altura*altura);
		usuario1.setImc(imc);
	
		System.out.printf("\nSeu IMC é: %.2f\n",imc);
		Thread.sleep(3000);
		
		pularLinhas.PulaLinhas();
		
		usuario1.perfilUsuario();
		Thread.sleep(1000);
		
		
		
	}

}
