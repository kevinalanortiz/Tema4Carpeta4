package Herencia;

public class Alumno extends Usuario{
    
    private byte semestre;
    private double promedio;

    public Alumno() {
        super();
    }

    public Alumno(String nom, String appat, String apmat, byte edad, String depto,byte semestre, double promedio) {
        super(nom, appat, apmat, edad, depto);
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public byte getSemestre() {
        return semestre;
    }

    public void setSemestre(byte semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return super.toString()+"Alumno{" + "semestre=" + semestre + ", promedio=" + promedio + '}';
    }
    
    
}
