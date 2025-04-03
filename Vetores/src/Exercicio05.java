import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int[10];
		
		System.out.println("Digite o número a ser atribuído a esse índice: ");
		int valor = input.nextInt();

		System.out.println("Digite um índice (0 a 10): ");
		int indice = input.nextInt();
		
		while (indice < 0 || indice > numeros.length) {
			System.out.println("Por favor digite um índice válido");
			indice = input.nextInt();
		}
		
		numeros[indice] = valor;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + ", ");
		}
		
		input.close();
	}
}
