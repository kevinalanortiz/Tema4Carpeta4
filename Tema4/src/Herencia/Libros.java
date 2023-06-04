package Herencia;

public class Libros {
    protected String titulo;
    protected Autor autor;
    protected String editorial;
    protected double precio;

    public Libros() {
        
    }

    public Libros(String titulo, Autor autor, String editorial, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libros: " + "\ntitulo=" + titulo + "\nautor=" + autor 
                + "\neditorial=" + editorial + "\nprecio=" + precio ;
    }

    
}
