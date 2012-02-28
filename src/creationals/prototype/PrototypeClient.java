package creationals.prototype;

public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {
		Persona juan = new Persona();
        juan.setNombres("Juan Jos�");
        juan.setAppellidos("P�rez Ramirez");
        juan.setNombrePadre("Juan P�rez Martinez");
        juan.setNombreMadre("Mar�a Ramirez");
        juan.setDireccion("9a. Ave. 43-12 Z.1");
        juan.setTelCasa("34567890");
        juan.setNacionalidad("Guatemalteca");
        juan.setCiudadEnQueVive("Guatemala");
        juan.setNombreMascota("Pepito");
 
        System.out.println("juan.toString() "+juan.toString());
 
        Persona maria = (Persona)juan.clone();
 
        maria.setNombres("Mar�a In�s");
        System.out.println("maria.toString():"+maria.toString());

        System.out.println("*******************************");
        Persona maria2 = juan.creaPrototipo();
        System.out.println("maria2.toString() :"+maria2.toString());
	}

}
