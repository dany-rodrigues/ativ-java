package exercicios;

import java.util.Scanner;

/* 5. Escreva	 um	 programa	 para	 ler	 3	 valores	 inteiros	 (considere	 que não	
serão	lidos	valores	iguais)	e	escrevê-los	em	ordem	crescente.*/


public class Exer5 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		 
		int n1, n2, n3;
		                                                                         	                                                                             
		System.out.println("Digite um número.");
		n1 = teclado.nextInt();
		System.out.println("Digite outro número.");
		n2 = teclado.nextInt();
		System.out.println("Digite mais um número.");
		n3 = teclado.nextInt();
		
        teclado.close();
        
        if ( n1 == n2 || n1 == n3 || n2 == n3) {
        System.out.println("Você digitou números iguais. Tente novamente.");
       } else 
    	    {if (n1 < n2 && n2 < n3 && n1 < n2 ) {
        		   System.out.println( "A ordem crescente  dos número digitados é: "+n1+","+n2+" e "+n3);
    		   
        	   } else 
       	    {if (n1 < n2 && n3 < n1 && n3 < n2 ) {
     		   System.out.println( "A ordem crescente dos número digitados é: "+n3+","+n1+" e "+n2);
 		   
                }else
                  {if (n2 < n3 && n3 < n1 && n2 < n3 ) {
     		   System.out.println( "A ordem crescente  dos número digitados é: "+n2+","+n3+" e "+n1);
                 
                }else
                  {if (n3 < n2 && n2 < n1 && n3 < n1 ) {
     		   System.out.println( "A ordem crescente  dos número digitados é: "+n3+","+n2+" e "+n1);
     		   
                } else {
                	System.out.println("A ordem crescente dos número digitados é: " +n2+","+n1+" e "+ n3);
}
	}
	}
    	    }
}
}
}