package aula2;

import java.util.Scanner;

public class exercicio1 {
	/*  

Para doar sangue � necess�rio ter idade maior que 20. Fa�a um 
programa que pergunte a idade de uma pessoa e exiba a informa��o 
se ela pode doar sangue ou n�o.  */

	public static void main(String[] args) 
	{ 
		int idade;
	Scanner teclado = new Scanner (System.in);
    System.out.println("Informe sua idade.");
    idade = teclado.nextInt();
    
    if ( idade >= 20)
		System.out.println("Voc� pode doar sangue.");
    else
        System.out.println("Voc� n�o pode doar sangue.");
     teclado.close();
	}

}
