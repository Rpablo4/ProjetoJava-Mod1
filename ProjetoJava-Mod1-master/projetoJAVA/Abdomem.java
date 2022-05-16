package projetoJAVA;

public class Abdomem extends AgrupamentoMuscular {
	
	public Abdomem() {
		super("Exerc�cios para Pernas");
		
	}

	@Override
	public void exercicio(String exercicio) {
		System.out.println("Lista de exerc�cios para " + exercicio + ":");
	}

	@Override
	public void quantidade(int series, int repeticoes) {

		System.out.println("Voc� deve fazer " + series + " s�ries de " + repeticoes + " repeti��es de cada exerc�cio");

	}

	@Override
	public void tempo(int tempo) {
		System.out.println("Tempo de execu��o: " + tempo + " minutos");
	}

}
