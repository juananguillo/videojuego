package net.instituto.desa;

public class Game {
	Jugador j;

	public void movimiento(String m) {
		if (m.equalsIgnoreCase("Derecha")) {
			j.setX(j.getX() + 1);
		}
		if (m.equalsIgnoreCase("Izquierda")) {
			j.setX(j.getX() - 1);
		}
		if (m.equalsIgnoreCase("Arriba")) {
			j.setY(j.getY() - 1);
		}
		if (m.equalsIgnoreCase("Abajo")) {
			j.setY(j.getY() + 1);
		}
	}
}
