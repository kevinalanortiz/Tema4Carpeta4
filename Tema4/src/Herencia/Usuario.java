package Herencia;

import EntradaSalida.Tools;

public class Usuario {
    
    protected String idUsuario;
    protected String nom;
    protected String appat;
    protected String apmat;
    protected byte edad;
    protected String depto;

    public Usuario() {
    }

    public Usuario(String nom, String appat, String apmat, byte edad, String depto) {
        this.nom = nom;
        this.appat = appat;
        this.apmat = apmat;
        this.edad = edad;
        this.depto = depto;
        this.idUsuario = crearID();
    }

    

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }
     
    public String crearID(){
        String apellidoPaterno = appat.substring(0,3);
        String nombre = nom.substring(0,2);
        
        if (depto.equals("ISC")) {
            return apellidoPaterno + nombre;
        } else if (depto.equals("INF")) {
            return apellidoPaterno + "_" + nombre;
        }
        
        return "";
    }
    

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nom=" + nom + ", appat=" + appat + ", apmat=" + apmat + ", edad=" + edad + ", depto=" + depto + '}';
    }
    
    
    
}
