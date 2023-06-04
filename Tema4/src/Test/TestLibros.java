package Test;

import EntradaSalida.Tools;
import Herencia.Autor;
import Herencia.Fecha;
import Herencia.LibroNovela;
import Herencia.LibrosDeTexto;
import Herencia.LibrosTextoTECNM;

public class TestLibros {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String sel = "";
        do {
            sel = Tools.boton("Crear Libro de Texto,Crear Libro de Novela,Salir");

            switch (sel) {
                case "Crear Libro de Texto":
                    menuLibrosDeTexto();
                    break;
                case "Crear Libro de Novela":
                    crearLibroDeNovela();
                    break;
                case "Salir":
                    break;
                
            }
        } while (!sel.equalsIgnoreCase("Salir"));
    }
    public static void menuLibrosDeTexto() {
        String sel;
        sel = Tools.boton("Libro de Texto,Libro de Texto TECNM");

        switch (sel) {
            case "Libro de Texto":
                crearLibroDeTexto();
                break;
            case "Libro de Texto TECNM":
                crearLibroDeTextoTECNM();
                break;
            
        }
    }

    public static void crearLibroDeTexto() {
        
        String titulo = Tools.leerString("Ingrese el título del libro de texto");
        String nombreAutor = Tools.leerString("Ingrese el nombre del autor");
        String apellidoAutor = Tools.leerString("Ingrese el apellido del autor");
        Autor autor = new Autor(nombreAutor, apellidoAutor);
        String editorial = Tools.leerString("Ingrese la editorial");
        double precio = Tools.leerDouble("Ingrese el precio");
        String asignatura = Tools.leerString("Ingrese la asignatura");
        

        LibrosDeTexto libroTexto = new LibrosDeTexto(titulo, autor, editorial, precio, asignatura);
        Tools.imprimePantalla(libroTexto.toString());
    }

    public static void crearLibroDeNovela() {
        
        String titulo = Tools.leerString("Ingrese el título del libro de novela");
        String nombreAutor = Tools.leerString("Ingrese el nombre del autor");
        String apellidoAutor = Tools.leerString("Ingrese el apellido del autor");
        Autor autor = new Autor(nombreAutor, apellidoAutor);
        String editorial = Tools.leerString("Ingrese la editorial");
        double precio = Tools.leerDouble("Ingrese el precio");
        String genero = Tools.leerString("Ingrese el género de la novela");

        LibroNovela libroNovela = new LibroNovela(titulo, autor, editorial, precio, genero);
        Tools.imprimePantalla(libroNovela.toString());
    }
    public static void crearLibroDeTextoTECNM() {
        
        String titulo = Tools.leerString("Ingrese el título del libro de texto");
        String nombreAutor = Tools.leerString("Ingrese el nombre del autor");
        String apellidoAutor = Tools.leerString("Ingrese el apellido del autor");
        Autor autor = new Autor(nombreAutor, apellidoAutor);
        String editorial = Tools.leerString("Ingrese la editorial");
        double precio = Tools.leerDouble("Ingrese el precio");
        String asignatura = Tools.leerString("Ingrese la asignatura");
        String campus = Tools.leerString("Ingrese el campus");
        byte dia = Tools.leerByte("Ingrese el día de la fecha");
        byte mes = Tools.leerByte("Ingrese el mes de la fecha");
        int año = Tools.leerInt("Ingrese el año de la fecha");
        Fecha fecha = new Fecha(dia, mes, año); 

        LibrosTextoTECNM libroTextoTECNM = new LibrosTextoTECNM(titulo, autor, editorial, precio, asignatura, campus, fecha);
        Tools.imprimePantalla(libroTextoTECNM.toString());
    }
}