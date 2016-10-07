package br.com.danielsilva;

public class Cachorro {
	private boolean domestico;
	
	public Cachorro(String nome, int idade,boolean domestico) {
		super(nome,idade);
		this.domestico = domestico;
	}
    @Override
    
	public void emitirSom(){
    	System.out.println("Au Au");
    	
    }
    
	public boolean isDomestico(){
    	return domestico;
    	
    }
}
