package main.java.ar.fiuba.tecnicas;

public class Tijera implements Elemento {
	
	public boolean equals(Object object){
		return ( object instanceof Tijera );
	}
	
	@Override
	public Elemento vs(Elemento elemento) {
		return elemento.vs(this);
	}

	public Elemento vs(Piedra piedra){
		return piedra;
	}
	
	public Elemento vs(Papel papel){
		return this;
	}

	public Elemento vs(Tijera tijera){
		return this;
	}
}
