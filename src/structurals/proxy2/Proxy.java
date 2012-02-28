package structurals.proxy2;

public class Proxy implements Person {

	Employee emp;
	@Override
	public void imprimir() {
		if(emp == null){
			emp = new Employee();
		}
		emp.imprimir();
	}

	@Override
	public String getName() {
		if(emp == null){
			emp = new Employee();
		}
		return emp.getName();
	}

	@Override
	public void setName(String nombre) {
		if(emp == null){
			emp = new Employee();
		}
		emp.setName(nombre);
	}



}
