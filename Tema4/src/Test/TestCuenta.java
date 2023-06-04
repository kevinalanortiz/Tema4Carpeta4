package Test;

import EntradaSalida.Tools;
import Herencia.cuentaCorriente;
import Herencia.cuentaDeAhorros;

public class TestCuenta {
    public static void main(String [] args){
        
        menu("Cuenta Corriente,Cuenta de Ahorro,Salir");
        
    }
    public static void menu(String menu)
    {
        String sel="";
        do {
            sel=Tools.boton(menu);
            switch(sel){
                case "Cuenta Corriente":
                String cc = "Depositar,Retirar,Extracto Mensual,Imprimir,Salir";
                menuCC(cc);
                break;
                case "Cuenta de Ahorro":
                String ca = "Depositar,Retirar,Extracto Mensual,Imprimir,Salir";
                menuCA(ca);
                break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
    public static void menuCA(String menu)
    {
        cuentaDeAhorros ca = new cuentaDeAhorros(15000, (float)2.5);
        String sel="";
        do {
            sel=Tools.boton(menu);
            switch(sel){
                case "Depositar":
                    Tools.imprimePantalla(ca.toString());
                    ca.depositarCuenta(Tools.leerFloat("Ingrese la cantidad a depoitar en la cuenta."));
                break;
                case "Retirar":
                    Tools.imprimePantalla(ca.toString());
                    ca.retirarCuenta(Tools.leerFloat("Ingrese la cantidad que desea retirar:"));
                break;
                case "Extracto Mensual":
                    ca.extractoMensual();
                    Tools.imprimePantalla(ca.toString());
                break;
                case "Imprimir":
                    Tools.imprimePantalla(ca.toString());
                break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }
    public static void menuCC(String menu)
    {
        cuentaCorriente cc = new cuentaCorriente(15000, (float)2.5);
        String sel="";
        do {
            sel=Tools.boton(menu);
            switch(sel){
                case "Depositar":
                    Tools.imprimePantalla(cc.toString());
                    cc.depositarCuenta(Tools.leerFloat("Ingrese la cantidad a depoitar en la cuenta."));
                break;
                case "Retirar":
                    Tools.imprimePantalla(cc.toString());
                    cc.retirarCuenta(Tools.leerFloat("Ingrese la cantidad que desea retirar:"));
                break;
                case "Extracto Mensual":
                    cc.extractoMensual();
                    Tools.imprimePantalla(cc.toString());
                    break;
                case "Imprimir":
                    Tools.imprimePantalla(cc.toString());
                break;
                case "Salir":;  break;
            }
        }while(!sel.equalsIgnoreCase("Salir"));
    }


}
