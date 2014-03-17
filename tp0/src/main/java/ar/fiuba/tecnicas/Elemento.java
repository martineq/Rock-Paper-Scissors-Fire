package main.java.ar.fiuba.tecnicas;

public class Elemento {

	private int tipoElemento;	// 1: Piedra, 2: Papel, 3: Tijera

	public Elemento(int tipo) { 
		this.tipoElemento = tipo;	 
	}

	public boolean equals(Object otro){
		return ( this.tipoElemento == ((Elemento)otro).tipoElemento );
	}

	public Elemento vs(Elemento otro) {	
		return (new Elemento(Math.max(this.tipoElemento,otro.tipoElemento)*( (this.tipoElemento+otro.tipoElemento) % 2 ) + Math.min(this.tipoElemento,otro.tipoElemento)*( 1 - ( (this.tipoElemento+otro.tipoElemento) % 2 ) )));
	}

}
