package projetoJAVA;

import java.util.Scanner;

public class Manual {
	
	int x;
	
	PulaLinhas espaco = new PulaLinhas();
	Scanner input = new Scanner(System.in);
	
	public void manualUser() {
		do {
			System.out.println("- Manual do Usu�rio �\r\n"
					+ "Boas-vindas e Introdu��o: \r\n"
					+ "	Nesta parte voc� ter� uma breve explica��o do que ver� no programa e, posteriormente, digitando 1 ser� direcionado para a parte\n de inserir seus dados como nome, idade, altura, meta e peso. Com isso seu IMC(�ndice de massa corporal) � calculado e perguntaremos seu objetivo. \nTodos esses dados ser�o armazenados no seu perfil de usu�rio.\r\n"
					+ "\r\n"
					+ "Menu principal:\r\n"
					+ "O menu principal tem 6 op��es diferentes. Perfil do usu�rio, Tipos de Treino, Dicas, Manual do App, Sobre n�s e Sair. Abaixo temos um resumo de cada uma:\r\n"
					+ "- Perfil do usu�rio: local em que se encontra os dados que o usu�rio preencheu no inicio do programa. \nL� ele consegue conferir sua meta e informa��es, al�m de atualiz�-las. � o local que voc� vai conseguir fazer o acompanhamento do seu objetivo.\r\n"
					+ "- Tipos de treino: Local que tem acesso aos diferentes tipos de treino e as orienta��es de como fazer. Local principal que voc� vai acessar para ter seu treino.\r\n"
					+ "- Dicas: Links de v�deos de dicas sobre os exerc�cios no geral, todos juntos.\r\n"
					+ "- Manual do App: Este local que se encontra. Aqui temos as explica��es das partes do programa.\r\n"
					+ "- Sobre n�s: informa��es sobre os desenvolvedores que trabalharam nesse projeto.\r\n"
					+ "- Sair: fecha o programa.\r\n");
			System.out.println("Digite 0 para sair");
			x = input.nextInt();
			espaco.PulaLinhas();
		} while(x!=0);
	}

}
