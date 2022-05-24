package projetoJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		int nivel,dia=0,op,opMenu;
		
		ArrayList<exercicios> listaExercicios = new ArrayList<>();
		
		// criando exerc�cios exercicio(nome, reps, series, comoFazer, tempoemsec)
		exercicios abdominalSupra = new exercicios("Abdominal supra", 0, 0,
				"https://www.youtube.com/watch?v=t4PBYd481nk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=13","At� finalizar",false,true,true);
		exercicios flexaoDeBraco = new exercicios("Flex�o de Bra�o", 0, 0,
				"https://www.youtube.com/watch?v=F9FC_KBsLpY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=9", "At� finalizar",true, true, true);
		exercicios agachamentoSumo = new exercicios("Agachamento Sum�", 0, 0,
				"https://www.youtube.com/watch?v=mOtY705EJYg", "At� finalizar",true, false, true);
		exercicios ponte = new exercicios("Ponte", 0, 0,
				"https://www.youtube.com/watch?v=sQMmY9KOEQ0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=1", "30 segundos",false,true,true);
		exercicios agachamentoCadeira = new exercicios("Agachamento livre na cadeira", 0, 0,
				"https://www.youtube.com/watch?v=m-ewcuzzZS0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=2", "At� finalizar",false,true,true);
		exercicios tricepsBanco = new exercicios("Triceps no banco", 0, 0,
				"https://www.youtube.com/watch?v=4GbCPCHOPww&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=17", "At� finalizar", true, false, true);
		exercicios corridaEstacionaria = new exercicios("corridaEstacionaria", 0, 0,
				"https://www.youtube.com/watch?v=WShb8hw2kAY&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=16", "At� finalizar",false, true, false);
		exercicios oGato = new exercicios("Mobilidade toraxica O Gato", 0, 0,
				"https://www.youtube.com/watch?v=comObBAaUjc&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=3", "At� finalizar",false, true, false);
		exercicios agachamentoIsometrico = new exercicios("Agachamento isometrico na parede", 0, 0,
				"https://www.youtube.com/watch?v=p1KsWs_SNjg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=4","At� finalizar",false, true, false);
		exercicios agachamentoSalto = new exercicios("Agachamento com salto", 0, 0,
				"https://www.youtube.com/watch?v=NVob_cJjJNg&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=5", "At� finalizar",false,true,true);
		exercicios stiffUnilateral = new exercicios("stiffUnilateral", 00, 0,
				"https://www.youtube.com/watch?v=4u7g_TwDRLk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=6", "At� finalizar",true, false,false);
		exercicios escalador = new exercicios("Escalador", 00, 0,
				"https://www.youtube.com/watch?v=Eni-G2H-WUA&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=11", "At� finalizar",false, true, false);
		exercicios abdominalRemador = new exercicios("Abdominal Remador", 0, 0,
				"https://www.youtube.com/watch?v=Ss5h69C_GFM&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=12", "At� finalizar",false,true,true);
		exercicios polichinelos = new exercicios("Polichinelos", 0, 0,
				"https://www.youtube.com/watch?v=UcUfmsfrteQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=10", "At� finalizar",false, true, false);
		exercicios elevacaoPes = new exercicios("Elevacao na ponta dos p�s", 0, 0,
				"https://www.youtube.com/watch?v=g6awN-xhqPk&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=14", "At� finalizar",true, false, false);
		exercicios pulaCordas = new exercicios("Pula Cordas", 0, 0,
				"https://www.youtube.com/watch?v=sOTU-pIlkuQ&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=15", "At� finalizar",false, true, false);
		exercicios abdominalBicicleta = new exercicios("Abdominal Bicicleta", 0, 0,
				"https://www.youtube.com/watch?v=vdWV9CCMyx0&list=PLhoBLwYRAM7hgE3rJwivK_gEIjradx5v5&index=18", "At� finalizar",false, true, false);
		
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
		
		System.out.println("Bem vindo! Escolha o seu n�vel(1-Iniciante"
				+ " 2-Intermedi�rio 3-Avan�ado): ");
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
			
			
			for(dia=0;dia<=30;dia++) {
				System.out.println("\n\t\tDIA-"+dia+"\n\tFa�a os exerc�cios a seguir:");
				for(int i=0; i<listaExercicios.size(); i++) {
					if(listaExercicios.get(i).getGanharMassa()==true) {
						listaExercicios.get(i).imprimirInfo();
					}
				}
				System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op=input.nextInt();
				if(op==1)
					System.out.println("\n\nParab�ns, voc� concluiu o dia "+dia);
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
			break;
			
		case 2: //Perder peso
			for(dia=0;dia<=30;dia++) {
				System.out.println("\n\t\tDIA-"+dia+"\n\tFa�a os exerc�cios a seguir:");
				for(int i=0; i<listaExercicios.size(); i++) {
					if(listaExercicios.get(i).getQueimarGordura()==true) {
						listaExercicios.get(i).imprimirInfo();
					}
				}
				System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op=input.nextInt();
				if(op==1)
					System.out.println("\n\nParab�ns, voc� concluiu o dia "+dia);
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
			break;
		case 3:
			for(dia=0;dia<=30;dia++) {
				System.out.println("\n\t\tDIA-"+dia+"\n\tFa�a os exerc�cios a seguir:");
				for(int i=0; i<listaExercicios.size(); i++) {
					if(listaExercicios.get(i).getDefinirMusculatura()==true) {
						listaExercicios.get(i).imprimirInfo();
						if(listaExercicios.get(i).getReps()>30) {
							listaExercicios.get(i).setReps(15);
							listaExercicios.get(i).aumentarRepsSeries(0, 1);;
						}
					}
				}
				System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op=input.nextInt();
				if(op==1)
					System.out.println("\n\nParab�ns, voc� concluiu o dia "+dia);
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

   
		

