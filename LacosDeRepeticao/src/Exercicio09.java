import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int homens = 0;
		int mulheres = 0;
		double alturaGeral = 0;
		double alturaHomens = 0;
		double alturaMulheres = 0;
		double altura = 1;

		while (altura != 0) {

			System.out.println("Digite a altura da pessoa");
			altura = input.nextDouble();

			if (altura == 0) {
				break;
			} else {
				alturaGeral += altura;
			}

			System.out.println("Digite o sexo da pessoa ('f' ou 'm'): ");
			char sexo = input.next().charAt(0);
			sexo = Character.toLowerCase(sexo);

			if (sexo == 'f') {
				alturaMulheres += altura;
				mulheres++;
			} else if (sexo == 'm') {
				alturaHomens += altura;
				homens++;
			}

		}

		System.out.println("Média de altura dos homens: " + df.format(alturaHomens / homens));
		System.out.println("Média de altura das mulheres: " + df.format(alturaMulheres / mulheres));
		System.out.println("Média de altura geral: " + df.format(alturaGeral / (homens + mulheres)));

		input.close();
	}
}
