package javaaula1;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) 
	{
	/*Fazer um programa para calcular a área de um retângulo. 
	 A fórmula é: area = base * altura. Os valores devem ser 
	 digitados pelo usuário, bem como deve ser informado o 
	 que ele irá digitar. */	
 
		Scanner teclado = new Scanner (System.in);
		float area, base, altura;
		
		System.out.println("Digite o valor da base do retângulo.");
		base = teclado.nextFloat();
		System.out.println("Digite o valor da altura do retângulo.");
		altura = teclado.nextFloat();
		
		area = base * altura;
		System.out.printf("O valor da área do retângulo." + area);
		
		teclado.close();
	}

}
