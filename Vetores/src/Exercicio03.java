import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int primos[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 };

		System.out.println("Digite um número de 0 a 50");
		int numero = input.nextInt();

		if (numero < 0 || numero > 50) {
			System.out.println("Número inválido.");
		} else {
			for (int i = 0; i < primos.length; i++) {
				if (numero == primos[i]) {
					System.out.println("O número digitado é primo");
					break;
				} else if (i == primos.length - 1) {
					System.out.println("O número digitado não é primo");
				}
			}
		}

		input.close();
	}
}
