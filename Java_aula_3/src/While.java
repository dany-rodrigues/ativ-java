import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		 
		Scanner teclado = new Scanner (System.in);
        
		int i=1;
		int tabu;
		
		System.out.println("Digite um número para gerar a tabuada.");
		tabu = teclado.nextInt();
		
		teclado.close();
		
		while (i <= 10) {
			System.out.println(tabu+ "X" +i+ "=" + (tabu*i));
			i++;
		}
		
	}

}
