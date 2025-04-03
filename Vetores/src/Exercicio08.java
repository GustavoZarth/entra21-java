import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double valores[] = new double[5];
		double media = 0;

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um valor: ");
			valores[i] = input.nextDouble();
			media += valores[i];
		}

		media = media / valores.length;

		for (int i = 0; i < valores.length; i++) {
			if (valores[i] > media) {
				System.out.println(valores[i] + ", ");
			}
		}

		input.close();
	}
}
