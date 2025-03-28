import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double somaAltura = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite a altura da " + (i+1) + "ª pessoa");
			somaAltura += input.nextDouble();
		}
		
		System.out.println("A média de altura das 5 pessoas é de " + df.format((somaAltura / 5)));
		
		input.close();
	}
}

