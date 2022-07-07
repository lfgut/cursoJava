package pajaros;

public class Bird {
	
	public void fly() { System.out.println("Pájaro volando");}

	public static void main(String[] args) {
		Bird bird = new Pelican();
		
		bird.fly();
		
	}
}

class Pelican extends Bird{
	
	//	Falla aqui al compilar porque no se puede reducir el acceso a métodos de la superclase
	// private void fly() { System.out.println("Pelícano volando");}
	
	public void fly() { System.out.println("Pelícano volando");}
	
}
