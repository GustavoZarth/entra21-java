import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeros[] = new int[100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i * i;
			System.out.println("[" + i + "] = " + numeros[i] );
		}
		
		input.close();
	}
}
