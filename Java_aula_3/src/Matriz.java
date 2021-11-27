import java.util.Scanner;

//Fazer um programa para preencher uma matriz com informações numéricas.

public class Matriz {

	public static void main(String[] args) {
		
		int [] [] matriz = new int [2] [2]; //criação da matriz
		
		Scanner entrada = new Scanner(System.in); // criação da classe scanner
		 System.out.println("Matriz [2] [2] \n");
		
		   for (int linha = 0; linha < 2; linha++)
		   {
			for (int coluna = 0; coluna < 2; coluna++) 
			{
				System.out.printf ("Insira o elemento M[%d] [%d]" , linha +1, coluna +1 ); //entrada de dados da matriz
				matriz [linha] [coluna] = entrada.nextInt();
			entrada.close();
		}		
				
	}

}
}