package Test;

import TDA.Smartphone;
import TDA.Chip;
import EntradaSalida.Tools;

public class PruebaSmartphone {
    
public static void main (String [] args) {
	Smartphone celPedro = new Smartphone("JPRO",3400,"Samsung","MicroUSB");
	Chip telcel= new Chip("Telcel",45678978,"Micro");
	Chip unefon= new Chip("Unefon",4136896,"Micro");
	Chip rad= new Chip("Rad",4236896,"Micro");
	
	celPedro.agregarChip(telcel);
	celPedro.agregarChip(unefon);
	celPedro.agregarChip(rad);
	
	Tools.imprimeSalida(""+celPedro.toString());
}
}