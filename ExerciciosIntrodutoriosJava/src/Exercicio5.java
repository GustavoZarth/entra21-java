import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Digite a primeira nota:");
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		double nota2 = input.nextDouble();
		
		double mediaPond = ((nota1 * 3.5 + nota2 * 6.5) / 10);
		
		System.out.println("MÉDIA FINAL: " + df.format(mediaPond));
		
		input.close();
	}
}
