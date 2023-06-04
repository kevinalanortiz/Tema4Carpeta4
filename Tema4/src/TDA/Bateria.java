package TDA;

class Bateria {
    private int miniAmperios;
    private String marca;
    private String tipoConector;

    public Bateria(){}
    
    public Bateria(int miniAmperios, String marca, String tipoConector) {
        this.miniAmperios = miniAmperios;
        this.marca = marca;
        this.tipoConector = tipoConector;
    }

    public int getMiniAmperios() {
        return miniAmperios;
    }

    public void setMiniAmperios(int miniAmperios) {
        this.miniAmperios = miniAmperios;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    @Override
    public String toString() {
        return "Bateria{" + "miniAmperios=" + miniAmperios + ", marca=" + marca + ", tipoConector=" + tipoConector + '}';
    }
    
    
}
