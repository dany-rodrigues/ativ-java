package exercicios;

import java.util.Scanner;

/* 4. As ma��s	custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma	
d�zia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um	
programa	 que	 leia	 o	 n�mero	 de	 ma��s	 compradas,	 calcule	 e	 escreva	 o	
valor	total	da	compra.*/

public class Exer4 {

	public static void main(String[] args) 
	
	{
		Scanner teclado = new Scanner (System.in);
		
		int frutaUnid; //
	
		System.out.println(" Digite quantidade de ma��s que o cliente est� comprando");
		frutaUnid = teclado.nextInt();
		
		teclado.close();                //ao declarar um valor usa-se (,) e n�o o siinal de +
                                       //%.2f faz com que aparece apenas 2 casas decimais.
		 if ( frutaUnid <= 11) {        
		System.out.printf("Valor de " + frutaUnid +  " ma��s R$ %.2f " , (frutaUnid * 0.30));
	} else {
		System.out.printf("Valor de " + frutaUnid + " ma��s R$ %.2f " , (frutaUnid * 0.25));

           }
}
}
