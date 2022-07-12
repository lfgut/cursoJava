package carrerasdecoches.apoyo;

public abstract class Maleta {
	private String contenido;

	public Maleta(String contenido) {
		super();
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Maleta [contenido=" + contenido + "]";
	}
	
	
	
}
