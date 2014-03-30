package main.java.ar.fiuba.tecnicas;

public class Piedra implements Elemento {

	public boolean equals(Object object){
		return ( object instanceof Piedra );
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
		return this;
	}
}
