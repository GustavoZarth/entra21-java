import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de meses que o funcionário foi admitido:");
		int meses = input.nextInt();
		
		if (meses < 12) {
			System.out.println("O funcionário vai receber reajuste de 5%");
		} else if (meses >= 13 && meses <= 48) {
			System.out.println("O funcionário vai receber reajuste de 7%");
		} else {
			System.out.println("O funcionário não vai receber reajuste");
		}
		
		input.close();
	}
}
