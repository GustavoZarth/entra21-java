import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int sexo[] = { 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1 };
		int notas[] = { 5, 3, 8, 1, 0, 7, 6, 9, 2, 10, 1, 6, 4, 3, 8, 2, 7, 0, 5, 4, 9, 10, 6, 3, 2, 5, 1, 4, 9, 7 };
		int idades[] = { 52, 41, 65, 28, 19, 33, 63, 27, 59, 13, 46, 70, 12, 54, 67, 51, 34, 55, 42, 66, 30, 60, 15, 31,
				49, 38, 20, 43, 56, 21 };
		double mediaGeral = 0;
		double mediaHomens = 0;
		int qtdHomens = 0;
		int mulherJovem = 0;
		int velhas = 0;

		for (int i = 0; i < notas.length; i++) {
			mediaGeral += notas[i];
		}

		System.out.println("Média do cinema: " + (mediaGeral / 30));

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 2) {
				mediaHomens += notas[i];
				qtdHomens++;
			}
		}

		System.out.println("Média dos homens: " + mediaHomens / qtdHomens);

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 1) {
				if (i != 0) {
					if (idades[i] < idades[mulherJovem]) {
						mulherJovem = i;
					} else if (idades[i] >= 50) {
						velhas++;
					}
				}
			}
		}
		
		System.out.println("Nota da mulher mais nova: " + mulherJovem);
		
		System.out.println("Quantidade de mulheres +50 que deram mais nota que a média: " + velhas);
		
		input.close();
	}
}


