package taller.implementacion;

import taller.modelo.*;

public class Coche extends Vehiculo implements Arreglable{

	private boolean puertasEngrasada = false;	
	private int numeroPuertas = 4;

	
	public Coche(String marca, String modelo, int cilindrada, int numeroPuertas) {
		super( marca, modelo, cilindrada );
		this.setNumeroPuertas( numeroPuertas );
	}

	@Override
	public boolean estaRoto() { return !estanPuertasEngrasadas(); }

	@Override
	public boolean estaArreglado() { return !estaRoto(); }

	@Override
	public boolean arreglar() {
		boolean loHemosArreglado = false;
		if ( !estanPuertasEngrasadas() ) {
			engrasarPuertas();
			loHemosArreglado = true;
		}
		return loHemosArreglado;
	}

	
	public boolean estanPuertasEngrasadas() { return puertasEngrasada; }

	private void engrasarPuertas() { puertasEngrasada = true; }

	public int getNumeroPuertas() { return numeroPuertas; }

	private void setNumeroPuertas(int numeroPuertas) {
		if ( numeroPuertas >= 2 && numeroPuertas <= 5 ) {
			this.numeroPuertas = numeroPuertas;
		}
	}

	@Override
	public String toString() {
		return super.toString() +
				" tengo " + getNumeroPuertas() + " puertas" +
				" y" + (estanPuertasEngrasadas()?" ya":" no") + " están engrasadas";
		/*		
		StringBuilder stb = new StringBuilder( super.toString() );
		stb.append(" tengo " + getNumeroPuertas() + " puertas");
		stb.append(" y" + (estanPuertasEngrasadas()?" ya":" no") + " están engrasadas");
		return stb.toString();
		*/
	}
	
}
