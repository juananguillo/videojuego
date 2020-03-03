package net.instituto.desa;

public class Game {
	static final String Abajo = "Abajo";
	static final String Arriba = "Arriba";
	static final String Izquierda = "Izquierda";
	static final String Derecha = "Derecha";
	
	
	public static void main(String[] args) {
		Jugador j=new Jugador(1,2);
		j.movimiento(Izquierda);
		System.out.print(j.toString());
	}
	}
	
	




