package taller.implementacion;

import taller.modelo.Arreglable;
import taller.modelo.Vehiculo;

public class Moto extends Vehiculo implements Arreglable {

	/*
	enum TipoMotor {
		Motor2Tiempos, Motor4Tiempos;
	}
	*/
	
	private boolean cadenaNueva = false;
	private String tipoDeMotor = "4T";
	
	public Moto(String marca, String modelo, int cilindrada, String tipoDeMotor) {
		super(marca, modelo, cilindrada);
		this.setTipoDeMotor( tipoDeMotor );
	}

	@Override
	public boolean estaRoto() { return !isCadenaNueva(); }

	@Override
	public boolean estaArreglado() { return !estaRoto(); }

	public boolean isCadenaNueva() { return cadenaNueva; }

	private void setCadenaNueva() { this.cadenaNueva = true; }

	public String getTipoDeMotor() { return tipoDeMotor; }

	private void setTipoDeMotor(String tipoDeMotor) {
		if (tipoDeMotor == "2T" || tipoDeMotor == "4T") {
			this.tipoDeMotor = tipoDeMotor;
		}
	}

	@Override
	public boolean arreglar() {
		boolean loHemosArreglado = false;
		if (!isCadenaNueva()) {
			setCadenaNueva();
			loHemosArreglado = true;
		}
		return loHemosArreglado;
	}
	
	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder( super.toString() );
		stb.append(" mi motor es de " + getTipoDeMotor());
		stb.append(" y mi cadena" + (isCadenaNueva()?"":" no") + " está nueva");
		return stb.toString();
	}
}