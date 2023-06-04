package Herencia;

public class LibrosDeTexto extends Libros{
    private String asignatura;

    public LibrosDeTexto() {
        super();
    }

    public LibrosDeTexto(String titulo, Autor autor, String editorial, 
            double precio,String asignatura) {
        super(titulo, autor, editorial, precio);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibrosDeTexto: " 
                + "\nasignatura=" + asignatura ;
    }
    
    
}
