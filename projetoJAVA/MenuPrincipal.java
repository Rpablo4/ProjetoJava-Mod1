package projetoJAVA;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opMenu, x, opSelecionada; 

		System.out.println("\t\t-Menu Principal-"
				+ "\n\n1 - Suas metas"
				+ "\n2 - Tipos de treino"
				+ "\n3 - Dicas"
				+ "\n4 - Manual do app"
				+ "\n5 - Sobre nós"
				+ "\n\nDigite o número da opção desejada: ");
		
		opMenu = input.nextInt();
		
		
		// usar isso para "limpar" o terminal quando precisar
		for(x=0;x<=20;x++) {
			System.out.println("\n");
		}
		
		System.out.println("**********************************************************"); 

		
		// minha ideia seria ele puxar essa opcaoSelecionada das classes para apresentar o resultado delas após o switch
		
		switch(opMenu)  {
		case 1:
			;
			break;
		}
		
	/*	
		
		switch(opMenu)  {
		case 1:
			opcaoSelecionada = metas;
			break;
		case 2:
			opcaoSelecionada = treinos;
			break;
		case 3:
			opcaoSelecionada = dicas;
			break;
		case 4:
			opcaoSelecionada = manual;
			break;
		case 5:
			opcaoSelecionada = sobreNos;
			break;
		default: 
			System.out.println("Erro inesperado");
		}*/
		
	}

}
