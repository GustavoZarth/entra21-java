import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio:");
		double raio = input.nextDouble();

		double area = (Math.PI * Math.pow(raio, 2));
		
		System.out.println("ÁREA DO CÍRCULO: " + area);
		
		input.close();
	}
}
