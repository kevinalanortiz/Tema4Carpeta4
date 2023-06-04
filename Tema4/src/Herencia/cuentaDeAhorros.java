package Herencia;

public class cuentaDeAhorros extends Cuenta{
    private boolean activa;

    public cuentaDeAhorros() {
    super();
    }
    public cuentaDeAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        activa=(saldo>=1000)?false:true;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    public void depositarCuenta(float cantidad){
        if(activa){
            super.depositarCuenta(cantidad);
        }
    }
    public void retirarCuenta(float cantidad){
        if(activa){
            super.retirarCuenta(cantidad);
        }
        
    }
    public void extractoMensual(){
       
        calcularInteresMensual(); // Primero calcular el interés mensual
        saldo -= comiMensual; // Restar la comisión mensual al saldo
        if (numRetiros > 4) {
        comiMensual += (numRetiros - 4) * 200;
        }
        if (saldo < 10000) {
        activa = false;
    }
}


    @Override
    public String toString() {
        return super.toString()+"\ncuentaDeAhorros{" + "\nactiva=" + activa + '}';
    }
    
}
