import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int somaPares = 0; 
		int somaImpares = 0;
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				somaPares += i;
			} else {
				somaImpares += i;
			}
		}
		
		System.out.println(somaPares);
		System.out.println(somaImpares);
		
		input.close();
	}
}

