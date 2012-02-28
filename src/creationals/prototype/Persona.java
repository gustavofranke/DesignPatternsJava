package creationals.prototype;

public class Persona implements Cloneable{
	
    private String nombres;
    private String appellidos;
    private String nombrePadre;
    private String nombreMadre;
    private String direccion;
    private String telCasa;
    private String nacionalidad;
    private String ciudadEnQueVive;
    private String nombreMascota;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
    public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getAppellidos() {
		return appellidos;
	}
	public void setAppellidos(String appellidos) {
		this.appellidos = appellidos;
	}
	public String getNombrePadre() {
		return nombrePadre;
	}
	public void setNombrePadre(String nombrePadre) {
		this.nombrePadre = nombrePadre;
	}
	public String getNombreMadre() {
		return nombreMadre;
	}
	public void setNombreMadre(String nombreMadre) {
		this.nombreMadre = nombreMadre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelCasa() {
		return telCasa;
	}
	public void setTelCasa(String telCasa) {
		this.telCasa = telCasa;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getCiudadEnQueVive() {
		return ciudadEnQueVive;
	}
	public void setCiudadEnQueVive(String ciudadEnQueVive) {
		this.ciudadEnQueVive = ciudadEnQueVive;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
  
	 public Persona creaPrototipo(){
	        Persona p = new Persona();
	        p.setNombres(this.nombres);
	        p.setAppellidos(this.appellidos);
	        p.setNombrePadre(this.nombrePadre);
	        p.setNombreMadre(this.nombreMadre);
	        p.setDireccion(this.direccion);
	        p.setTelCasa(this.telCasa);
	        p.setNacionalidad(this.nacionalidad);
	        p.setCiudadEnQueVive(this.ciudadEnQueVive);
	        p.setNombreMascota(this.nombreMascota);
	        return p;
	    }
}
