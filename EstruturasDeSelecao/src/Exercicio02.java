import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o valor de A:");
		int a = input.nextInt();
		
		System.out.println("Digite o valor de B");
		int b = input.nextInt();
		
		if (a % b == 0) {
			System.out.println("A é múltiplo de B");
		} else {
			System.out.println("A não é múltiplo de B");
		}
		
		input.close();
	}
}
