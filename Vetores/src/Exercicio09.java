import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int vetor3[] = new int[10];
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.println("Digite um valor para o índice " + i + " do vetor 1");
			vetor1[i] = input.nextInt();
		}
	
		for (int i = 0; i < vetor2.length; i++) {
			System.out.println("Digite um valor para o índice " + i + " do vetor 2");
			vetor2[i] = input.nextInt();
		}
		
		System.out.println("\nVetor 1:");
		
		for (int i = 0; i < vetor1.length; i++) {
			System.out.print(vetor1[i] + ", ");
		}
		
		System.out.println("\nVetor 2:");
		
		for (int i = 0; i < vetor2.length; i++) {
			System.out.print(vetor2[i] + ", ");
		}
		
		System.out.println("\nVetor 3:");
		
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
			System.out.print(vetor3[i] + ", ");
		}
		
		input.close();
	}
}
