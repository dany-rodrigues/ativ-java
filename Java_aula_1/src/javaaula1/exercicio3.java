package javaaula1;

import java.util.Scanner;

public class exercicio3 
{
	
/*Fazer um programa para que o usu�rio informe uma temperatura em 
 * graus Celsius e transforme em graus Fahrenheit.
 *  Exibir o resultado da convers�o. Formula:  F = (9*C+160)/5 */
	public static void main(String[] args) 
	
	{
		Scanner teclado = new Scanner (System.in);
		int celsius, fahrenheit;
		
		System.out.println("Informe a temperatura C�");
		celsius = teclado.nextInt();
		
		fahrenheit = (9*celsius+160)/5;
		
		System.out.println("A convers�o da temperatura para Fahrenheit �:" + fahrenheit + " F�");
    teclado.close();
	}

}
