package sobreAbstract;

//		De esta clase no se puede extender
public final class ClaseFinal {

	private String color;
	// es una constante, no la podemos modificar
	// debería estar en Mayúsculas
	private final String MODELO ="grande";

	public String getMODELO() {
		return MODELO;
	}

	public void setMODELO(String modelo) {
		/*		No
		this.modelo = modelo;
		*/
	}

	//		Este método no se puede Sobre-escribir (Overrrides)
	public final String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SoyUnaClaseFinal [color=" + color + "]";
	}




	

	
	
}
