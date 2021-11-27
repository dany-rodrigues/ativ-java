package javaAula3;

import java.util.Scanner;

public class For {

	
	public static void main(String[] args) {
		
		int i;
		int tabu;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número para criar uma tabuada.");
        tabu = teclado.nextInt();
        
      for (i = 1; i<=10 ; i++); {
        
        System.out.println( tabu + "X" + i + " = " + (tabu*i));
        
        }	
      teclado.close();

	}

}
