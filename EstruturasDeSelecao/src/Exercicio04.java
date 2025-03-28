import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um caractere:");
		char caractere = input.next().charAt(0);
		caractere = Character.toLowerCase(caractere);
		
		if (caractere == 'm') {
			System.out.println("Masculino");
		} else if (caractere == 'f') {
			System.out.println("Feminino");
		} else if (caractere == 'i') {
			System.out.println("Não informado");
		} else {
			System.out.println("Entrada Incorreta");
		}
		
		input.close();
	}
}
