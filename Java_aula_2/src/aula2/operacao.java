package aula2;

import java.util.Scanner;

public class operacao {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);

		int n1, n2;
		int sinal;
		
		System.out.println("Digite um valor.");
		n1 = teclado.nextInt();
		
		System.out.println("Digite outro valor.");
		n2 = teclado.nextInt();
		
		System.out.println("DIGITE [1]  PARA SOMAR" );
		System.out.println("DIGITE [2]  PARA SUBTRAIR" );
		System.out.println("DIGITE [3]  PARA MULTIPLICAR" );
		System.out.println("DIGITE [4]  PARA DIVIDIR" );
		sinal = teclado.nextInt();
		
		teclado.close();
	
		switch (sinal) {

		case 1:
			System.out.println("O resultado de " + n1 + "+" + n2 +" = " + (n1+n2));
			break;
		case 2:
			System.out.println("O resultado de " + n1 + "-" + n2 +" = " + (n1-n2));
			break;
		case 3:
			System.out.println("O resultado de " + n1 + "*" + n2 +" = " + (n1*n2));
			break;
			
		case 4:
			System.out.println("O resultado de " + n1 + "/" + n2 +" = " + (n1/n2));
			
		default:
			System.out.println("Numero invalido " );
			break;
	}

	}
	}
