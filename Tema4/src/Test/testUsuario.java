package Test;

import EntradaSalida.Tools;
import Herencia.Docente;
import Herencia.Alumno;

public class testUsuario {
    public static void main (String [] args) {
	
        Docente docente = new Docente("Maria Jacinta", "Martinez", "Castillo", (byte) 30, "INF", (byte) 10, "Maestría");
        Alumno alumno = new Alumno("Mayte", "Mellado", "Huerta", (byte) 20, "INF", (byte) 4, 9.0);
        
        Tools.imprimeSalida(docente.toString());
        Tools.imprimeSalida(alumno.toString());
    }
}