package exercicios;

import java.util.Scanner;

/*1. Escreva um	 programa para ler	2 valores	
(considere	 que n?o ser?o informados valores	iguais)	e escrever o maior deles.*/

public class Exer1 {

	public static void main(String[] args) 
	
	{
	
		Scanner teclado = new Scanner (System.in);
		
		int n1, n2;
	
	
	System.out.println("Digite um n?mero.");
	n1 = teclado.nextInt();
    System.out.println("Digite outro n?mero");
    n2 = teclado.nextInt();
	teclado.close();
	
	if (n1 > n2) {
		System.out.println(n1 + " ? maior que " + n2);
	} else {
			System.out.println(n2 +" ? maior que " + n1);
			
		}
	}
}
	
	
   
	
	

