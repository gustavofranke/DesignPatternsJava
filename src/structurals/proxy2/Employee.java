package structurals.proxy2;

public class Employee implements Person {

	String nombre;
	
	public Employee(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Employee() {
		
	}
	@Override
	public void imprimir() {
		System.out.println("Me llamo " + nombre);
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public void setName(String nombre) {
		this.nombre = nombre;
		
	}



}
