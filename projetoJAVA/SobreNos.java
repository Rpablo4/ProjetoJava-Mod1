package projetoJAVA;

import java.util.Scanner;

public class SobreNos {
	
	public void sobreNos() {
		
		PulaLinhas espaco = new PulaLinhas();
		Scanner input = new Scanner(System.in);
		int x;
		do {
			System.out.println("\t-Desenvolvedores do projeto:"
					+ "Nome: Carlos Renê \r\n"
					+ "Linkedin: \r\n"
					+ "https://www.linkedin.com/in/carlos-rene-82b572239/\r\n"
					+ "GitHub: \r\n"
					+ "https://github.com/CarlosRene987\r\n"
					+ "\r\n"
					+ "Nome: Ruan Pablo\r\n"
					+ "GitHub\r\n"
					+ "https://github.com/Rpablo4/\r\n"
					+ "Linkedin\r\n"
					+ "https://www.linkedin.com/in/ruan-pablo-38533520b/\r\n"
					+ "\r\n"
					+ "Nome: Eliel Silva\r\n"
					+ "GitHub: \r\n"
					+ "https://github.com/Lielsilva18\r\n"
					+ "Linkedin: \r\n"
					+ "https://www.linkedin.com/in/eliel-benedito-077b11239/\r\n"
					+ "\r\n"
					+ "Nome: Joao Lucas Marques\r\n"
					+ "GitHub:\r\n"
					+ "https://github.com/joaolmb\r\n"
					+ "LinkedIn:\r\n"
					+ "https://www.linkedin.com/in/joaolmb/\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "Nome: Joao Lucas Paz\r\n"
					+ "GitHub:\r\n"
					+ "https://github.com/Joaolucas398\r\n"
					+ "LinkedIn:\r\n"
					+ "https://www.linkedin.com/in/jlsouzapaz/\r\n"
					+ "\r\n"
					+ "\r\n"
					+ "Silvio Mauricio\r\n"
					+ "GitHub:\r\n"
					+ "https://github.com/silvoncio \n"
					+ "");
			System.out.println("Digite 0 para sair");
			x = input.nextInt();
			espaco.PulaLinhas();
		} while(x!=0);
		
	}

}
