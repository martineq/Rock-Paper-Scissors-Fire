package main.java.ar.fiuba.tecnicas;

public interface Elemento {
	Elemento vs(Elemento elemento);
	
	public Elemento vs(Papel papel);

	public Elemento vs(Piedra piedra);
	
	public Elemento vs(Tijera tijera);
}
