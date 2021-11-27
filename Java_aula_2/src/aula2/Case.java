package aula2;
/*Crie uma variável chamada “fruta”. Esta variável deve receber uma string com
 * o nome de uma fruta. Após, crie uma estrutura condicional switch que receba 
 * esta variável e que possua três casos: caso maçã, retorne no console: 
 * “Não vendemos esta fruta aqui”. Caso kiwi, retorne: “Estamos com escassez de kiwis” 
 * e caso melancia, retorne: “Aqui está, são 3 reais o quilo”. 
 * Teste com estas três opções e verifique o console do seu navegador. 
 * Crie também um default, que retornará uma mensagem de erro no console.*/

import java.util.Scanner;

public class Case {

	public static void main(String[] args) 
	
	{
	 Scanner teclado = new Scanner (System.in);
	 String fruta;
	 fruta = "melancia";
	 
	 System.out.println("Qual fruta você quer comprar?");
	 fruta = teclado.nextLine();
	 
	 teclado.close();
		switch(fruta) {
		case "maçã":
			System.out.println("Não vendemos esta fruta aqui.");
			break;
		case "kiwi":
			System.out.println("Estamos com escassez de Kiwis.");
			break;
		case "melancia":
			System.out.println("Aqui está, são R$ 3,00 o quilo.");
			break;
			default:
				System.out.println("Não há em estoque.");
				break;
		}
	 

	}

}
