package projetoJAVA;

public class Bracos extends AgrupamentoMuscular {
	
	public Bracos() {
		super("Exercícios para Braços");
		
	}
	
	@Override
	public void exercicio(String exercicio) {
		System.out.println("Lista de exercícios para "+exercicio+":"
				+ "\n Rosca"
				+ "\n Mergulho no banco");
	}
	
	@Override
	public void quantidade(int series, int repeticoes) {
		
		System.out.println("Você deve fazer "+series+" séries de "+repeticoes+" repetições de cada exercício");
		
	}
	
	@Override
	public void tempo(int tempo) {
		System.out.println("Tempo de execução: " + tempo + " minutos");
	}

}


