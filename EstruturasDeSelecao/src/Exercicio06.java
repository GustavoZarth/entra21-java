import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite a idade do nadador: ");
		int idade = input.nextInt();
		
		if (idade >= 5 && idade <= 7) {
			System.out.println("Pré-mirim");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("Mirim");
		} else if (idade >= 11 && idade <= 13) {
			System.out.println("Infantil");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Infanto-juvenil");
		} else if (idade >= 18 && idade <= 20) {
			System.out.println("Juvenil");
		} else if (idade >= 21) {
			System.out.println("Adultos");
		}
		
		input.close();
	}
}
