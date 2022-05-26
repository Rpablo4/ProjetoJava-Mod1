package projetoJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int nivel,dia=0,op,opMenu;
		
		ArrayList<Dia> arrayDia = new ArrayList<>();
		
		Dia dia1 = new Dia(1);
		Dia dia2 = new Dia(2);
		Dia dia3 = new Dia(3);
		Dia dia4 = new Dia(4);
		Dia dia5 = new Dia(5);
		Dia dia6 = new Dia(6);
		Dia dia7 = new Dia(7);
		Dia dia8 = new Dia(8);
		Dia dia9 = new Dia(9);
		Dia dia10 = new Dia(10);
		Dia dia11 = new Dia(11);
		Dia dia12 = new Dia(12);
		Dia dia13 = new Dia(13);
		Dia dia14 = new Dia(14);
		Dia dia15 = new Dia(15);
		Dia dia16 = new Dia(16);
		Dia dia17 = new Dia(17);
		Dia dia18 = new Dia(18);
		Dia dia19 = new Dia(19);
		Dia dia20 = new Dia(20);
		Dia dia21 = new Dia(21);
		Dia dia22 = new Dia(22);
		Dia dia23 = new Dia(23);
		Dia dia24 = new Dia(24);
		Dia dia25 = new Dia(25);
		Dia dia26 = new Dia(26);
		Dia dia27 = new Dia(27);
		Dia dia28 = new Dia(28);
		Dia dia29 = new Dia(29);
		Dia dia30 = new Dia(30);
		
		arrayDia.add(dia1);
		arrayDia.add(dia2);
		arrayDia.add(dia3);
		arrayDia.add(dia4);
		arrayDia.add(dia5);
		arrayDia.add(dia6);
		arrayDia.add(dia7);
		arrayDia.add(dia8);
		arrayDia.add(dia9);
		arrayDia.add(dia10);
		arrayDia.add(dia11);
		arrayDia.add(dia12);
		arrayDia.add(dia13);
		arrayDia.add(dia14);
		arrayDia.add(dia15);
		arrayDia.add(dia16);
		arrayDia.add(dia17);
		arrayDia.add(dia18);
		arrayDia.add(dia19);
		arrayDia.add(dia20);
		arrayDia.add(dia21);
		arrayDia.add(dia22);
		arrayDia.add(dia23);
		arrayDia.add(dia24);
		arrayDia.add(dia25);
		arrayDia.add(dia26);
		arrayDia.add(dia27);
		arrayDia.add(dia28);
		arrayDia.add(dia29);
		arrayDia.add(dia30);
		
		
		ArrayList<exercicios> listaExercicios = new ArrayList<>();
		
		// criando exercícios exercicio(nome, reps, series, comoFazer, tempoemsec)
		exercicios abdominalSupra = new exercicios("Abdominal supra", 0, 0,
				"https://www.youtube.com/watch?v=t4PBYd481nk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=13","Até finalizar",false,true,true);
		exercicios flexaoDeBraco = new exercicios("Flexão de Braço", 0, 0,
				"https://www.youtube.com/watch?v=F9FC_KBsLpY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=9", "Até finalizar",true, true, true);
		exercicios agachamentoSumo = new exercicios("Agachamento Sumô", 0, 0,
				"https://www.youtube.com/watch?v=mOtY705EJYg", "Até finalizar",true, false, true);
		exercicios ponte = new exercicios("Ponte", 0, 0,
				"https://www.youtube.com/watch?v=sQMmY9KOEQ0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=1", "30 segundos",false,true,true);
		exercicios agachamentoCadeira = new exercicios("Agachamento livre na cadeira", 0, 0,
				"https://www.youtube.com/watch?v=m-ewcuzzZS0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=2", "Até finalizar",false,true,true);
		exercicios tricepsBanco = new exercicios("Triceps no banco", 0, 0,
				"https://www.youtube.com/watch?v=4GbCPCHOPww&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=17", "Até finalizar", true, false, true);
		exercicios corridaEstacionaria = new exercicios("corridaEstacionaria", 0, 0,
				"https://www.youtube.com/watch?v=WShb8hw2kAY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=16", "Até finalizar",false, true, false);
		exercicios oGato = new exercicios("Mobilidade toraxica O Gato", 0, 0,
				"https://www.youtube.com/watch?v=comObBAaUjc&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=3", "Até finalizar",false, true, false);
		exercicios agachamentoIsometrico = new exercicios("Agachamento isometrico na parede", 0, 0,
				"https://www.youtube.com/watch?v=p1KsWs_SNjg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=4","Até finalizar",false, true, false);
		exercicios agachamentoSalto = new exercicios("Agachamento com salto", 0, 0,
				"https://www.youtube.com/watch?v=NVob_cJjJNg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=5", "Até finalizar",false,true,true);
		exercicios stiffUnilateral = new exercicios("stiffUnilateral", 00, 0,
				"https://www.youtube.com/watch?v=4u7g_TwDRLk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=6", "Até finalizar",true, false,false);
		exercicios escalador = new exercicios("Escalador", 00, 0,
				"https://www.youtube.com/watch?v=Eni-G2H-WUA&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=11", "Até finalizar",false, true, false);
		exercicios abdominalRemador = new exercicios("Abdominal Remador", 0, 0,
				"https://www.youtube.com/watch?v=Ss5h69C_GFM&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=12", "Até finalizar",false,true,true);
		exercicios polichinelos = new exercicios("Polichinelos", 0, 0,
				"https://www.youtube.com/watch?v=UcUfmsfrteQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=10", "Até finalizar",false, true, false);
		exercicios elevacaoPes = new exercicios("Elevacao na ponta dos pés", 0, 0,
				"https://www.youtube.com/watch?v=g6awN-xhqPk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=14", "Até finalizar",true, false, false);
		exercicios pulaCordas = new exercicios("Pula Cordas", 0, 0,
				"https://www.youtube.com/watch?v=sOTU-pIlkuQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=15", "Até finalizar",false, true, false);
		exercicios abdominalBicicleta = new exercicios("Abdominal Bicicleta", 0, 0,
				"https://www.youtube.com/watch?v=vdWV9CCMyx0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=18", "Até finalizar",false, true, false);
		
		//Adicionando exercicios no array
		listaExercicios.add(abdominalSupra);
		listaExercicios.add(flexaoDeBraco);
		listaExercicios.add(agachamentoSumo);
		listaExercicios.add(ponte);
		listaExercicios.add(agachamentoCadeira);
		listaExercicios.add(tricepsBanco);
		listaExercicios.add(corridaEstacionaria);
		listaExercicios.add(oGato);
		listaExercicios.add(agachamentoIsometrico);
		listaExercicios.add(agachamentoSalto);
		listaExercicios.add(stiffUnilateral);
		listaExercicios.add(escalador);
		listaExercicios.add(abdominalRemador);
		listaExercicios.add(polichinelos);
		listaExercicios.add(elevacaoPes);
		listaExercicios.add(pulaCordas);
		listaExercicios.add(abdominalBicicleta);
		
		
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

   
		

