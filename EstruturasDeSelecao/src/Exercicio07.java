import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o valor do ponto X: ");
		double x = input.nextInt();
		
		System.out.print("Digite o valor do ponto Y: ");
		double y = input.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Q1 - Quadrante 1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2 - Quadrante 2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3 - Quadrante 3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4 - Quadrante 4");
		
		input.close();
		}
	}
}
