/* Escreva	 um	 programa	 que	 verifique	 a	 validade	
	  de	 uma	 senha	 fornecida	pelo	 usu�rio.	 
	  A	 senha	 v�lida	 �	 o	 n�mero	 1234.	Devem	 ser	impressas	 as	
seguintes	mensagens:	ACESSO	PERMITIDO	caso	a	senha	seja	v�lida.	
 ACESSO	NEGADO	caso	a	senha	seja	inv�lida. */

package exercicios;

import java.util.Scanner;

public class Exer3 {
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		
		int senha;
		
		System.out.println("Digite a senha");
		senha = teclado.nextInt();
	
		teclado.close();
		
		if (senha == 1234) {
			System.out.println("ACESSO	PERMITIDO");
		} else {
			System.out.println("ACESSO	NEGADO");
		}

	}

}
