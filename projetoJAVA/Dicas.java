package projetoJAVA;

import java.util.Scanner;

public class Dicas {
	
	String dicas;
	int x;
	Scanner input = new Scanner(System.in);
	PulaLinhas espaco = new PulaLinhas();
	
	public void Dicas() {
		do {
			System.out.println("Exercícios e links de orientação: \n\n"
					+ "Abdominal supra - https://youtu.be/t4PBYd481nk\r\n\n"
					+ "Flexão de Braço  https://youtu.be/lkvSelJ0tQ8\r\n\n"
					+ "Agachamento Sumô  https://youtu.be/XypoxVWr0zs\r\n\n"
					+ "Ponte  https://youtu.be/7mcMQiy-MWQ\r\n\n"
					+ "Agachamento livre na cadeira - https://youtu.be/5HgLKPl4Wx4\r\n\n"
					+ "Triceps no banco https://youtu.be/GM21qkns-Ao\r\n\n"
					+ "Corrida Estacionaria  https://youtu.be/pvLUTrZFvi4\r\n\n"
					+ "Mobilidade toraxica O Gato  https://youtu.be/comObBAaUjc\r\n\n"
					+ "Agachamento isometrico na parede  https://youtu.be/p1KsWs_SNjg\r\n\n"
					+ "Agachamento com salto  https://youtu.be/p6miSld2sGs\r\n\n"
					+ "stiff Unilateral  https://youtu.be/2l5cKMBRUU4\r\n\n"
					+ "Escalador  https://youtu.be/Eni-G2H-WUA\r\n\n"
					+ "Abdominal Remador https://youtu.be/xvS-hw6dEGI\r\n\n"
					+ "Polichinelos  https://youtu.be/dJFfySv3tUg\r\n\n"
					+ "Elevacao na ponta dos pés https://youtu.be/huMhUr8Qycs\r\n\n"
					+ "Pula Cordas  https://youtu.be/IcstXRKX2_Y\r\n\n"
					+ "Abdominal Bicicleta  https://youtu.be/E07kQpNXTNA \r\n\n");
			System.out.println("\n\tDigite 0 para sair");
			x = input.nextInt();
			
			espaco.PulaLinhas();
		} while(x!=0);
		
		
		
	}

	public String getDicas(String Dicas) {
		return dicas;
	}

	public void setDicas(String dicas) {
		this.dicas = dicas;
	}
	
	
}
