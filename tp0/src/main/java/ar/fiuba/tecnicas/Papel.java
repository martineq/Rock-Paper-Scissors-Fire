package main.java.ar.fiuba.tecnicas;

public class Papel implements Elemento {

	public boolean equals(Object object){
		return ( object instanceof Papel );
	}
	
	@Override
	public Elemento vs(Elemento elemento) {
		return elemento.vs(this);
	}

	public Elemento vs(Piedra piedra){
		return this;
	}

	public Elemento vs(Papel papel){
		return papel;
	}
	
	public Elemento vs(Tijera tijera){
		return tijera;
	}
}
