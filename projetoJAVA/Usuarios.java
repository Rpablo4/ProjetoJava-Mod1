package projetoJAVA;

import java.util.Scanner;

public class Usuarios {
	
	protected String nome;
	protected float meta;
	protected int idade;
	protected float peso=0;
	protected float altura=0;
	protected float imc=0;
	
	public Usuarios(String nome,float meta, int idade, float peso, float altura, float imc) {
		this.nome = nome;
		this.meta = meta;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.imc = imc;
		
		
	}
	
	public void perfilUsuario() {
		int op=0;
		Scanner input = new Scanner (System.in);
		
		System.out.println("\n Nome: "+getNome()+";");
		System.out.println("\n Idade: "+getIdade()+";");
		System.out.println("\n Altura: "+getAltura()+";");
		System.out.println("\n peso: "+getPeso()+"kg;");
		System.out.println("\n Meta: "+getMeta()+"kg;");
		System.out.println("\n Imc: "+getImc()+";");

			
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getMeta() {
		return meta;
	}

	public void setMeta(float meta) {
		this.meta = meta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}
	
	
	

	
}
