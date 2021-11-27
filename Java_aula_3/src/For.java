import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		int i;
		int tabu = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite o número que será gerado a tabuada. ");
		tabu = teclado.nextInt();
		
		teclado.close();
		
		for (i=1 ; i <= 10; i++) {
		System.out.println(tabu+ "X" +i + "=" + (tabu*i));
        }

	}

}
