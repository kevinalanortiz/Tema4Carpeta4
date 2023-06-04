package Abstractas;

public class Rectangulo extends Figura{
    private int base;
    private int altura;

    public Rectangulo(String nom, String col,int base, int altura) {
        super(nom, col);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double area(){
        return base*altura;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRectangulo{" + "\nbase=" + base + "\naltura=" + altura + "\narea="+area()+'}';
    }
    
}
