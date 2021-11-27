package exercicios;

import java.util.Scanner;

/*Escreva	um	programa	para	ler	o	número	de	lados	de	um	polígono	
 * regular	e	a	medida	do	lado	(em	cm).	Calcular	e	imprimir	o	
 * seguinte:		
−       Se	o	número	de	lados	for	igual	a	3	escrever	TRIÂNGULO	e	
o	valor	da	área	
−       Se	o	número	de	lados	for	igual	a	4	escrever	QUADRADO	e	
o	valor	da	sua	área.		
−       Se	o	número	de	lados	for	igual	a	5	escrever	PENT�?GONO.	*/
public class Exer7 {

	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner (System.in);
		
		int nLado, cLado;
		float vArea;
		
		System.out.println("Quantos lados o polígano possui?");
		nLado = teclado.nextInt();
		
		while( nLado<=2  || nLado>=6 ) {
			System.out.println("Digite um numero de lados maior que 2 e menor que 6.");
			nLado = teclado.nextInt();
		} 
		
		System.out.println("Quantos centímetros o lado do polígano possui?");
		cLado = teclado.nextInt();
		
		teclado.close();
		
	 if (nLado == 3) {
		 System.out.printf("TRIÂNGULO e o valor da área é: %.1f cm",vArea = ((cLado/2)*cLado/2));
	 }	else 
	 {if (nLado == 4) {
		 System.out.printf("QUADRADO e o valor da área é: %.1f cm",  vArea = cLado *cLado/2);
	 } else {
		 System.out.println("PENT�?GONO");
	 }
		 }
	   
	}
		 }
	

	
	


	
