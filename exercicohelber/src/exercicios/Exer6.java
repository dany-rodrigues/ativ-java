package exercicios;

import java.util.Scanner;

/*6. Tendo	 como	 entrada	 a	 altura	 e	 o	 sexo	 (codificado	 
 * da	 seguinte	 forma:	1:feminino	 	 2:masculino)	 de	 uma	 pessoa,	
 *  construa	 um	 programa	 que	calcule	e	imprima	seu	peso	ideal,	
 *  utilizando	as	seguintes		
Fórmulas:		
-	para	homens:	(72.7	*	Altura)	–	58		-	
para	mulheres:	(62.1	*	Altura)	–	44.7		*/
public class Exer6 {

	public static void main(String[] args)
	
	{
		Scanner teclado = new Scanner (System.in);
		
		int sexo;
		float alt;
		
		System.out.println("Digite [1] se você for do sexo Femenino.");
		System.out.println("Digite [2] se você for do sexo Masculino.");
		sexo = teclado.nextInt();
		
		System.out.println("Digite sua altura");
		alt = teclado.nextFloat();
       
		teclado.close();
            
		    if (sexo == 1 ) {
            System.out.printf("Seu peso ideal é: %.2f ", ((62.1*alt)-44.7));
           }
		    else {
		    	System.out.printf("Seu peso ideal é: %.2f ", ((72.7*alt)-58));
               }
		    }
	}

