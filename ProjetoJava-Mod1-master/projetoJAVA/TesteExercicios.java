package projetoJAVA;

import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		
		// Adicionando exercícios exercicio(nome, reps, series, comoFazer, tempoemsec)
		exercicios abdominalSupra = new exercicios("Abdominal supra", 25, 2,"inserirLinkAqui", 0);
		exercicios flexaoDeBraco = new exercicios("Flexão de Braço", 12, 2,"inserirLinkAqui", 0);
		exercicios agachamentoSumo = new exercicios("Agachamento Sumô", 15, 2,"inserirLinkAqui", 0);
		exercicios ponte = new exercicios("Ponte", 0, 0,"inserirLinkAqui", 30);
		exercicios agachamentoCadeira = new exercicios("Agachamento livre na cadeira", 12, 2,"inserirLinkAqui", 0);
		exercicios tricepsBanco = new exercicios("Triceps no banco", 12, 2,"inserirLinkAqui", 30);
		exercicios corridaEstacionaria = new exercicios("corridaEstacionaria", 30, 2,"inserirLinkAqui", 0);
		exercicios oGato = new exercicios("Mobilidade toraxica O Gato", 0, 0,"inserirLinkAqui", 30);
		exercicios agachamentoIsometrico = new exercicios("Agachamento isometrico na parede", 0, 0,"inserirLinkAqui", 30);
		exercicios agachamentoSalto = new exercicios("Agachamento com salto", 15, 2,"inserirLinkAqui", 0);
		exercicios stiffUnilateral = new exercicios("stiffUnilateral", 15, 2,"inserirLinkAqui", 0);
		exercicios escalador = new exercicios("Escalador", 25, 2,"inserirLinkAqui", 0);
		exercicios abdominalRemador = new exercicios("Abdominal Remador", 20, 2,"inserirLinkAqui", 0);
		exercicios polichinelos = new exercicios("Polichinelos", 40, 1,"inserirLinkAqui", 0);
		exercicios elevacaoPes = new exercicios("Elevacao na ponta dos pés", 12, 3,"inserirLinkAqui", 0);
		exercicios pulaCordas = new exercicios("Pula Cordas", 20, 2,"inserirLinkAqui", 0);
		exercicios abdominalBicicleta = new exercicios("Abdominal Bicicleta", 15, 2,"inserirLinkAqui", 0);
		
		
		int nivel,dia=0,op;
			
		System.out.println("Bem vindo! Escolha o seu nível(1-Iniciante"
				+ " 2-Intermediário 3-Avançado): ");
		nivel=input.nextInt();
		
		switch(nivel) {
			case 1:
				break;
							
			case 2:
				abdominalSupra.setRepsSeries(25,2);
				flexaoDeBraco.setRepsSeries(25,2);
				agachamentoSumo.setRepsSeries(25,2);
				ponte.setRepsSeries(25,2);
				break;
				
			case 3:
				abdominalSupra.setRepsSeries(20,3);
				flexaoDeBraco.setRepsSeries(20,3);
				agachamentoSumo.setRepsSeries(20,3);
				ponte.setRepsSeries(20,3);
				break;
			}
		
		// Inicia o cronograma de treinos
		
		for(dia=0;dia<30;dia++) {
			System.out.println("\n\t\tDIA-"+dia+"\n\t\tLista de exercícios: ");
			abdominalSupra.imprimirInfo();
			flexaoDeBraco.imprimirInfo();
			agachamentoSumo.imprimirInfo();
			ponte.imprimirInfo();
			System.out.println("\nDigite 1 para marcar o dia "+dia+
					" como concluido ou qualquer outro numero para sair: ");
			op=input.nextInt();
			if(op==1) {
				System.out.println("\nPárabens! Você concluiu o dia"+dia+"!!!");
				abdominalSupra.aumentarRepsSeries(2,0);
				flexaoDeBraco.aumentarRepsSeries(2,0);
				agachamentoSumo.aumentarRepsSeries(2,0);
				ponte.aumentarRepsSeries(2,0);
			}
			else
				break;
		}
		
			
	}

}
