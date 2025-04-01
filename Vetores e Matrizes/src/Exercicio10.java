import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char homem[] = new char[5];
		char mulher[] = new char[5];
		int pontuacao = 0;
		
		System.out.println("Perguntas do homem:");
		
		for (int i = 0; i < homem.length; i++) {
			System.out.print("Pergunta " + (i + 1) + ": ");
			homem[i] = input.next().charAt(0);
		}
		
		System.out.println("Perguntas da mulher:");

		for (int i = 0; i < mulher.length; i++) {
			System.out.print("Pergunta " + (i + 1) + ": ");
			mulher[i] = input.next().charAt(0);
		}
		
		for (int i = 0; i < 5; i++) {
			if (homem[i] == mulher[i]) {
				pontuacao += 3;
			} else if ((homem[i] == 'i' && (mulher[i] == 'n' || mulher[i] == 's')) || mulher[i] == 'i' && (homem[i] == 'n' || homem[i] == 's')) {
				pontuacao +=1;
			} else {
				pontuacao -= 2;
			}
		}
		
		if (pontuacao == 15) {
			System.out.println("Casem!");
		} else if (pontuacao >= 10) {
			System.out.println("Vocês tem muita coisa em comum!");
		} else if (pontuacao >= 5) {
			System.out.println("Talvez não dê certo :(");
		} else if (pontuacao >= 0) {
			System.out.println("Vale um encontro.");
		} else if (pontuacao >= -9) {
			System.out.println("Melhor não perder tempo.");
		} else {
			System.out.println("Vocês se odeiam!");
		}
		
		input.close();
	}
}
