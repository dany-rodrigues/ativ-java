package exercicios;

import java.util.Scanner;

/* 2. Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 
 nascimento	 de	 uma	 pessoa	 e	escrever	 uma	 mensagem	 
 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano	
(não	é	necessário	considerar	o	mês	em	que	ela	nasceu). */

public class Exer2 {

	public static void main(String[] args) 
	
	{
		Scanner teclado = new Scanner (System.in);
		
		int anonasc;
		
		System.out.println("Digite os 4 dígitos do ano de seu nascimento ");
		anonasc = teclado.nextInt();
		
		teclado.close();
		
		if (anonasc <= 2013) {
			System.out.println("Você votará esse ano.");
		} else {
			System.out.println("Você não votará esse ano.");
		}

	}

}
