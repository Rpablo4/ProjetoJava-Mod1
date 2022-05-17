package projetoJAVA;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		///////variaveis da apresentação//////////
		String nome;
		float meta = 0;
		int idade;
		float peso=0;
		float altura=0;
		float imc=0;
		int op=0;
		
		//////////////////////////////////////////////
		
		PulaLinhas espaco = new PulaLinhas();
		Bracos bracos = new Bracos();
		Pernas pernas = new Pernas();
		Abdomem abdomem = new Abdomem();
		Peitoral peitoral = new Peitoral();
		EscolhaAgrupamento agrupamento = new EscolhaAgrupamento();
		Dicas dicas = new Dicas();
		Scanner input = new Scanner(System.in);
		

		Usuarios perfil = new Usuarios("user", 0, 0, 0, 0, 0);
		int opMenu, opSelecionada, opMenuPrincipal;
		
		//joao paz Presentação e Eliel...
		System.out.println("\n\t\t Bem-Vindes ao Fit52!!! \n");
		System.out.println("\nAqui você terá vantagens como:\n");
		System.out.println("\n1ª Exercícios personalizados.");
		System.out.println("\n2ª Acompanhamento de seu desenvolvimento." );
		System.out.println("\n3ª Metas a serem alcançadas. ");
		System.out.println("\nVocê irá ver tudo isso e um pouco mais no TREINOS SMART." + 
		"\nnosso programa de controle e desenvolvimento de exercícios fisicos da melhor forma para você");
	
		System.out.println("\n1- Digite 1 para avançar");
		op = input.nextInt();
		
		switch(op) {
		
		case 1:
			 espaco.PulaLinhas();
		break;	
			 
		}
		
		//Primeiros dado
	
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
		perfil.setNome(nome);
		System.out.println("\nSua idade: ");
		idade = input.nextInt();
		perfil.setIdade(idade);
		Thread.sleep(1000);
		
		System.out.println("\nCarregando. ");
		Thread.sleep(1000);
		System.out.println("Carregando.. ");
		Thread.sleep(1000);
		System.out.println("Carregando... ");
		Thread.sleep(1000);
		System.out.print("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		espaco.PulaLinhas();
		
		//calculando o imc
		
		System.out.println("\nAgora vamos calcular seu IMC(ÍNDICE DE MASSA CORPORAL).");
		System.out.println("\nPor favor Preencha os campos abaixo:");
		System.out.println("\nSua Altura: ");
		altura = input.nextFloat();
		perfil.setAltura(altura);
		System.out.println("\nSeu Peso: ");
		peso = input.nextFloat();
		perfil.setPeso(peso);
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
		perfil.setImc(imc);
	
		System.out.printf("\nSeu IMC é: %.2f\n",imc);
		Thread.sleep(3000);
		///////switch para saber que meta o usuaria deseja//////
		
		System.out.println("\nInforme uma meta para que você posso acompanhar seu progresso:");
		System.out.println("\n1- Ganho de massa muscular");
		System.out.println("\n2- Perca de peso");
		System.out.println("\n3- Manter seu peso");
		op = input.nextInt();
		
		switch(op) {
		
		case 1:
			 System.out.println("\nQual peso(kg) você deseja alcansar");
			 meta = input.nextInt();
			 perfil.setMeta(meta);	 
		break;	
		case 2:
			 System.out.println("\nQual peso(kg) você deseja alcansar");
			 meta = input.nextInt();
			 perfil.setMeta(meta);	
		break;
		case 3:
			System.out.println("\nPor favor qual seu peso atual");
		break;
		}
		///////////////////////////////////////////////////
		
		System.out.println("\nQual a sua meta: ");
	
		
		espaco.PulaLinhas();
		
		
		perfil.perfilUsuario();
		Thread.sleep(1000);
	
		
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
		espaco.PulaLinhas();
		
/////////////////// fim da apresentação//////////////////	

		do {

			System.out.println("\t\t-Menu Principal-" + "\n\n1 - Perfil do usuário" + "\n2 - Tipos de treino" + "\n3 - Dicas"
					+ "\n4 - Manual do app" + "\n5 - Sobre nós"+"\n0 - Sair" + "\n\nDigite o número da opção desejada: ");

			opMenuPrincipal = input.nextInt();

			espaco.PulaLinhas();

			switch (opMenuPrincipal) {
			case 0:
				
				System.out.println("Saindo...");
				
				break;
				///////////case de atualizar dados do usuario //////////////
			case 1:

				System.out.println("\nDeseja Atualizar algum dado?");
				System.out.println("\n1- Nome: "+perfil.getNome()+";");
				System.out.println("\n2- Idade: "+perfil.getIdade()+";");
				System.out.println("\n3- Peso: "+perfil.getPeso()+";");
				System.out.println("\n4- Meta: "+perfil.getMeta()+";");
				System.out.println("\n5- Sair... ");
				op = input.nextInt();
				
				switch(op) {
				
				case 1:
					 System.out.println("\nInforme seu nome atual :");
					 nome = input.next();
					 perfil.setNome(nome); 
					 System.out.println("\nDados atualizados");
					 
				break;	
				case 2:
					 System.out.println("\nInforme sua idade atual : ");
					 idade = input.nextInt();
					 perfil.setIdade(idade);
					 
				break;
				case 3:
					 System.out.println("\nInforme seu peso atual :");
					 peso = input.nextFloat();
					 perfil.setPeso(peso);
					 if(meta < peso) {
						 System.out.println("\nO sucesso vem para aqueles que não se "
						 		+ "impoêm limitese nunca perdem de vista suas metas continue firme!!!");
					 }
					 else if(meta > peso) {
						 System.out.println("\nParabéns guerreiro não tire os olhos dos seus objetivos");
						 
					 }
					espaco.PulaLinhas();
				break;
				case 4:
					 System.out.println("\nInforme sua nova meta :");
					 meta = input.nextFloat();
					 perfil.setMeta(meta);
					 
				break;
				default:
					
				break;
				
				}
				
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
