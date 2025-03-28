import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o dia:");
		int dia = input.nextInt();

		if (dia < 1 || dia > 31) {
			System.out.println("Dia inválido");
		} else {
			System.out.println("Digite o mês:");
			int mes = input.nextInt();

			if (mes < 1 || mes > 12) {
				System.out.println("Mês inválido");
			} else if (mes == 2 && dia > 29) {
				System.out.println("Mês inválido");
			} else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
				System.out.println("Mês inválido");
			} else {
				System.out.println("Digite o ano:");
				int ano = input.nextInt();

				if (mes == 2 && dia == 29 && ano % 4 != 0) {
					System.out.println("Ano inválido");
				} else {
					System.out.println(dia + "/" + mes + "/" + ano);
				}

			}
		}

		input.close();

	}
}
