package taller.modelo;

public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private int cilindrada;
	
	public Vehiculo( String marca, String modelo, int cilindrada ) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
	}
	
	public String getMarca() { return marca; }
	public void setMarca(String marca) { this.marca = marca; }
	
	public String getModelo() { return modelo; }
	public void setModelo(String modelo) { this.modelo = modelo; }

	public void setCilindrada(int cilindrada) { this.cilindrada = cilindrada; }
	public int getCilindrada() { return cilindrada; }
	
	@Override
	public String toString() {
		StringBuilder stb = new StringBuilder( "Soy " + getClass().getSimpleName() );
		stb.append( " marca " + getMarca() );
		stb.append( " modelo " + getModelo() );
		stb.append( " cilindrada de " + getCilindrada() );
		return stb.toString();
	}


}
