package sobreAbstract;

public class Probando {

	public static void main(String[] args) {
		System.out.println("Estamos probando abstracts");
		
		//	Clase sin constructores aparentes
		SoyUnaClaseTotalSinConstructorPorDefecto sctsc =
				new SoyUnaClaseTotalSinConstructorPorDefecto();
		
		sctsc.setColor("Verde");
		System.out.println(sctsc);
		
		//	Clase total con contructor de campo
		SoyUnaClaseTotal sct = new SoyUnaClaseTotal("Azul");
		System.out.println(sct);
		
		SoyUnaClaseTotal sct2 = new SoyUnaClaseTotal();
		

	}

}
