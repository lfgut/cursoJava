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
		
		//	Clase que tiene un metodo abstracto
		/*
		SoyUnaClaseTotalAbstractaPorQueMeFaltaCodigo sctpmc =
				new SoyUnaClaseTotalAbstractaPorQueMeFaltaCodigo();
		sctpmc.setColor("Amarillo");
		System.out.println(sctpmc);
		*/
		
		//	Sí puedo instanciar una clase que extienda una abstracta
		//	si pongo el código que falta
		ImplementoElCodigo ic = new ImplementoElCodigo();
		ic.setColor("Ambar");
		System.out.println(ic);
		
		//	Esta clase es abstracta porque le da la gana
		/*
		SoyUnaClaseTotalAbstractaPorqueMeDaLaGana scapmlg =
				new SoyUnaClaseTotalAbstractaPorqueMeDaLaGana();
		scapmlg.setColor("Naranja");
		System.out.println(scapmlg);
		*/
		
		//	Esta clase extiende de la abstracta porque me da la gana
		ImplementoElCodigoDeLaCAbstractaPMDLG icpmdlg =
				new ImplementoElCodigoDeLaCAbstractaPMDLG();
		icpmdlg.setColor("Marron");
		System.out.println(icpmdlg);
		
		//	Intentamos instanciar la interface
		//InterfaceMarcador im = new InterfaceMarcador();
		ClaseParaPoderInstanciarLaInterface cpii =
				new ClaseParaPoderInstanciarLaInterface();
		System.out.println(cpii);
		
		// Instanciamos la interface al vuelo
		InterfaceMarcador im = new InterfaceMarcador() {};
		System.out.println(im);
		
		//	Instanciamos la interface con metodo
		InterfaceConMetodo icm = new InterfaceConMetodo() {
			
			@Override
			public void pintar() {
				System.out.println("Hoola, soy anónima ...");
				
			}
		};

		icm.pintar();
		
		new InterfaceConMetodo() {
			@Override
			public void pintar() {
				System.out.println("Aún más anónima");	
			}
		}.pintar();

		ClaseFinal cf = new ClaseFinal();
		cf.setColor("Violeta");
		System.out.println(cf);
		
		
	}

}
