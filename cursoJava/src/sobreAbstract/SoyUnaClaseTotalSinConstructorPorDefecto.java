package sobreAbstract;

public class SoyUnaClaseTotalSinConstructorPorDefecto {

	private String color;
	
	/*
	public SoyUnaClaseTotal() {
		super();
		// TODO Auto-generated constructor stub
	}
*/
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SoyUnaClaseTotalSinConstructorPorDefecto [color=" + color + "]";
	}


	

	
	
}
