import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		int inscricaoAlto = 0;
		int inscricaoBaixo = 0;
		int atletas = 0;
		int inscricao = 1;
		double altura = 0;
		double alturaAlto = 0;
		double alturaBaixo = 0;
		double somaAltura = 0;

		while (inscricao != 0) {
			System.out.println("Digite o número de inscrição do atleta:");
			inscricao = input.nextInt();

			if (inscricao == 0) {
				break;
			}

			System.out.println("Digite a altura do atleta");
			altura = input.nextDouble();

			somaAltura += altura;

			if (alturaAlto == 0) {
				alturaAlto = altura;
				inscricaoAlto = inscricao;
			} else if (altura > alturaAlto) {
				alturaAlto = altura;
				inscricaoAlto = inscricao;
			}

			if (alturaBaixo == 0) {
				alturaBaixo = altura;
				inscricaoBaixo = inscricao;
			} else if (altura < alturaBaixo) {
				alturaBaixo = altura;
				inscricaoBaixo = inscricao;
			}

			atletas++;
		}

		System.out.println("O atleta mais alto é o nº " + inscricaoAlto + " com " + df.format(alturaAlto) + "m");
		System.out.println("O atleta mais baixo é o nº " + inscricaoBaixo + " com " + df.format(alturaBaixo) + "m");
		System.out.println("A altura média do grupo é de " + (somaAltura / atletas));
		System.out.println("Quantidade de atletas cadastrados: " + atletas);

		input.close();
	}
}
