import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("Digite dois números:");
		double num1 = input.nextInt();
		double num2 = input.nextInt();
		
		System.out.println("Digite a operação desejada:");
		System.out.println("1 - SOMA");
		System.out.println("2 - SUBTRAÇÃO");
		System.out.println("3 - MULTIPLICAÇÃO");
		System.out.println("4 - DIVISÃO");
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			System.out.println(num1 + num2);
		} else if (escolha == 2) {
			System.out.println(num1 - num2);
		} else if (escolha == 3) {
			System.out.println(num1 * num2);
		} else if (escolha == 4) {
			System.out.println(df.format(num1 / num2));
		}
		
		input.close();
	}
}
