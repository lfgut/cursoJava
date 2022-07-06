package lonjaApp.apoyo;

import java.util.Random;

import lonjaApp.especificaciones.IValorable;

public class CajaPanga extends CajaFrutaDiMare 
	implements IValorable{
	
	final static float PRECIO_MIN = 25;
	final static float PRECIO_MAX = 30;
	
	//	Se valora por caja
	private boolean estaValorada = false;
	private float valor = 0;
	
	public CajaPanga() {
		super();
	}

	@Override
	public boolean estaValorada() {
		return estaValorada;
	}

	@Override
	public float valorar() {
		if (!estaValorada()) {
			estaValorada = true;
			//	calculamos precio por unidad 6 - <11
			valor = (new Random())
					.nextFloat(PRECIO_MAX-PRECIO_MIN)+PRECIO_MIN;
		}
		return valor;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("\nCaja de Panga");
		if (estaValorada) sb.append("Valorada en: " + valor);
		return sb.toString();	
	}
	
}
