package projetoJAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) throws InterruptedException {
		///////variaveis da apresenta��o//////////
		String nome;
		float meta = 0;
		int idade;
		float peso=0;
		float altura=0;
		float imc=0;
		int op=0;

		int nivel, dia = 0;
		
		//////////////////////////////////////////////
		//************ Objetos **********//
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
		
		//joao paz Presenta��o e Eliel...
		System.out.println("\n\t\t Bem-Vindes ao Fit52!!! \n");
		System.out.println("\nAqui voc� ter� vantagens como:\n");
		System.out.println("\n1� Exerc�cios personalizados.");
		System.out.println("\n2� Acompanhamento de seu desenvolvimento." );
		System.out.println("\n3� Metas a serem alcan�adas. ");
		System.out.println("\nVoc� ir� ver tudo isso e um pouco mais no TREINOS SMART." + 
		"\nnosso programa de controle e desenvolvimento de exerc�cios fisicos da melhor forma para voc�");
	
		System.out.println("\n1- Digite 1 para avan�ar");
		op = input.nextInt();
		
		switch(op) {
		
		case 1:
			 espaco.PulaLinhas();
		break;	
			 
		}
		
		//Primeiros dado
	
		System.out.print("Carregando. ");
		Thread.sleep(1000);
		System.out.print(". ");
		Thread.sleep(1000);
		System.out.print(". ");
		Thread.sleep(1000);
		System.out.println("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nAntes de come�armos nossos treinamentos precisamos de algumas informa��es: ");
		System.out.println("\nSeu Nome: ");
		nome = input.next();
		perfil.setNome(nome);
		System.out.println("\nSua idade: ");
		idade = input.nextInt();
		perfil.setIdade(idade);
		Thread.sleep(1000);
		
		System.out.print("\nCarregando.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		espaco.PulaLinhas();
		
		//calculando o imc
		
		System.out.println("\nAgora vamos calcular seu IMC(�NDICE DE MASSA CORPORAL).");
		System.out.println("\nPor favor Preencha os campos abaixo:");
		System.out.println("\nSua Altura: ");
		altura = input.nextFloat();
		perfil.setAltura(altura);
		System.out.println("\nSeu Peso: ");
		peso = input.nextFloat();
		perfil.setPeso(peso);
		System.out.println("\nQual a sua meta em Kg: ");
		meta = input.nextFloat();
		perfil.setMeta(meta);
		System.out.print("Calculando seu IMC...\n");
		Thread.sleep(1000);
		System.out.print("Carregando.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
	
		imc = peso/(altura*altura);
		perfil.setImc(imc);
	
		System.out.printf("\nSeu IMC �: %.2f\n",imc);
		if(imc>24.9) {
			System.out.println("\nAcima do peso. Recomendamos o treino para perder massa.");
		} else if(imc<18.5) {
			System.out.println("Abaixo do peso. Recomendamos o treino para ganhar massa.");
		} else {
			System.out.println("Peso ideal, recomendamos o treino para definir o corpo");
		}
		Thread.sleep(3000);
		///////switch para saber que meta o usuaria deseja//////
		
		System.out.println("\nInforme uma meta para que voc� posso acompanhar seu progresso:");
		System.out.println("\n1- Ganho de massa muscular");
		System.out.println("\n2- Perda de peso");
		System.out.println("\n3- Manter seu peso");
		op = input.nextInt();
		
		switch(op) {
		
		case 1:
			 System.out.println("\nQual peso(kg) voc� deseja alcansar: ");
			 meta = input.nextInt();
			 perfil.setMeta(meta);	 
		break;	
		case 2:
			 System.out.println("\nQual peso(kg) voc� deseja alcan�ar");
			 meta = input.nextInt();
			 perfil.setMeta(meta);	
		break; 
		}

		///////////////////////////////////////////////////
		
		espaco.PulaLinhas();
		
		
		perfil.perfilUsuario();
		Thread.sleep(1000);
	
		
		System.out.println("\nAnalisando seus dados... ");
		Thread.sleep(1000);
		System.out.print("Carregando.");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.print(".");
		Thread.sleep(1000);
		System.out.println("\nCarregamento completo!!!\n");
		Thread.sleep(2000);
		
		System.out.println("\nTodos seus dados foram analisados!!!");

		System.out.println("\n\t\tTenha um �timo trino!!!");
		Thread.sleep(3000);
		espaco.PulaLinhas();
		
		/////////////////// fim da apresenta��o//////////////////	

		System.out.println("\n\t\tTenha um �timo treino!!!");
		Thread.sleep(2000);
		espaco.PulaLinhas();
		
/////////////////// fim da apresenta��o //////////////////	


		do {

			System.out.println("\t\t-Menu Principal-" + "\n\n1 - Perfil do usu�rio" + "\n2 - Tipos de treino" + "\n3 - Dicas"
					+ "\n4 - Manual do app" + "\n5 - Sobre n�s"+"\n0 - Sair" + "\n\nDigite o n�mero da op��o desejada: ");

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
					 Thread.sleep(2000);
					 espaco.PulaLinhas();
					 
				break;	
				case 2:
					 System.out.println("\nInforme sua idade atual : ");
					 idade = input.nextInt();
					 perfil.setIdade(idade);
					 System.out.println("\nDados atualizados");
					 Thread.sleep(2000);
					 espaco.PulaLinhas();
				break;
				case 3:
					 System.out.println("\nInforme seu peso atual :");
					 peso = input.nextFloat();
					 perfil.setPeso(peso);
					 if(meta > peso) {
						 System.out.println("\nO sucesso vem para aqueles que n�o se "
						 		+ "impo�m limitese nunca perdem de vista suas metas continue firme!!!");
					 }
					 else if(meta < peso) {
						 System.out.println("\nParab�ns guerreiro n�o tire os olhos dos seus objetivos");
						 
					 }
					 System.out.println("\nDados atualizados");
				break;
				case 4:
					 System.out.println("\nInforme sua nova meta :");
					 meta = input.nextFloat();
					 perfil.setMeta(meta);
					 Thread.sleep(2000);
					 espaco.PulaLinhas();
				break;
				default:
					System.out.print("Saindo.");
					Thread.sleep(1000);
					System.out.print(".");
					Thread.sleep(1000);
					System.out.print(".");
					Thread.sleep(1000);
					espaco.PulaLinhas();

				break;
				
				}
				
			break;

			case 2: // Tipos de treinos


					espaco.PulaLinhas();


						do {
							//////////////////////////
							
							ArrayList<exercicios> listaExercicios = new ArrayList<>();

							// criando exerc�cios exercicio(nome, reps, series, comoFazer, tempoemsec)

							exercicios abdominalSupra = new exercicios("Abdominal supra", 0, 0, " https://youtu.be/t4PBYd481nk ", "At� concluir", 0, 1,
									1);
							exercicios flexaoDeBraco = new exercicios("Flex�o de Bra�o", 0, 0, " https://youtu.be/lkvSelJ0tQ8", "at� concluir", 1, 1, 1);
							exercicios agachamentoSumo = new exercicios("Agachamento Sum�", 0, 0, " https://youtu.be/XypoxVWr0zs ", "At� concluir", 1, 0,
									1);
							exercicios ponte = new exercicios("Ponte", 0, 0, " https://youtu.be/7mcMQiy-MWQ ", "30 seg", 0, 1, 1);
							exercicios agachamentoCadeira = new exercicios("Agachamento livre na cadeira", 0, 0,
									" https://youtu.be/5HgLKPl4Wx4 ", "At� concluir", 0, 1, 1);
							exercicios tricepsBanco = new exercicios("Triceps no banco", 0, 0, " https://youtu.be/GM21qkns-Ao  ", "At� concluir", 1, 0,
									1);
							exercicios corridaEstacionaria = new exercicios("corridaEstacionaria", 00, 0, " https://youtu.be/pvLUTrZFvi4 ",
									"At� concluir", 0, 1, 0);
							exercicios oGato = new exercicios("Mobilidade toraxica O Gato", 0, 0, " https://youtu.be/comObBAaUjc  ", "At� concluir", 0,
									1, 0);
							exercicios agachamentoIsometrico = new exercicios("Agachamento isometrico na parede", 0, 0,
									" https://youtu.be/p1KsWs_SNjg ", "At� concluir", 0, 1, 0);
							exercicios agachamentoSalto = new exercicios("Agachamento com salto", 0, 0, " https://youtu.be/p6miSld2sGs ", "At� concluir",
									0, 1, 1);
							exercicios stiffUnilateral = new exercicios("stiffUnilateral", 00, 0, " https://youtu.be/2l5cKMBRUU4 ", "At� concluir", 1, 0,
									1);
							exercicios escalador = new exercicios("Escalador", 00, 0, " https://youtu.be/Eni-G2H-WUA ", "At� concluir", 0, 1, 0);
							exercicios abdominalRemador = new exercicios("Abdominal Remador", 0, 0, " https://youtu.be/xvS-hw6dEGI ", "At� concluir", 0,
									1, 1);
							exercicios polichinelos = new exercicios("Polichinelos", 0, 0, " https://youtu.be/dJFfySv3tUg ", "At� concluir", 0, 1, 0);
							exercicios elevacaoPes = new exercicios("Elevacao na ponta dos p�s", 0, 0, " https://youtu.be/huMhUr8Qycs ", "At� concluir",
									1, 0, 0);
							exercicios pulaCordas = new exercicios("Pula Cordas", 0, 0, " https://youtu.be/IcstXRKX2_Y ", "At� concluir", 0, 1, 0);
							exercicios abdominalBicicleta = new exercicios("Abdominal Bicicleta", 0, 0, " https://youtu.be/E07kQpNXTNA ", "At� concluir",
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

							System.out.println("Bem vindo! Escolha o seu n�vel(1-Iniciante" + " 2-Intermedi�rio 3-Avan�ado): ");
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
									System.out.println("\n\t\tDIA-" + dia + "\n\tFa�a os exerc�cios a seguir:");
									for (int i = 0; i < listaExercicios.size(); i++) {
										if (listaExercicios.get(i).getGanharMassa() == 1) {
											listaExercicios.get(i).imprimirInfo();
										}
									}
									System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
									op = input.nextInt();
									if (op == 1)
										System.out.println("\n\nParab�ns, voc� concluiu o dia " + dia);
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
									System.out.println("\n\t\tDIA-" + dia + "\n\tFa�a os exerc�cios a seguir:");
									for (int i = 0; i < listaExercicios.size(); i++) {
										if (listaExercicios.get(i).getQueimarGordura() == 1) {
											listaExercicios.get(i).imprimirInfo();
										}
									}
									System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
									op = input.nextInt();
									if (op == 1)
										System.out.println("\n\nParab�ns, voc� concluiu o dia " + dia);
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
									System.out.println("\n\t\tDIA-" + dia + "\n\tFa�a os exerc�cios a seguir:");
									for (int i = 0; i < listaExercicios.size(); i++) {
										if (listaExercicios.get(i).getDefinirMusculatura() == 1) {
											listaExercicios.get(i).imprimirInfo();
										}
									}
									System.out.println("\nDigite 1 se voc� concluiu os exercicios de hoje \nou Digite 0 para sair:");
									op = input.nextInt();
									if (op == 1)
										System.out.println("\n\nParab�ns, voc� concluiu o dia " + dia);
									else
										break;
									if ((dia % 2) == 0) {
										for (int i = 0; i < listaExercicios.size(); i++) {
											listaExercicios.get(i).aumentarRepsSeries(3, 0);
										}
									}

								}
							}
							
							
							//////////////////////////							
						
				} while(op != 0);
						
					break;


			case 3: // Dicas
				
				// Link de video
				
				break;

			case 4: // Manual do app
				
				// String explicando o que tem em cada parte do app
				
				break;

			case 5: // Sobre n�s
				
				// Info dos DEVS (GITHUB, Linkedin, nome, idade, cidade)
				break;

			default:
				espaco.PulaLinhas();
				System.out.println("Voc� digitou uma op��o inv�lida, tome cuidado!");
				Thread.sleep(2000);
				break;
			}

		} while (opMenuPrincipal != 0);
	}
	
}
