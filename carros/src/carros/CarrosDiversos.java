package carros;

public class CarrosDiversos {

	public static void main(String[] args) 
	
	{
	Carros carro1 = new Carros ();
	
    carro1.chassi = "1783DFU9075SDC";
    carro1.modelo = "Ford";
    carro1.qndPortas = 4;
    carro1.acelerar();
    
    Carros carro2 = new Carros();
    carro2.chassi = "1783DFU9075SPO";
    carro2.modelo = "Chevrolet";
    carro2.qndPortas = 2;
    carro2.acelerar();
    
    Carros carro3 = new Carros();
    carro3.chassi = "1783DFU9075TTO";
    carro3.modelo = "Hyndai";
    carro3.qndPortas = 5;
    carro3.acelerar();
    
	}

}
