package Abstractas;

public class Cuadrado extends Figura{
    
    private int lado;

    public Cuadrado(String nom, String col,int lado) {
        super(nom, col);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    public double area(){
        return Math.pow(lado, 2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nCuadrado{" + "\nlado=" + lado +"\narea="+area()+ '}';
    }
    
}
