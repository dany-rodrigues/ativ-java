package exercicios;

import java.util.Scanner;

/* 2. Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 
 nascimento	 de	 uma	 pessoa	 e	escrever	 uma	 mensagem	 
 que	 diga	 se	 ela	 poder�	 ou	 n�o	 votar	 este	 ano	
(n�o	�	necess�rio	considerar	o	m�s	em	que	ela	nasceu). */

public class Exer2 {

	public static void main(String[] args) 
	
	{
		Scanner teclado = new Scanner (System.in);
		
		int anonasc;
		
		System.out.println("Digite os 4 d�gitos do ano de seu nascimento ");
		anonasc = teclado.nextInt();
		
		teclado.close();
		
		if (anonasc <= 2013) {
			System.out.println("Voc� votar� esse ano.");
		} else {
			System.out.println("Voc� n�o votar� esse ano.");
		}

	}

}
