import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = {3, 6, 9, 12, 15};

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[numeros.length - (i + 1)]);
		}
		
		input.close();
	}
}
