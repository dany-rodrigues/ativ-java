package javaaula1;

import java.util.Scanner; /* para habilitar o teclado*/

public class javaaula1 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		
		String nome;
		float salario; /* declarando variavel*/
		int idade;
		
		System.out.println ("Digite seu nome.");
		nome = teclado.nextLine();
		System.out.println ("Digite sua idade.");
		idade = teclado.nextInt();
	    System.out.println ("Digite seu salário"); /* sinal de + é usado para separar*/
	    salario = teclado.nextFloat();
	    System.out.println("Olá " + nome +" você tem " + idade + " anos, e recebe R$" + salario +" mensal");
	    teclado.close(); /* sempre fechar o teclado*/

	}

}
