package javaaula1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) 
	{
	/*Fazer um programa para calcular a �rea de um ret�ngulo. 
	 A f�rmula �: area = base * altura. Os valores devem ser 
	 digitados pelo usu�rio, bem como deve ser informado o 
	 que ele ir� digitar. */	
 
		Scanner teclado = new Scanner (System.in);
		float area, base, altura;
		
		System.out.println("Digite o valor da base do ret�ngulo.");
		base = teclado.nextFloat();
		System.out.println("Digite o valor da altura do ret�ngulo.");
		altura = teclado.nextFloat();
		
		area = base * altura;
		System.out.printf("O valor da �rea do ret�ngulo." + area);
		
		teclado.close();
	}

}
