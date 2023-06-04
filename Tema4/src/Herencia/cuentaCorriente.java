package Herencia;

import EntradaSalida.Tools;

public class cuentaCorriente extends Cuenta{
    private float sobregiro;

    public cuentaCorriente() {
        super();
    }

    public cuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        
    }
    public void setSobregiro(float sobregiro) {
        this.sobregiro = sobregiro;
    }

    public float getSobregiro() {
        return sobregiro;
    }
    public void retirarCuenta(float cantidad) {
        if (cantidad <= saldo + sobregiro) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
            } else {
                sobregiro -= (cantidad - saldo);
                saldo = 0;
            }
            numRetiros++;
        } else {
            Tools.imprimeSalida("Lo siento, la cantidad a retirar excede el saldo y el sobregiro.");
        }
    }
    public void depositarCuenta(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad <= sobregiro) {
                sobregiro -= cantidad;
            } else {
                saldo += (cantidad - sobregiro);
                sobregiro = 0;
            }
        } else {
            saldo += cantidad;
        }
        numConsig++;
    }
    public void extractoMensual() {
        if (numRetiros > 4) {
        comiMensual = (numRetiros - 4) * 200;
    }
    saldo -= comiMensual;
    if (saldo < 0) {
        sobregiro -= comiMensual;
    }
    calcularInteresMensual();
}

    @Override
    public String toString() {
        return super.toString()+"\ncuentaCorriente{" + "\nsobregiro=" + sobregiro + '}';
    }
    
    
}
