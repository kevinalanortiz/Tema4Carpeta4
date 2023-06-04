package Test;

import Abstractas.Cuadrado;
import Abstractas.Figura;
import Abstractas.Rectangulo;
import Abstractas.Triangulo;
import EntradaSalida.Tools;

public class TestFiguras {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String sel = "";
        Figura arrFig[]=new Figura[10];
        int j=0;
        do {
            sel = Tools.boton("Triangulo,Cuadrado,Rectangulo,Imprimir,Salir");

            switch (sel) {
                case "Triangulo":
                    if(j<10){
                        Figura Triangulo=new Triangulo("Triangulo","Rojo",Tools.leerInt("Ingrese la base"),Tools.leerInt("Ingrese la altura"));
                        arrFig[j]=Triangulo;
                        j++;
                    }else{
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    
                    break;
                case "Cuadrado":
                   if(j<10){
                        Figura Cuadrado=new Cuadrado("Cuadrado","Azul",Tools.leerInt("Ingrese un lado"));
                        arrFig[j]=Cuadrado;
                        j++;
                    }else{
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    break;
                case "Rectangulo":
                    if(j<10){
                        Figura Rectangulo=new Rectangulo("Rectangulo","Negro",Tools.leerInt("Ingrese un la base"),Tools.leerInt("Ingrese la altura"));
                        arrFig[j]=Rectangulo;
                        j++;
                    }else{
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    break; 
                case "Imprimir":
                    String Acu=" ";
                    for(int i=0;i<j;i++){
                        Acu+="\n"+arrFig[i];
                        
                    }
                    Tools.imprimePantalla(Acu);
                    break;
                case "Salir":
                    break;
                
            }
        } while (!sel.equalsIgnoreCase("Salir"));
    }
}
