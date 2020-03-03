package net.instituto.desa;

public class Jugador {
	int y, x;
	
	
	
	

	public Jugador(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void movimiento(String m) {
		if (m.equalsIgnoreCase(Game.Derecha)) {
			setX(getX() + 1);
		}
		if (m.equalsIgnoreCase(Game.Izquierda)) {
			setX(getX() - 1);
		}
		if (m.equalsIgnoreCase(Game.Arriba)) {
			setY(getY() - 1);
		}
		if (m.equalsIgnoreCase(Game.Abajo)) {
			setY(getY() + 1);
		}
	}

	@Override
	public String toString() {
		return "Jugador [y=" + y + ", x=" + x + "]";
	}

	
	
	
	
}
