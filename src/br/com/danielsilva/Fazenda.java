package br.com.danielsilva;

public class Fazenda {
	public static void main(String[] args) {
		Vaca Mimosa    = new Vaca("Mimosa",20);
		Cachorro Pluto = new Cachorro("Pluto",2,true);
        
		Animal rex    = new Cachorro("Rex",10,false);//exemplo de polimorfismo
		Animal animal = new Animal("Rex",10);
		
		if(rex instanceof Cachorro)
			((Cachorro)rex).isDomestico();
		
		Mimosa.emitirSom();
		Pluto.emitirSom();
		rex.emitirSom();
		animal.emitirSom();
	}
}
