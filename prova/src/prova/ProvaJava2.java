package prova;

import java.util.Scanner;

public class ProvaJava2 {

	public static void main(String[] args) {
		 
		//int contador;
		
		//for (contador = 0; contador < 100; contador ++) {
			//contador = contador +25;
			//System.out.println("Recode");
		//}
		
		//int idad = 12;
		
		//if (idad <18) {
			//System.out.println("menor de idade");
		//} else if (idad >= 18)
		//	System.out.println("Maior de idade");
			
		
		int quantidadedeNotas =5;
		
		String string = "xpxs";
		
		Scanner teclado = new Scanner(System.in);
		int nota = 0;
	    int soma = 0;		
	    double media = 0;
	    
	    for (int i = 1 ; i <= quantidadedeNotas ; i++)
	    { 
	    nota = teclado.nextInt();
	    soma = soma + nota;
	    }
	    
	    media = soma/5;
	    
	    
	    if (media >6 ) {
	    	System.out.println("sua media foi "+ media+ "  aprovado" );
	    } else {
	    	System.out.println("sua media foi " + media+ "  reprovado");
	    }
	    System.out.println("Soma dos valores ="+ soma);
	    System.out.println("Media dos valores ="+ media);
	    teclado.close();
		}

	

}
