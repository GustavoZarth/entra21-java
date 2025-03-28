import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = input.nextInt();
		
		System.out.println("Digite a opção desejada:");
		System.out.println("1 - SOMA 10");
		System.out.println("2 - SUBTRAI 10");
		System.out.println("3 - MULTIPLICA 10");
		System.out.println("4 - DIVIDE 10");
		int escolha = input.nextInt();
		
		if (escolha == 1) {
			System.out.println(numero + 10);
		} else if (escolha == 2) {
			System.out.println(numero - 10);
		} else if (escolha == 3) {
			System.out.println(numero * 10);
		} else if (escolha == 4) {
			System.out.println(numero / 10);
		}
		
		input.close();
	}
}
