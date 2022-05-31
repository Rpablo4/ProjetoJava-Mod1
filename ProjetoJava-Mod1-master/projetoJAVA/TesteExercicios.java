package projetoJAVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int nivel,dia=0,op,opMenu;
		
		List<Dia> arrayDia = Arrays.asList(
				new Dia(1),
				new Dia(2),
				new Dia(3),
				new Dia(4),
				new Dia(5),
				new Dia(6),
				new Dia(7),
				new Dia(8),
				new Dia(9),
				new Dia(10),
				new Dia(11),
				new Dia(12),
				new Dia(13),
				new Dia(14),
				new Dia(15),
				new Dia(16),
				new Dia(17),
				new Dia(18),
				new Dia(19),
				new Dia(20),
				new Dia(21),
				new Dia(22),
				new Dia(23),
				new Dia(24),
				new Dia(25),
				new Dia(26),
				new Dia(27),
				new Dia(28),
				new Dia(29),
				new Dia(30)
				);
		
		
		//Adicionando exercicios no array
		List<exercicios> listaExercicios = Arrays.asList(
				// criando exercícios exercicio(nome, reps, series, comoFazer, tempoemsec)
				new exercicios("Abdominal supra", 0, 0,
						"https://www.youtube.com/watch?v=t4PBYd481nk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=13","Até finalizar",false,true,true),
				new exercicios("Flexão de Braço", 0, 0,
						"https://www.youtube.com/watch?v=F9FC_KBsLpY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=9", "Até finalizar",true, true, true),
				new exercicios("Agachamento Sumô", 0, 0,
						"https://www.youtube.com/watch?v=mOtY705EJYg", "Até finalizar",true, false, true),
				new exercicios("Ponte", 0, 0,
						"https://www.youtube.com/watch?v=sQMmY9KOEQ0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=1", "30 segundos",false,true,true),
				new exercicios("Agachamento livre na cadeira", 0, 0,
						"https://www.youtube.com/watch?v=m-ewcuzzZS0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=2", "Até finalizar",false,true,true),
				new exercicios("Triceps no banco", 0, 0,
						"https://www.youtube.com/watch?v=4GbCPCHOPww&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=17", "Até finalizar", true, false, true),
				new exercicios("corridaEstacionaria", 0, 0,
						"https://www.youtube.com/watch?v=WShb8hw2kAY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=16", "Até finalizar",false, true, false),
				new exercicios("Mobilidade toraxica O Gato", 0, 0,
						"https://www.youtube.com/watch?v=comObBAaUjc&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=3", "Até finalizar",false, true, false),
				new exercicios("Agachamento isometrico na parede", 0, 0,
						"https://www.youtube.com/watch?v=p1KsWs_SNjg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=4","Até finalizar",false, true, false),
				new exercicios("Agachamento com salto", 0, 0,
						"https://www.youtube.com/watch?v=NVob_cJjJNg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=5", "Até finalizar",false,true,true),
				new exercicios("stiffUnilateral", 00, 0,
						"https://www.youtube.com/watch?v=4u7g_TwDRLk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=6", "Até finalizar",true, false,false),
				new exercicios("Escalador", 00, 0,
						"https://www.youtube.com/watch?v=Eni-G2H-WUA&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=11", "Até finalizar",false, true, false),
				new exercicios("Abdominal Remador", 0, 0,
						"https://www.youtube.com/watch?v=Ss5h69C_GFM&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=12", "Até finalizar",false,true,true),
				new exercicios("Polichinelos", 0, 0,
						"https://www.youtube.com/watch?v=UcUfmsfrteQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=10", "Até finalizar",false, true, false),
				new exercicios("Elevacao na ponta dos pés", 0, 0,
						"https://www.youtube.com/watch?v=g6awN-xhqPk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=14", "Até finalizar",true, false, false),
				new exercicios("Pula Cordas", 0, 0,
						"https://www.youtube.com/watch?v=sOTU-pIlkuQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=15", "Até finalizar",false, true, false),
				new exercicios("Abdominal Bicicleta", 0, 0,
						"https://www.youtube.com/watch?v=vdWV9CCMyx0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=18", "Até finalizar",false, true, false)
				);
		
		
		System.out.println("\nEscolha uma jornada de acordo com sua meta:\n1-Ganhar massa magra/muscular\n"
				+ "2-Perder peso\n3-Definir a musculatura\n ");
		opMenu=input.nextInt();
		
		System.out.println("Bem vindo! Escolha o seu nível(1-Iniciante"
				+ " 2-Intermediário 3-Avançado): ");
		nivel=input.nextInt();
		
		switch(nivel) {
		case 1:
			for(int i=0; i<listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(12, 2);
			}
			break;
						
		case 2:
			for(int i=0; i<listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(12, 3);
			}
			break;
			
		case 3:
			for(int i=0; i<listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(20, 2);
			}
			break;
		default:
			break;
		}
		
		switch(opMenu) {
		case 1: //Ganhar massa magra/muscular
			
			
			for(int c=0; c<arrayDia.size();c++) {
				if(arrayDia.get(c).isConcluido()) {
					
				}
				else {
					System.out.println("\n\t\tDIA-"+dia+"\n\tFaça os exercícios a seguir:");
					for(int i=0; i<listaExercicios.size(); i++) {
						if(listaExercicios.get(i).getGanharMassa()==true) {
							listaExercicios.get(i).imprimirInfo();
						}
					}
					System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
					op=input.nextInt();
					if(op==1)
						System.out.println("\n\nParabéns, você concluiu o dia "+dia);
					else
						break;
					if((dia%2)==0) {
						for(int i=0; i<listaExercicios.size(); i++) {
							if(listaExercicios.get(i).getNomeDoExercicio()!="Ponte") {
								listaExercicios.get(i).aumentarRepsSeries(3, 0);
								if(listaExercicios.get(i).getReps()>30) {
									listaExercicios.get(i).setReps(15);
									listaExercicios.get(i).aumentarRepsSeries(0, 1);
									arrayDia.get(c).setConcluido(true);
								}
							}
							else
								listaExercicios.get(i).aumentarTempo(15);
								arrayDia.get(c).setConcluido(true);
						}
					}
						
				}
			}
			break;
			
		case 2: //Perder peso
			for(int c=0; c<arrayDia.size();c++) {
				if(arrayDia.get(c).isConcluido()) {
					
				}
				else {
					System.out.println("\n\t\tDIA-"+dia+"\n\tFaça os exercícios a seguir:");
					for(int i=0; i<listaExercicios.size(); i++) {
						if(listaExercicios.get(i).getQueimarGordura()==true) {
							listaExercicios.get(i).imprimirInfo();
						}
					}
					System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
					op=input.nextInt();
					if(op==1)
						System.out.println("\n\nParabéns, você concluiu o dia "+dia);
					else
						break;
					if((dia%2)==0) {
						for(int i=0; i<listaExercicios.size(); i++) {
							if(listaExercicios.get(i).getNomeDoExercicio()!="Ponte") {
								listaExercicios.get(i).aumentarRepsSeries(3, 0);
								if(listaExercicios.get(i).getReps()>30) {
									listaExercicios.get(i).setReps(15);
									listaExercicios.get(i).aumentarRepsSeries(0, 1);
								}
							}
							else
								listaExercicios.get(i).aumentarTempo(15);
						}
					}
				}
			}
			break;
		case 3:
			for(int c=0; c<arrayDia.size();c++) {
				if(arrayDia.get(c).isConcluido()) {
					
				}
				else {
					System.out.println("\n\t\tDIA-"+dia+"\n\tFaça os exercícios a seguir:");
					for(int i=0; i<listaExercicios.size(); i++) {
						if(listaExercicios.get(i).getDefinirMusculatura()==true) {
							listaExercicios.get(i).imprimirInfo();
							if(listaExercicios.get(i).getReps()>30) {
								listaExercicios.get(i).setReps(15);
								listaExercicios.get(i).aumentarRepsSeries(0, 1);;
							}
						}
					}
					System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
					op=input.nextInt();
					if(op==1)
						System.out.println("\n\nParabéns, você concluiu o dia "+dia);
					else
						break;
					if((dia%2)==0) {
						for(int i=0; i<listaExercicios.size(); i++) {
							if(listaExercicios.get(i).getNomeDoExercicio()!="Ponte") {
								listaExercicios.get(i).aumentarRepsSeries(3, 0);
								if(listaExercicios.get(i).getReps()>30) {
									listaExercicios.get(i).setReps(15);
									listaExercicios.get(i).aumentarRepsSeries(0, 1);
								}
							}
							else
								listaExercicios.get(i).aumentarTempo(15);
						}
					}
				}	
			}
		}

	}

}

   
		

