package projetoJAVA;

import java.util.Scanner;

public class Manual {
	
	int x;
	
	PulaLinhas espaco = new PulaLinhas();
	Scanner input = new Scanner(System.in);
	
	public void manualUser() {
		do {
			System.out.println("- Manual do Usuário –\r\n"
					+ "Boas-vindas e Introdução: \r\n"
					+ "	Nesta parte você terá uma breve explicação do que verá no programa e, posteriormente, digitando 1 será direcionado para a parte\n de inserir seus dados como nome, idade, altura, meta e peso. Com isso seu IMC(Índice de massa corporal) é calculado e perguntaremos seu objetivo. \nTodos esses dados serão armazenados no seu perfil de usuário.\r\n"
					+ "\r\n"
					+ "Menu principal:\r\n"
					+ "O menu principal tem 6 opções diferentes. Perfil do usuário, Tipos de Treino, Dicas, Manual do App, Sobre nós e Sair. Abaixo temos um resumo de cada uma:\r\n"
					+ "- Perfil do usuário: local em que se encontra os dados que o usuário preencheu no inicio do programa. \nLá ele consegue conferir sua meta e informações, além de atualizá-las. É o local que você vai conseguir fazer o acompanhamento do seu objetivo.\r\n"
					+ "- Tipos de treino: Local que tem acesso aos diferentes tipos de treino e as orientações de como fazer. Local principal que você vai acessar para ter seu treino.\r\n"
					+ "- Dicas: Links de vídeos de dicas sobre os exercícios no geral, todos juntos.\r\n"
					+ "- Manual do App: Este local que se encontra. Aqui temos as explicações das partes do programa.\r\n"
					+ "- Sobre nós: informações sobre os desenvolvedores que trabalharam nesse projeto.\r\n"
					+ "- Sair: fecha o programa.\r\n");
			System.out.println("Digite 0 para sair");
			x = input.nextInt();
			espaco.PulaLinhas();
		} while(x!=0);
	}

}
