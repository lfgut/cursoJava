package sobreAbstract;

public class SoyUnaClaseTotal {

	private String color;
	
	//	Si lo necesitamos, estamos obligados a crearlo
	public SoyUnaClaseTotal() {
		super();
	}

	//	Crear un constructor hace desaparecer al constructor por defecto
	public SoyUnaClaseTotal(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "SoyUnaClaseTotal [color=" + color + "]";
	}




	

	
	
}
