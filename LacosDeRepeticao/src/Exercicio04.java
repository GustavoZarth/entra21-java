import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Digite um número de 0 a 1000");
			int numero = input.nextInt();
			
			while (numero < 0 || numero > 1000) {
				System.out.println("Por favor, digite um número de 0 a 1000");
				numero = input.nextInt();
			}
			
			System.out.println(numero + "\n");
			
		}
		
		input.close();
	}
}

