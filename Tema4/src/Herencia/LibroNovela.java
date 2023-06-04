package Herencia;

public class LibroNovela extends Libros{
    private String genNovela;

    public LibroNovela() {
        super();
    }

    public LibroNovela(String titulo, Autor autor, String editorial, 
            double precio,String genNovela) {
        super(titulo, autor, editorial, precio);
        this.genNovela = genNovela;
    }

    public String getGenNovela() {
        return genNovela;
    }

    public void setGenNovela(String genNovela) {
        this.genNovela = genNovela;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLibroNovela: " + "\ngenNovela=" + genNovela ;
    }
    
    
}
