package aula2;
/*Crie uma vari�vel chamada �fruta�. Esta vari�vel deve receber uma string com
 * o nome de uma fruta. Ap�s, crie uma estrutura condicional switch que receba 
 * esta vari�vel e que possua tr�s casos: caso ma��, retorne no console: 
 * �N�o vendemos esta fruta aqui�. Caso kiwi, retorne: �Estamos com escassez de kiwis� 
 * e caso melancia, retorne: �Aqui est�, s�o 3 reais o quilo�. 
 * Teste com estas tr�s op��es e verifique o console do seu navegador. 
 * Crie tamb�m um default, que retornar� uma mensagem de erro no console.*/

import java.util.Scanner;

public class Case {

	public static void main(String[] args) 
	
	{
	 Scanner teclado = new Scanner (System.in);
	 String fruta;
	 fruta = "melancia";
	 
	 System.out.println("Qual fruta voc� quer comprar?");
	 fruta = teclado.nextLine();
	 
	 teclado.close();
		switch(fruta) {
		case "ma��":
			System.out.println("N�o vendemos esta fruta aqui.");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de Kiwis.");
			break;
		case "melancia":
			System.out.println("Aqui est�, s�o R$ 3,00 o quilo.");
			break;
			default:
				System.out.println("N�o h� em estoque.");
				break;
		}
	 

	}

}
