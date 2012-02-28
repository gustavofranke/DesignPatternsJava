package structurals.proxy2;

public class Client {
	public static void main(String[] args) {
		Person obj = new Proxy();

		obj.setName("Juan Pelotas"); // este es el momento en que se crea
		// verdaderamente el objeto pero ya puedo
		// ocupar sus metodos.
		obj.imprimir();
		
	}
}
