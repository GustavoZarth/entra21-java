import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idades[] = new int[4];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite a idade do familiar:");
			idades[i] = input.nextInt();
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Idade familiar " + (i + 1) + ": " + idades[i]);
		}
		
		input.close();
	}
}
