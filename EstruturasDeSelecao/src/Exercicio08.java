import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o ano de nascimento do primeiro irmão: ");
		int ano1 = input.nextInt();
		
		System.out.print("Digite o ano de nascimento do segundo irmão: ");
		int ano2 = input.nextInt();
		
		System.out.print("Digite o ano de nascimento do terceiro irmão: ");
		int ano3 = input.nextInt();
		
		if (ano1 == ano2 && ano2 == ano3) {
			System.out.println("TRIGÊMEOS");
		} else if (ano1 == ano2 || ano2 == ano3) {
			System.out.println("GÊMEOS");
		} else {
			System.out.println("APENAS IRMÃOS");
		}
		
		input.close();
	}
}
