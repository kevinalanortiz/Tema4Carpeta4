package Test;

import EntradaSalida.Tools;
import Abstractas.Empleado;
import Abstractas.EmpleadoAsalariado;
import Abstractas.EmpleadoPorComision;
import Abstractas.EmpleadoPorHoras;
import Abstractas.EmpleadoBaseMasComision;

public class TestEmpleado {
    private static Empleado arrEmpleado[] = new Empleado[10];
    private static EmpleadoBaseMasComision arrEmpleadoBaseMasComision[] = new EmpleadoBaseMasComision[10];
    private static int j = 0;

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String sel = "";
        do {
            sel = Tools.boton("Empleado Asalariado,Empleado Por Comision,"
                    + "Empleado Por Horas,Imprimir,Salir");

            switch (sel) {
                case "Empleado Asalariado":
                    if (j < 10) {
                        EmpleadoAsalariado EmpleAsal = new EmpleadoAsalariado(Tools.leerString("Ingresar nombre"), Tools.leerString("Ingresa apellido"), Tools.leerString("Ingrese numero de seguro social"), Tools.leerDouble("Ingrese el salario"));
                        arrEmpleado[j] = EmpleAsal;
                        j++;
                    } else {
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    break;
                case "Empleado Por Comision":
                    if (j < 10) {
                        EmpleadoPorComision EmplePorComision = new EmpleadoPorComision(Tools.leerString("Ingrese nombre"), Tools.leerString("Ingrese apellido"), Tools.leerString("Ingrese numero de seguro social"), Tools.leerDouble("Ingrese el numero de ventas"), Tools.leerDouble("Ingrese la tarifa"));
                        arrEmpleado[j] = EmplePorComision;
                        j++;
                        String op = Tools.boton2("Sí,No");
                        if (op.equals("Sí")) {
                            menuEmpleadoBaseMasComision();
                        }
                    } else {
                        Tools.imprimePantalla("No puedes ingresar más datos");
                    }
                    break;
                case "Empleado Por Horas":
                    if (j < 10) {
                        EmpleadoPorHoras EmplePorHrs = new EmpleadoPorHoras(Tools.leerString("Ingrese nombre"), Tools.leerString("Ingrese apellido"), Tools.leerString("Ingrese numero de seguro social"), Tools.leerDouble("Ingrase sueldo por horas"), Tools.leerDouble("Ingrese las horas trabajadas"));
                        arrEmpleado[j] = EmplePorHrs;
                        j++;
                    } else {
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    break;
                case "Imprimir":
                    String Acu=" ";
                    for(int i=0;i<j;i++){
                        Acu+="\n"+arrEmpleado[i];
                        
                    }
                    Tools.imprimePantalla(Acu);
                    break;
                case "Salir":
                    break;
            }
        } while (!sel.equalsIgnoreCase("Salir"));
    }

    public static void menuEmpleadoBaseMasComision() {
        String sel = "";
        do {
            sel = Tools.boton("Empleado Base Mas Comision,Imprimir,Regresar");

            switch (sel) {
                case "Empleado Base Mas Comision":
                    if (j < 10) {
                        EmpleadoPorComision EmplePorComision = new EmpleadoPorComision(Tools.leerString("Ingrese nombre"), Tools.leerString("Ingrese apellido"), Tools.leerString("Ingrese numero de seguro social"), Tools.leerDouble("Ingrese el numero de ventas"), Tools.leerDouble("Ingrese la tarifa"));
                        double salario = Tools.leerDouble("Ingresar salario");
                        EmpleadoBaseMasComision EmpleBasMasComi = new EmpleadoBaseMasComision(EmplePorComision.getPrimerNombre(), EmplePorComision.getApellidoPaterno(), EmplePorComision.getNumeroSeguroSocial(), EmplePorComision.getVentasBrutas(), EmplePorComision.getTarifaComision(), salario);
                        arrEmpleadoBaseMasComision[j] = EmpleBasMasComi;
                        j++;
                    } else {
                        Tools.imprimePantalla("No puedes ingresar mas datos");
                    }
                    break;
                case "Imprimir":
                    String Acu2 = "";
                       for (int i = 0; i < j; i++) {
                            Acu2 += "\n" + arrEmpleadoBaseMasComision[i];
                    }
                    Tools.imprimePantalla(Acu2);
                    break;
                case "Regresar":
                    break;
            }
        } while (!sel.equalsIgnoreCase("Regresar"));
    }
}