package Abstractas;

public class cuboide {
    private double ancho;
    private double alto;
    private double profundo;

    public cuboide() {
        this.ancho=0;
        this.alto=0;
        this.profundo=0;
    }

    public cuboide(double media) {
        this.ancho=media;
        this.alto=media;
        this.profundo=media;
    }

    public cuboide(double ancho, double alto, double profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

}
