package trycatch;

public class TryCatchError {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (Exception ex) {
			System.out.print("B");
		} finally {
			System.out.print("C Esto SIEMPRE SE EJECUTA ");
			System.out.println("Que nos vaaamos");
		}
		System.out.print("D");
	}

	public static void badMethod() {
		throw new Error();
	}
}
