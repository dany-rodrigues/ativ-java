package revisaoexercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
        
		int n;
		int n1 = 0;
		
		System.out.println("Digite um número para criar uma tabuada de multiplicação.");
		n1 = teclado.nextInt();
		
		teclado.close();
		
		for (n=1; n <= 10; n++) {
		System.out.println( n1+"X"+n+"="+ n1*n );
		}
		
	}

}
