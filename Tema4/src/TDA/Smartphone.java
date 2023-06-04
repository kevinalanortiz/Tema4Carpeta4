package TDA;

import EntradaSalida.Tools;
import TDA.Chip;

public class Smartphone {
    
    private String modelo;
    private Bateria bateria;
    private int i;
    private Chip chips[];

    public Smartphone(){}
    
    public Smartphone(String modelo,int miniAmperios, String marca, String tipoConector) {
        this.modelo = modelo;
        this.bateria =new Bateria(miniAmperios,tipoConector,marca);
        this.chips =new Chip[2];
        this.i=0;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    public void agregarChip(Chip chip){
        if(i<chips.length-1)
        {
            chips[i]=chip;
            i++;
        }else
            Tools.salidaError("No se pueden insertar mas chips");
        }
    }



    
   


