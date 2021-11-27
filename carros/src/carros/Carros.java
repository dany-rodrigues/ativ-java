package carros;

public class Carros 
{
	String chassi;
	String modelo;
	int qndPortas;
	
	
	public void acelerar() {
		
		if (qndPortas == 2)
			System.out.println("O carro não pode ultrapassar 60km." );
		
		else if (qndPortas == 4)
			System.out.println("O carro não pode ultrapassar 110km.");
		else 
			System.out.println("O carro não pode ultrapassar 110km.");
		
		
	}

    public void frear() {
    	
    }
}

