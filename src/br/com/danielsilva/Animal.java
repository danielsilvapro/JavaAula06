package br.com.danielsilva;

public class Animal {
	private String nome;
	private int    idade;
	
	public Animal(String nome,int idade){
		this.nome = nome;
		this.idade = idade;
	}
	

	public void comer(){
		System.out.println("Comer");
	}
	public void emitirSom(){
		System.out.println("Emissao de som");
	}
	
	public String getNome() {
		return nome;
	}


	public int getIdade() {
		return idade;
	}

}
