import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um nome:");
		String nome = input.next();
		
		if (nome.equalsIgnoreCase("Gustavo")) {
			System.out.println("Nome correto");
		} else {
			System.out.println("Nome errado");
		}
		
		input.close();
	}
}
