import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite a massa da pessoa:");
		double massa = input.nextDouble();
		
		System.out.println("Digite a altura da pessoa:");
		double altura = input.nextDouble();

		double imc = massa / Math.pow(altura, 2);
		
		if (imc < 18.5) {
			System.out.println(df.format(imc) + " - Magreza");
		} else if (imc <= 24.9) {
			System.out.println(df.format(imc) + " - Saudável");
		} else if (imc <= 29.9) {
			System.out.println(df.format(imc) + " - Sobrepeso");
		} else if (imc <= 34.9) {
			System.out.println(df.format(imc) + " - Obesidade Grau I");
		} else if (imc <= 39.9) {
			System.out.println(df.format(imc) + " - Obesidade Grau II (Severa)");
		} else if (imc >= 40) {
			System.out.println(df.format(imc) + " - Obesidade Grau III (Mórbida)");
		}
		
		input.close();
	}
}
