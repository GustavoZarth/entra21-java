import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite quantos dólares você quer trocar:");
		double dolares = input.nextDouble();
		
		double precoDolar = 5.75;
		double reais = dolares * precoDolar;
		
		System.out.println("Você trocou U$ " + df.format(dolares) + " por R$ " + df.format(reais));
				
		input.close();
	}
}
