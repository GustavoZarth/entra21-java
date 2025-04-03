import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int numeros[] = { 10, 85, 32, 17, 54 };

		int maior = 0;
		int menor = 0;
		int media = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (maior == 0) {
				maior = numeros[i];
			} else if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			if (menor == 0) {
				menor = numeros[i];
			} else if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		
		media = (media / numeros.length);
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Média: " + media);

		input.close();
	}
}
