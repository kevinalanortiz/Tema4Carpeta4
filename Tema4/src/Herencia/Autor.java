package Herencia;

public class Autor {
    private String Nombre;
	private String Apellido;
	
	public Autor () {}
	public Autor(String Nombre,String Apellido) {
		
		this.Nombre=Nombre;
		this.Apellido=Apellido;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	public String toString(){
		return " "+Nombre+" "+Apellido;
	}
}