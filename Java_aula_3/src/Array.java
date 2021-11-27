import java.util.Scanner;

public class Array {

	public static void main(String[] args) 
	
	{
		int[] num = new int[5];

        for(int i = 0; i < 5; i++) {
            System.out.println("Informe o numero : " + (i + 1) + "º valor");
            
            Scanner teclado = new Scanner(System.in);
            
			num[i] = teclado.nextInt();
			teclado.close();
        }

        System.out.println("Valores armazenados ");

        for(int i = 0; i < 5; i++) {
            System.out.println("Valor na posição " + i + " = " + num[i]);
		

	}

}
}
