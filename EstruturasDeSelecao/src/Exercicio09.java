import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite 3 cartas de 1 a 13");
		int carta1 = input.nextInt();
		int carta2 = input.nextInt();
		int carta3 = input.nextInt();
		
		int pontos = 0;
		
		if (carta1 >= 1 && carta1 <= 3) {
			pontos++;
		}
		if (carta2 >= 1 && carta2 <= 3) {
			pontos++;
		}
		if (carta3 >= 1 && carta3 <= 3) {
			pontos++;
		}
		
		if (pontos == 1) {
			System.out.println("TRUCO");
		} else if (pontos == 2) {
			System.out.println("SEIS");
		} else if (pontos == 3) {
			System.out.println("NOVE");
		}
		
		input.close();
	}
}
