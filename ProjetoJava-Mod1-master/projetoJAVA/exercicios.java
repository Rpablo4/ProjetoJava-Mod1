package projetoJAVA;

public class exercicios {
	//Declarando atributos
	protected String nomeDoExercicio;
	protected int reps;
	protected int series;
	protected String comoFazer;
	protected String tempoEmSegundos;
	protected boolean ganharMassa;
	protected boolean queimarGordura;
	protected boolean definirMusculatura;
	
	//Metodo construtor
	
	public exercicios(String nomeDoExercicio, int reps, int series, String comoFazer, String tempo, boolean ganharMassa, boolean queimarGordura, boolean definirMusculatura)
	{
		this.nomeDoExercicio=nomeDoExercicio;
		this.reps=reps;
		this.series=series;
		this.comoFazer=comoFazer;
		this.tempoEmSegundos=tempo;
		this.ganharMassa=ganharMassa;
		this.queimarGordura=queimarGordura;
		this.definirMusculatura=definirMusculatura;
	}
	
	//Getters, Setters and metods 
	public void imprimirInfo() {
		System.out.println("\nNome do exercício: "+getNomeDoExercicio()
				+"\nNúmero de repetições: "+getReps()+
				"\nNúmero de séries: "+getSeries()+
				"\ncomoFazer: "+getComoFazer()+
				"\nPor quanto tempo: "+getTempoEmSegundos()+"s");
	}
	public String getNomeDoExercicio() {
		return nomeDoExercicio;
	}
	public void setNomeDoExercicio(String nomeDoExercicio) {
		this.nomeDoExercicio = nomeDoExercicio;
	}
	public int getReps() {
		return reps;
	}
	public void setReps(int reps) {
		this.reps = reps;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	public String getComoFazer() {
		return comoFazer;
	}
	public void setComoFazer(String comoFazer) {
		this.comoFazer = comoFazer;
	}
	public String getTempoEmSegundos() {
		return tempoEmSegundos;
	}
	public void setTempoEmSegundos(String tempo) {
		this.tempoEmSegundos = tempo;
	}
	public void setRepsSeries(int Reps, int Series) {
		this.reps= Reps;
		this.series= Series;
	}
	
	public boolean getGanharMassa() {
		return ganharMassa;
	}

	public void setGanharMassa(boolean ganharMassa) {
		this.ganharMassa = ganharMassa;
	}

	public boolean getQueimarGordura() {
		return queimarGordura;
	}

	public void setQueimarGordura(boolean queimarGordura) {
		this.queimarGordura = queimarGordura;
	}

	public boolean getDefinirMusculatura() {
		return definirMusculatura;
	}

	public void setDefinirMusculatura(boolean definirMusculatura) {
		this.definirMusculatura = definirMusculatura;
	}

	//Aumenta quantidade de repetições e séries do exercício.
	public void aumentarRepsSeries(int incrementoReps, int incrementoSeries) {
		this.reps= reps+incrementoReps;
		this.series= series+incrementoSeries;
	}
	public void aumentarTempo(int tempo) {
		this.tempoEmSegundos= this.tempoEmSegundos + tempo + "s";
	}


	
}
