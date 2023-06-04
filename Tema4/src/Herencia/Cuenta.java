package Herencia;

import EntradaSalida.Tools;

public class Cuenta {
    protected float saldo;
    protected float tasaAnual;
    protected byte numConsig=0;
    protected byte numRetiros=0;
    protected float comiMensual=0;

    public Cuenta() {}

    public Cuenta(float saldo, float tasaAnual) {
        
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
        
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTasaAnual(float tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public float getSaldo() {
        return saldo;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }

    public byte getNumConsig() {
        return numConsig;
    }

    public byte getNumRetiros() {
        return numRetiros;
    }

    public float getComiMensual() {
        return comiMensual;
    }
    
    public void depositarCuenta (float cantidad){
    
        saldo+=cantidad;
        numConsig++;
        
    }
    public void retirarCuenta(float cantidad){
        if(cantidad<=saldo){
            saldo-=cantidad;
            numRetiros++;
        }
        else 
            Tools.salidaError("Lo siento, la cantidad a retirar excede tu saldo");
            
    }
    
    
    public void calcularInteresMensual(){
    float tasaMensual = tasaAnual / 12;
    saldo += saldo * tasaMensual;
    
    }
    public void extractoMensual() {
        saldo -= comiMensual;
        calcularInteresMensual();
  
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + "\nTasa Anual: " + tasaAnual +"\nNúmero de Consignaciones: " + numConsig +"\nNúmero de Retiros: " + numRetiros +"\nComisión Mensual: " + comiMensual;
    
    }
}
    
    

