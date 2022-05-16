package projetoJAVA;

public abstract class AgrupamentoMuscular {
	
	private String agrupamento;
	
	abstract void exercicio(String exercicio);
	abstract void quantidade(int repeticoes, int serie); // Quantidade de Séries e repetições
	abstract void tempo(int tempo);
	
	public AgrupamentoMuscular(String agrupamento) {
		this.agrupamento = agrupamento;
	}
	public String getAgrupamento() {
		return agrupamento;
	}
	public void setAgrupamento(String agrupamento) {
		this.agrupamento = agrupamento;
	}
	
}