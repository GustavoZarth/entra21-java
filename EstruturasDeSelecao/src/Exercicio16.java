import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a nota 1");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a nota 2");
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a nota 3");
		double nota3 = input.nextDouble();
		
		System.out.println("Digite a nota dos exercícios");
		double notaExercicios = input.nextDouble();
		
		double media = ((nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7);
		
		if (media >= 9) {
			System.out.println("A - APROVADO");
		} else if (media >= 7.5) {
			System.out.println("B - APROVADO");
		} else if (media >= 6) {
			System.out.println("C - APROVADO");
		} else if (media >= 4) {
			System.out.println("D - REPROVADO");
		} else {
			System.out.println("E - REPROVADO");
		}
		
		input.close();
	}
}