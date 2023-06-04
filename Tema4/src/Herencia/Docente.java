package Herencia;

public class Docente extends Usuario{
    private byte antiguedad;
    private String gradoAcademico;

    public Docente() {
        super();
    }

    public Docente(String nom, String appat, String apmat, byte edad, String depto,byte antiguedad, String gradoAcademico) {
        super(nom, appat, apmat, edad, depto);
        this.antiguedad = antiguedad;
        this.gradoAcademico = gradoAcademico;
    }

    public byte getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(byte antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public String toString() {
        return super.toString()+"Docente{" + "antiguedad=" + antiguedad + ", gradoAcademico=" + gradoAcademico + '}';
    }
    
    
    
}
