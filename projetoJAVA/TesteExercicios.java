package projetoJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteExercicios {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int nivel, dia = 0, op, opMenu;

		ArrayList<exercicios> listaExercicios = new ArrayList<>();

		// criando exercícios exercicio(nome, reps, series, comoFazer, tempoemsec)

		exercicios abdominalSupra = new exercicios("Abdominal supra", 0, 0, " https://youtu.be/t4PBYd481nk ", 0, 0, 1,
				1);
		exercicios flexaoDeBraco = new exercicios("Flexão de Braço", 0, 0, " https://youtu.be/lkvSelJ0tQ8", 0, 1, 1, 1);
		exercicios agachamentoSumo = new exercicios("Agachamento Sumô", 0, 0, " https://youtu.be/XypoxVWr0zs ", 0, 1, 0,
				1);
		exercicios ponte = new exercicios("Ponte", 0, 0, " https://youtu.be/7mcMQiy-MWQ ", 0, 0, 1, 1);
		exercicios agachamentoCadeira = new exercicios("Agachamento livre na cadeira", 0, 0,
				" https://youtu.be/5HgLKPl4Wx4 ", 0, 0, 1, 1);
		exercicios tricepsBanco = new exercicios("Triceps no banco", 0, 0, " https://youtu.be/GM21qkns-Ao  ", 0, 1, 0,
				1);
		exercicios corridaEstacionaria = new exercicios("corridaEstacionaria", 00, 0, " https://youtu.be/pvLUTrZFvi4 ",
				0, 0, 1, 0);
		exercicios oGato = new exercicios("Mobilidade toraxica O Gato", 0, 0, " https://youtu.be/comObBAaUjc  ", 00, 0,
				1, 0);
		exercicios agachamentoIsometrico = new exercicios("Agachamento isometrico na parede", 0, 0,
				" https://youtu.be/p1KsWs_SNjg ", 00, 0, 1, 0);
		exercicios agachamentoSalto = new exercicios("Agachamento com salto", 0, 0, " https://youtu.be/p6miSld2sGs ", 0,
				0, 1, 1);
		exercicios stiffUnilateral = new exercicios("stiffUnilateral", 00, 0, " https://youtu.be/2l5cKMBRUU4 ", 0, 1, 0,
				1);
		exercicios escalador = new exercicios("Escalador", 00, 0, " https://youtu.be/Eni-G2H-WUA ", 0, 0, 1, 0);
		exercicios abdominalRemador = new exercicios("Abdominal Remador", 0, 0, " https://youtu.be/xvS-hw6dEGI ", 0, 0,
				1, 1);
		exercicios polichinelos = new exercicios("Polichinelos", 0, 0, " https://youtu.be/dJFfySv3tUg ", 0, 0, 1, 0);
		exercicios elevacaoPes = new exercicios("Elevacao na ponta dos pés", 0, 0, " https://youtu.be/huMhUr8Qycs ", 0,
				1, 0, 0);
		exercicios pulaCordas = new exercicios("Pula Cordas", 0, 0, " https://youtu.be/IcstXRKX2_Y ", 0, 0, 1, 0);
		exercicios abdominalBicicleta = new exercicios("Abdominal Bicicleta", 0, 0, " https://youtu.be/E07kQpNXTNA ", 0,
				0, 1, 0);

		// Adicionando exercicios no array
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
		opMenu = input.nextInt();

		System.out.println("Bem vindo! Escolha o seu nível(1-Iniciante" + " 2-Intermediário 3-Avançado): ");
		nivel = input.nextInt();

		switch (nivel) {
		case 1:
			for (int i = 0; i < listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(12, 2);
			}
			break;

		case 2:
			for (int i = 0; i < listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(12, 3);
			}
			break;

		case 3:
			for (int i = 0; i < listaExercicios.size(); i++) {
				listaExercicios.get(i).setRepsSeries(20, 2);
			}
			break;
		default:
			break;
		}

		switch (opMenu) {
		case 1: // Ganhar massa magra/muscular

			for (dia = 0; dia <= 30; dia++) {
				System.out.println("\n\t\tDIA-" + dia + "\n\tFaça os exercícios a seguir:");
				for (int i = 0; i < listaExercicios.size(); i++) {
					if (listaExercicios.get(i).getGanharMassa() == 1) {
						listaExercicios.get(i).imprimirInfo();
					}
				}
				System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op = input.nextInt();
				if (op == 1)
					System.out.println("\n\nParabéns, você concluiu o dia " + dia);
				else
					break;
				if ((dia % 2) == 0) {
					for (int i = 0; i < listaExercicios.size(); i++) {
						listaExercicios.get(i).aumentarRepsSeries(3, 0);
					}
				}

			}
			break;

		case 2: // Perder peso
			for (dia = 0; dia <= 30; dia++) {
				System.out.println("\n\t\tDIA-" + dia + "\n\tFaça os exercícios a seguir:");
				for (int i = 0; i < listaExercicios.size(); i++) {
					if (listaExercicios.get(i).getQueimarGordura() == 1) {
						listaExercicios.get(i).imprimirInfo();
					}
				}
				System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op = input.nextInt();
				if (op == 1)
					System.out.println("\n\nParabéns, você concluiu o dia " + dia);
				else
					break;
				if ((dia % 2) == 0) {
					for (int i = 0; i < listaExercicios.size(); i++) {
						listaExercicios.get(i).aumentarRepsSeries(3, 0);
					}
				}

			}
			break;
		case 3:
			for (dia = 0; dia <= 30; dia++) {
				System.out.println("\n\t\tDIA-" + dia + "\n\tFaça os exercícios a seguir:");
				for (int i = 0; i < listaExercicios.size(); i++) {
					if (listaExercicios.get(i).getDefinirMusculatura() == 1) {
						listaExercicios.get(i).imprimirInfo();
					}
				}
				System.out.println("\nDigite 1 se você concluiu os exercicios de hoje \nou Digite 0 para sair:");
				op = input.nextInt();
				if (op == 1)
					System.out.println("\n\nParabéns, você concluiu o dia " + dia);
				else
					break;
				if ((dia % 2) == 0) {
					for (int i = 0; i < listaExercicios.size(); i++) {
						listaExercicios.get(i).aumentarRepsSeries(3, 0);
					}
				}

			}
		}

	}

}