package projetoJAVA;

public class Peitoral extends AgrupamentoMuscular {
	
	public Peitoral() {
		super("Exerc�cios para o Peitoral");
		
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
