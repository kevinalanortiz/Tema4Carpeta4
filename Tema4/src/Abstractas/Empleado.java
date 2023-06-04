package Abstractas;

public abstract class Empleado {
    protected String primerNombre;
    protected String apellidoPaterno;
    protected String numeroSeguroSocial;

    public Empleado(String nombre, String apellido,String nss){
        numeroSeguroSocial = nss;
        primerNombre = nombre;
        apellidoPaterno = apellido;
        } 

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setNumeroSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String toString() {
        return "Empleado [Nombre=" + primerNombre 
                + ", apellidoPaterno=" +apellidoPaterno+ ", numeroSeguroSocial=" 
                + numeroSeguroSocial + "]";
    }
    public abstract double ingresos(); 
}
