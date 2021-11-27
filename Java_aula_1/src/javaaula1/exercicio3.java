package javaaula1;

import java.util.Scanner;

public class exercicio3 
{
	
/*Fazer um programa para que o usuário informe uma temperatura em 
 * graus Celsius e transforme em graus Fahrenheit.
 *  Exibir o resultado da conversão. Formula:  F = (9*C+160)/5 */
	public static void main(String[] args) 
	
	{
		Scanner teclado = new Scanner (System.in);
		int celsius, fahrenheit;
		
		System.out.println("Informe a temperatura Cº");
		celsius = teclado.nextInt();
		
		fahrenheit = (9*celsius+160)/5;
		
		System.out.println("A conversão da temperatura para Fahrenheit é:" + fahrenheit + " Fº");
    teclado.close();
	}

}
