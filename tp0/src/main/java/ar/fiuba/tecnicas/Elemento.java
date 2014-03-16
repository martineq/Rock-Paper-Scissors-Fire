package main.java.ar.fiuba.tecnicas;

public class Elemento {

	private int tipoElemento;	// 1: Piedra, 2: Papel, 3: Tijera

	public Elemento(int tipo) { 
		this.tipoElemento = tipo;	 
	}

	public boolean equals(Object otro){
		return ( this.tipoElemento == ((Elemento)otro).tipoElemento );
	}

	public Elemento vs(Elemento elemento) {	
		return (new Elemento(Math.max(this.tipoElemento,elemento.tipoElemento)*( (this.tipoElemento+elemento.tipoElemento) % 2 ) + Math.min(this.tipoElemento,elemento.tipoElemento)*( 1 - ( (this.tipoElemento+elemento.tipoElemento) % 2 ) )));
	}

}
