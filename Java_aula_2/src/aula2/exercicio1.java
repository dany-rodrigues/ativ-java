package aula2;

import java.util.Scanner;

public class exercicio1 {
	/*  

Para doar sangue é necessário ter idade maior que 20. Faça um 
programa que pergunte a idade de uma pessoa e exiba a informação 
se ela pode doar sangue ou não.  */

	public static void main(String[] args) 
	{ 
		int idade;
	Scanner teclado = new Scanner (System.in);
    System.out.println("Informe sua idade.");
    idade = teclado.nextInt();
    
    if ( idade >= 20)
		System.out.println("Você pode doar sangue.");
    else
        System.out.println("Você não pode doar sangue.");
     teclado.close();
	}

}
