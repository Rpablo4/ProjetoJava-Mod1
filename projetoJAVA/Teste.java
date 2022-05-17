package projetoJAVA;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws InterruptedException {

		PulaLinhas espaco = new PulaLinhas();
		Bracos bracos = new Bracos();
		Pernas pernas = new Pernas();
		Abdomem abdomem = new Abdomem();
		Peitoral peitoral = new Peitoral();
		EscolhaAgrupamento agrupamento = new EscolhaAgrupamento();
		Dicas dicas = new Dicas();

		Scanner input = new Scanner(System.in);
		
		Apresentacao apresentacao = new Apresentacao(); 
		int opMenu, opSelecionada, opMenuPrincipal;
		
		//joao paz...
		apresentacao.Apresentacao();
		
		

		do {

			System.out.println("\t\t-Menu Principal-" + "\n\n1 - Perfil do usuário" + "\n2 - Tipos de treino" + "\n3 - Dicas"
					+ "\n4 - Manual do app" + "\n5 - Sobre nós"+"\n0 - Sair" + "\n\nDigite o número da opção desejada: ");

			opMenuPrincipal = input.nextInt();

			espaco.PulaLinhas();

			switch (opMenuPrincipal) {
			case 0:
				
				System.out.println("Saindo...");
				
				break;

			case 1: 
				 
				

				break;

			case 2: // Tipos de treinos

				do {

					System.out.println("\tEscolha qual opção deseja ver:\n" + "\n1 - Treinos por grupamento muscular."
							+ "\n2 - Treinos por biotipo." + "\n3 - Treinos fixos\n0 - Para sair ");
					opMenu = input.nextInt();

					espaco.PulaLinhas();

					switch (opMenu) {
					
					case 0:
						System.out.println("Saindo...");
						Thread.sleep(2000);
					break;

					case 1: // Treino por grupamento muscular

						do {

							agrupamento.Agrupamentos();
							opSelecionada = input.nextInt();

							switch (opSelecionada) {

							case 0: // Sair
								System.out.println("Saindo...");
								Thread.sleep(2000);
								break;

							case 1: // Treino de braço
								espaco.PulaLinhas();
								bracos.exercicio("BRAÇOS");
								bracos.quantidade(3, 10);
								bracos.tempo(5);
								
								Thread.sleep(2000);
								break;

							case 2: // Treino de Perna
								espaco.PulaLinhas();
								pernas.exercicio("PERNAS");
								pernas.quantidade(3, 10);
								pernas.tempo(10);
								break;

							case 3: // Treino de abdomem
								espaco.PulaLinhas();
								abdomem.exercicio("ABDOMEN");
								abdomem.quantidade(3, 10);
								abdomem.tempo(10);
								break;

							case 4: // Treino de Peitoral
								espaco.PulaLinhas();
								peitoral.exercicio("PEITORAL");
								peitoral.quantidade(3, 10);
								peitoral.tempo(10);
								break;

							default: // Padrão caso o user digite um número fora do esperado
								espaco.PulaLinhas();
								System.out.println("Você selecionou uma opção inválida. Escolha uma nova opção.");
								Thread.sleep(2000);
								break;
							}

						} while (opSelecionada != 0);

						break;

					case 2: // Treinamento por BIOTIPO

						break;

					case 3: // Treinamento FIXO

						break;
					}

				} while (opMenu != 0);

			case 3: // Dicas
				
				// Link de video
				
				break;

			case 4: // Manual do app
				
				// String explicando o que tem em cada parte do app
				
				break;

			case 5: // Sobre nós
				
				// Info dos DEVS (GITHUB, Linkedin, nome, idade, cidade)
				break;

			default:
				espaco.PulaLinhas();
				System.out.println("Você digitou uma opção inválida, tome cuidado!");
				Thread.sleep(2000);
				break;
			}

		} while (opMenuPrincipal != 0);

	}
}
