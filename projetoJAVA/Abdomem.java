package projetoJAVA;

public class Abdomem extends AgrupamentoMuscular {
	
	public Abdomem() {
		super("Exercícios para Pernas");
		
	}

	@Override
	public void exercicio(String exercicio) {
		System.out.println("Lista de exercícios para " + exercicio + ":");
	}

	@Override
	public void quantidade(int series, int repeticoes) {

		System.out.println("Você deve fazer " + series + " séries de " + repeticoes + " repetições de cada exercício");

	}

	@Override
	public void tempo(int tempo) {
		System.out.println("Tempo de execução: " + tempo + " minutos");
	}

}
