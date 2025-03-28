import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número inteiro:");
			num = input.nextInt();
			
			if (num % 2 == 0) {
				System.out.println("O número " + num + " é par\n");
			} else {
				System.out.println("O número " + num + " é ímpar\n");				
			}
		}
		
		input.close();
	}
}
